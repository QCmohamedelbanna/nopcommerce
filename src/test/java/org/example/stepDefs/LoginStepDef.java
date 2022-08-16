package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.testng.asserts.SoftAssert;

public class LoginStepDef {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SoftAssert softAssert = new SoftAssert();

    @Given("user goes to Login page")
    public void goToLoginPage(){
        homePage.clickOnLoginLink().click();
    }

    @When("user enters \"(.*)\" and \"(.*)\"$")
    public void enterEmailAndPassword(String email , String password){
        loginPage.enterEmail().sendKeys(email);
        loginPage.enterPassword().sendKeys(password);
    }


    @And("user clicks on \"Login\" button")
    public void clickOnLoginBtn(){
        loginPage.clickOnLoginButton().click();
    }

    @Then("user logins successfully to the system")
    public void checkUserLoggedInSuccessfully(){
        String expectedResult = "https://demo.nopcommerce.com/";
        String actualResult = loginPage.checkLoginSuccessfullyByCurrentUrl();
        softAssert.assertEquals(expectedResult,actualResult);
        softAssert.assertTrue(loginPage.checkMyAccountLinkDisplayed());
        softAssert.assertAll();
    }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.";
        String actualResult = loginPage.checkUnsuccessfulLogin().getText();
        softAssert.assertEquals(expectedResult,actualResult);

        String expectedTextColor = "#e4434b";
        String actualTextColor = loginPage.checkUnsuccessfulLogin().getCssValue("color");
        softAssert.assertEquals(expectedTextColor,actualTextColor);

        softAssert.assertAll();
    }
}
