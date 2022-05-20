Feature: Logged in
  Scenario: the user log in successfully
    Given the user is on the login page
    And the user log in
    Then the user navigate to the stream page
