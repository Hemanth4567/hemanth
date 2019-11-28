Feature: Working of Testmeapp
  I want to open the testme app through login credential 

  @tag1
  Scenario: Testme app
    Given Load the firefox driver jar
    And create object and open testme_app
    Then maximize the window
    And click the signin link
    Then Enter the username in the username field
    And Enter the password in the password field
    And click the Login button
    Then click on signout link
    And close the chrome browser
    

  