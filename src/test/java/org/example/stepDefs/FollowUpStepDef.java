package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Hook;
import org.example.pages.HomePage;
import org.testng.Assert;

import java.util.ArrayList;

public class FollowUpStepDef {
    HomePage homePage = new HomePage();
    String expectedResult;
    String actualResult;


    @Given("user click on Facebook link")
    public void clickOnFacebookLink(){
        homePage.faceBook().click();
    }

    @Then("make sure that user directed to Facebook page")
    public void checkThatFacebookPageIsDisplayed(){
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        expectedResult = "https://www.facebook.com/nopCommerce";
        actualResult = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Given("user click on Twitter link")
    public void clickOnTwitterLink(){
        homePage.twitter().click();
    }

    @Then("make sure that user directed to Twitter page")
    public void checkThatTwitterPageIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        expectedResult = "https://twitter.com/nopCommerce";
        actualResult = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Given("user click on RSS link")
    public void clickOnRssLink(){
        homePage.rss().click();
    }

    @Then("make sure that user directed to RSS page")
    public void checkThatRssPageIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabs.get(0));
        expectedResult = "https://demo.nopcommerce.com/new-online-store-is-open";
        actualResult = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Given("user click on Youtube link")
    public void clickOnYoutubeLink(){
        homePage.youTube().click();
    }

    @Then("make sure that user directed to Youtube page")
    public void checkThatYoutubePageIsDisplayed() throws InterruptedException {

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        expectedResult = "https://www.youtube.com/user/nopCommerce";
        actualResult = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(expectedResult,actualResult);
    }

}
