package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.RegisterPage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class RegisterStepDef  {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    SoftAssert softAssert = new SoftAssert();
    @Given("user goes to register page")
    public void goRegisterPage() {
        homePage.clickOnRegisterLink().click();
    }
    @And("user selects gender type")
    public void selectGenderType(){
        registerPage.selectGenderType().click();
    }

    @When("user enters first name \"Muhammed\"")
    public void enterFirstName(){
        registerPage.enterFirstName().sendKeys("Muhammed");
    }

    @And("user enters last name \"Elbanna\"")
    public void enterLastName(){
        registerPage.enterLastName().sendKeys("Elbanna");
    }

    @And("user enter date of birth")
    public void selectDateOfBirth(){
        registerPage.selectDateOfBirthDay().click();
        registerPage.selectDateOfBirthMonth().click();
        registerPage.selectDateOfBirthYear().click();
    }

    @And("user enters an Email")
    public void enterEmail(){
        registerPage.enterEmail().sendKeys("itmohamedelbana@gmail.com");
    }

    @And("user enters a Password")
    public void enterPassword(){
        registerPage.enterPassword().sendKeys("P@ssw0rd");
        registerPage.confirmPassword().sendKeys("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void clickOnRegisterButton(){
        registerPage.clickOnRegister().click();
    }

    @Then("success message is displayed")
    public void checkRegistrationSuccessfully(){
        String actualResult = registerPage.checkRegistrationStatus().getText();
        String expectedResult = "Your registration completed";
        softAssert.assertEquals(actualResult,expectedResult);
        System.out.println(registerPage.checkMessageColor().getCssValue("color"));
        System.out.println(Color.fromString("#4cb17c").asRgba());
        softAssert.assertEquals(registerPage.checkMessageColor().getCssValue("color"),Color.fromString("#4cb17c").asRgba());
        softAssert.assertAll();
    }

}
