package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.ProductPage;
import org.example.pages.SearchResultPage;
import org.testng.asserts.SoftAssert;

public class SearchStepDef {
    HomePage homePage = new HomePage();
    SearchResultPage searchResultPage = new SearchResultPage();
    ProductPage productPage = new ProductPage();
    SoftAssert softAssert = new SoftAssert();

    @Given("user search by {}")
    public void enterProductName(String productName){
        homePage.searchForProduct().sendKeys(productName);
    }

    @When("user click on Search button")
    public void selectTheSearchedProduct() {
        homePage.clickOnSearch().click();
    }

    @And("user click on product link")
    public void selectProduct(){
        searchResultPage.clickOnProduct().click();
    }
    @Then("check that URL is changed")
    public void checkThatUrlIsChanged(){
      String actualResult = homePage.checkTheNewUrl();
        softAssert.assertTrue(actualResult.contains("https://demo.nopcommerce.com/search?q="));
    }
    @And("check number of search results")
    public void verifyTheResultsContainsSearchWord(){
        String expectedResult = homePage.checkCountNumberOfSearchResults();
        String actualResult = searchResultPage.getTextValue();

        System.out.println(expectedResult);
        softAssert.assertTrue(actualResult.contains(expectedResult));
    }



    @Then("check Sku is matching with the search keyword")
    public void verifySkuIsMatchingWithSearchKeyWord(){
        String expectedResult = productPage.getSkuText();
        
        System.out.println(expectedResult);
    }
}
