package ebay;

import org.openqa.selenium.By;

import org.testng.annotations.Test;



public class LoginPage extends HomePage {
    @Test
    public void LoginPage() {
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
        driver.findElement(By.id("sgnBt")).click();
    }



}














