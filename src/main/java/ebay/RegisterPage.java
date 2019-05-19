package ebay;

import org.openqa.selenium.By;


import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPage extends HomePage {
    @Test
    public void RegisterPage () {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.linkText("register")).click();
        driver.findElement(By.id("firstname")).sendKeys("sesire");
        driver.findElement(By.id("lastname")).sendKeys("islam");
        driver.findElement(By.id("email")).sendKeys("ssr@yahoo.com");
        driver.findElement(By.id("PASSWORD")).sendKeys("sesire1234");
        driver.findElement(By.className("checkbox__control")).click();
        driver.findElement(By.id("ppaFormSbtBtn")).click();

    }
}
