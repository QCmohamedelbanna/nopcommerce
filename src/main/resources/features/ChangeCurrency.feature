@smoke
Feature: F03_Change Currency | User could be able to change Currency
  Scenario: user change currency successfully
    Given user clicks on Currency DDL
    When user select another currency
    Then system display the selected currency