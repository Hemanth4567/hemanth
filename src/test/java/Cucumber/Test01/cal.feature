Feature: Working of calculator
  I want to add two numbers
  
  Scenario: Add two numbers
    Given I enter 50 in the calculator
    And I press add
    Then I have entered 50 in the calculator
    When  I press equal symbol
    Then The result should be 100 in the screen

 