Feature: Belly

   @cukesFlaky
   Scenario: Test Flaky
    Given I have 42 cukes in my belly
    When I wait 1.30 hour
    Then my belly should growl

  @cukesBroken
  Scenario: Broken test
    Given I have 42 cukes in my belly
    When I wait 1.30 hour
    Then my belly should crash

  @cukesFailed
  Scenario: Failed test
    Given I have 42 cukes in my belly
    When I wait 1.30 hour
    Then my belly should "growl"

   @cukesPassed
  Scenario: Passed test
    Given I have X cukes in my belly
    When I wait X hour
    Then my belly should X