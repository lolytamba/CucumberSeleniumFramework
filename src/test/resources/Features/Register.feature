Feature: Register user
  Scenario: the user can register successfully
    Given the user is on the register page
    And the user must be fill all the fields
    Then the web successfully create account
