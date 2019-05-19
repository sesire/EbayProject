package ebay;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertingTest extends HomePage{

    @Test
    public void Assertion(){
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.linkText("register")).click();
        String actualText = driver.findElement(By.className("giant-text-2")).getText();
        Assert.assertEquals(actualText,"Create an account");
        System.out.println("Test Passed");
    }
}




