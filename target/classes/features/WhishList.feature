@smoke
  Feature: Add Product to wishlist and check that added successfully
    Background:
      Given users click on Wishlist button

    Scenario: Add product to wishlist and check that successfully message displayed that added well
      Then Check that successfully message displayed

    Scenario: Add Product to wishlist and check that the product is added successfully
      When user go to Wishlist page
      Then user check that the product added successfully