@smoke
Feature: F01_Register | User could register with valid data
  Scenario: guest user could register with valid data successfully
  Given user goes to register page
  And user selects gender type
  When user enters first name "Muhammed"
  And user enters last name "Elbanna"
  And user enter date of birth
  And user enters an Email
  And user enters a Password
  And user clicks on register button
  Then success message is displayed
