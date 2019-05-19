package initialization;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class SeleniumMethods extends Setup {
    public static void main(String[] args) {
        setupDriver("mac", "https://www.ebay.com/", "chrome");
        String title = driver.getTitle();
        System.out.println(title);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.ebaay.com/";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualUrl, expectedUrl);

        if (actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Passed");
        } else System.out.println("Failed");


        WebElement saved = driver.findElement(By.linkText("Saved"));
        System.out.println(saved.getText());

        if (saved.isDisplayed()) {
            System.out.println(saved.getText() + "  :  is displayed");
        }

        WebElement searchBar = driver.findElement(By.xpath("//*[@id='gh-ac']"));
        searchBar.clear();
        searchBar.click();
        searchBar.sendKeys("Java Books");


        WebElement search = driver.findElement(By.xpath("//*[@id='gh-btn']"));
        search.click();

        String pageSource = driver.getPageSource();


        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.amazon.com/");

        try {
            Thread.sleep(5000);
        } catch (Exception ee) {

        }

        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

}
