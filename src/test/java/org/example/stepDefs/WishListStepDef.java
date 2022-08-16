package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.example.pages.HomePage;
import org.example.pages.WishlistPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class WishListStepDef {
    HomePage homePage = new HomePage();
    WishlistPage wishlistPag = new WishlistPage();
    String expectedResult;
    String actualResult;
    SoftAssert softAssert = new SoftAssert();

    @Given("users click on Wishlist button")
    public void clickOnAddWishlistBtn(){
        homePage.addToWishlistBtn().click();
    }

    @Then("Check that successfully message displayed")
    public void checkThatSuccessMessageDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        expectedResult = "The product has been added to your ";
        actualResult = homePage.successfulMessageText().getText();

        System.out.println(expectedResult + " and  " + actualResult);
        softAssert.assertEquals(expectedResult,actualResult);

        String expectedColor = homePage.backGroundColor().getCssValue("background-color");
        String actualColor = Color.fromString("#4bb07a").asRgba();
        System.out.println(expectedColor);
        System.out.println(actualColor);

        softAssert.assertEquals(expectedColor,actualColor );



    }

    @When("user go to Wishlist page")
    public void clickOnWishlistLink()  {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(homePage.successfulMessageText()));
        homePage.wishListLink().click();
    }
    @Then("user check that the product added successfully")
    public void checkThatProductAddedSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
       String actualQuantity=  wishlistPag.quantityValue().getAttribute("value");
        String expectedQuantity = "0";
        System.out.println(actualQuantity);
        Assert.assertNotEquals(actualQuantity,expectedQuantity);



    }
}
