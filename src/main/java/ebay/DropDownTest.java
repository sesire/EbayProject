package ebay;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends HomePage {
    @Test
    public void DropDown(){
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        Select dropdown = new Select(driver.findElement(By.id("gh-cat")));
        dropdown.selectByValue("267");
        driver.findElement(By.id("gh-btn")).click();
        String actualText = driver.findElement(By.className("b-pageheader__text")).getText();
        Assert.assertEquals(actualText,"Books");
        System.out.println("Test Passed");


    }
}
