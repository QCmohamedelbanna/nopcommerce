package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CurrenciesStepDef {

    HomePage homePage = new HomePage();

    @Given("user clicks on Currency DDL")
    public void clickOnCurrencyList(){
        homePage.clickOnCurrency().click();
    }

    @When("user select another currency")
    public void selectAnotherCurrency() {
       homePage.selectCurrency().click();
    }

    @Then("system display the selected currency")
    public void checkThatCurrencyIsChanged(){
        String actualResult = homePage.checkSelectedCurrency();
        Assert.assertTrue(actualResult.contains("€"));
    }

}
