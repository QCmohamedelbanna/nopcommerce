package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage;
import org.testng.Assert;

import javax.swing.plaf.PanelUI;

public class SliderStepDef {
    HomePage homePage = new HomePage();
    String expectedResult;
    String actualResult;

    @Given("user click on first slider")
    public void clickOnFirstSlider(){
        homePage.firstSlider().click();

    }

    @Then("check that user is directed to the first slider page")
    public void checkThatUserDirectedToFirstSliderLink(){
         expectedResult = "https://demo.nopcommerce.com/nokia-lumia-1020";
         actualResult = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(expectedResult,actualResult);
    }

    @Given("user click on second slider")
    public void clickOnSecondSlider(){
        homePage.secondSlider().click();
    }

    @Then("check that user is directed to the second slider page")
    public void checkThatUserDirectedToSecondSliderLink(){
        expectedResult = "https://demo.nopcommerce.com/iphone-6";
        actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
