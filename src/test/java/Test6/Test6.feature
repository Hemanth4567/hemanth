Feature: Working of calculator
  I want to add two numbers
  
  Scenario: Add two numbers
    Given I enter 20 in the calculator
    And I press add
    Then I have entered 20 in the calculator
    When  I press equal symbol
    Then The result should be 40 in the screen

  Scenario: Subtract two numbers
    Given I enter 200 in the calculator
    And I press subtract
    Then I have entered 50 in the calculator
    When  I press equal symbol
    Then The result should be 150 in the screen