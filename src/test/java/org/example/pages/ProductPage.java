package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage {
    public String getSkuText(){
        return Hooks.driver.findElement(By.xpath("//div[@class='additional-details']//div//span[2]")).getText();
    }
}
