package initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver = null;


    public  static  WebDriver setupDriver(String platform, String url, String browser){
        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver", "/Users/tawhidurislam/Google/src/main/drivers/chromedriver 3");
        }else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/tawhidurislam/Google/src/main/drivers/chromedriver 3.exe");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(url);

        return driver;
    }
    @AfterTest
       public void quitDriver(){
       driver.quit();
    }

    @Test
    public  void facebookLogin(){
        setupDriver("Mac", "https://www.facebook.com/", "chrome");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    @Test
    public void messengerRediraction(){
        setupDriver("Mac", "https://www.facebook.com","chrome");
        driver.findElement(By.linkText("Messenger")).click();


    }
    @Test
    public void quit(){
        driver.quit();

    }


}
