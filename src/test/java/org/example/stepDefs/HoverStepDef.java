package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.DesktopsPage;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HoverStepDef {

    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();

    @Given("user hover on one of three categories and click on its subcategory")
    public void selectSubCategory() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);

        WebElement image = Hooks.driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] li a[href='/computers']"));
        action.moveToElement(image).perform();

        Thread.sleep(4000);
    }
    @When("user click on Subcategory link")
    public void clickOnSubCategory(){
        Hooks.driver.findElement(By.cssSelector("ul[class='top-menu notmobile'] ul li a[href='/desktops']")).click();
    }

    @Then("check that the selected subcategory is matching with page title")
    public void validatePageTitleWithSelectedSubcategory(){
        String expectedResult = desktopsPage.getPageTitle();
        String actualResult = desktopsPage.titleText().getText();

        System.out.println(expectedResult);
        System.out.println(actualResult);
        Assert.assertTrue(expectedResult.contains(actualResult));
    }



}
