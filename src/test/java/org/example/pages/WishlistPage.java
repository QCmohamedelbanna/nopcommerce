package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishlistPage {
    public WebElement quantityValue(){
        return Hooks.driver.findElement(By.cssSelector("td[class='quantity'] input[type='text']"));
    }
}
