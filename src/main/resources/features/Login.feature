@smoke
Feature: F02_Login | User could log in with valid email and password
  Background:
    Given user goes to Login page
    And user clicks on "Login" button

  Scenario: Login user could Login with valid email and Password successfully
    When user enters "itmohamedelbanna@gmail.com" and "P@ssw0rd"
    And  user clicks on "Login" button
    Then user logins successfully to the system

  Scenario: user could login with invalid email and password
    When user enters "test@tes.com" and "Testing"

    Then user could not login to the system