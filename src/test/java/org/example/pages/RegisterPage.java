package org.example.pages;

import io.cucumber.java.eo.Se;
import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    public WebElement selectGenderType(){
        return Hooks.driver.findElement(By.cssSelector("input[value=\"M\"]"));
    }

    public WebElement enterFirstName(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement enterLastName(){
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement selectDateOfBirthDay(){
         Hooks.driver.findElement(By.name("DateOfBirthDay"));
         return Hooks.driver.findElement(By.xpath("//option[@value='30']"));
    }

    public WebElement selectDateOfBirthMonth(){
        Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return Hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]//option[8]"));
    }

    public WebElement selectDateOfBirthYear(){
        Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return Hooks.driver.findElement(By.xpath("//option[@value=\"1992\"]"));
    }
    public WebElement enterEmail(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement enterPassword(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement clickOnRegister(){
        return Hooks.driver.findElement(By.className("buttons"));
    }
    public WebElement checkRegistrationStatus(){
        return Hooks.driver.findElement(By.className("result"));
    }
    public WebElement checkMessageColor(){
        return Hooks.driver.findElement(By.className("result"));
    }
}
