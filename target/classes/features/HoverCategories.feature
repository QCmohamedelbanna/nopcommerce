@smoke
  Feature: We have to make sure that system are able to hover and select one of categories by default and click on its subcategory
    Scenario: Hover on one of categories and click on its subcategory
      Given user hover on one of three categories and click on its subcategory
      When user click on Subcategory link
      Then check that the selected subcategory is matching with page title