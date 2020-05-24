package io.cucumber.skeleton.Features.Steps;

import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.*;

public class BaseClassStep implements ConcurrentEventListener {

    private static String testDescription;

    public String getStepText() {
        return testDescription;
    }

    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunStarted.class, setup);
        eventPublisher.registerHandlerFor(TestRunFinished.class, teardown);

        eventPublisher.registerHandlerFor(TestStepStarted.class, new EventHandler<TestStepStarted>() {
            @Override
            public void receive(TestStepStarted event) {
                if (event.getTestStep() instanceof PickleStepTestStep) {
                    final PickleStepTestStep test_step = (PickleStepTestStep) event.getTestStep();
                    testDescription = test_step.getStep().getText();
                }
            }
        });
    }

    private EventHandler<TestRunStarted> setup = event -> {
        beforeAll();
    };

    private void beforeAll() {
        System.out.println("in before all");
    }

    private EventHandler<TestRunFinished> teardown = event -> {
        afterAll();
    };

    private void afterAll() {
        System.out.println("in after all");
    }

}