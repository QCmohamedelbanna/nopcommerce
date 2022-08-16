@smoke
Feature: F03_Search | Logged User could search for any product
  Scenario Outline: user could search by Product Name
    Given user search by <ProductName>
    When user click on Search button
    Then check that URL is changed
    And check number of search results
    Examples:
      |ProductName|
      |book|
      |laptop|
      |nike|

  Scenario Outline: user could search for product using sku
    Given user search by <ProductName>
    When user click on Search button
    And  user click on product link
    Then check Sku is matching with the search keyword
    Examples:
      |ProductName|
      |AP_MBP_13|
      |AS_551_LP|
      |NK_FRC_RS|