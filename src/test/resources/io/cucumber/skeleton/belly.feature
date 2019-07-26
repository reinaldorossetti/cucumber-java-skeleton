Feature: Belly

   @cukesY
  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should "growl"

   @cukesX
  Scenario: a few cukes
    Given I have X cukes in my belly
    When I wait X hour
    Then my belly should X