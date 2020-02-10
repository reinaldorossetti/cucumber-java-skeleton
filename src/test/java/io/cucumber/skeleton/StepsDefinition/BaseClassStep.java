package io.cucumber.skeleton.StepsDefinition;

import io.cucumber.java.Status;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventHandler;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestRunFinished;
import io.cucumber.plugin.event.TestRunStarted;

import java.util.ArrayList;
import java.util.List;

public class BaseClassStep implements ConcurrentEventListener {

    public static int value = 0;
    public static List<String> listOfString = new ArrayList<String>();

    public Integer getCountTest(){
        return value = value + 1;
    }

    public ArrayList addItem(String item1, Status item2){
        listOfString.add(item1 + " => " + item2);
        return (ArrayList) listOfString;
    }

    @Override
    public void setEventPublisher(EventPublisher eventPublisher) {
        eventPublisher.registerHandlerFor(TestRunStarted.class, setup);
        eventPublisher.registerHandlerFor(TestRunFinished.class, teardown);
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