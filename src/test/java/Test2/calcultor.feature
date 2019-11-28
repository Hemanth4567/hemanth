Feature: Working of calculator
  I want to add two numbers
  
  Scenario: Add two numbers
    Given I enter 20 in the calculator
    And I press add
    Then I have entered 20 in the calculator
    When  I press equal symbol
    Then The result should be 40 in the screen
