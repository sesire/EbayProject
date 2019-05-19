package ebay;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchBoxPage extends HomePage {
    @Test
    public void SearchBox(){
        setupDriver("Mac", "https://www.ebay.com/", "chrome");
        driver.findElement(By.id("gh-ac")).sendKeys("Tissot");
        driver.findElement(By.id("gh-btn")).click();
    }
}
