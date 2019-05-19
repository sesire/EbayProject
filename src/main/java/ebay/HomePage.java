package ebay;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class HomePage {
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


//        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("firefox")){
//            System.setProperty("webdriver.gecko.driver","/Users/tawhidurislam/Google/src/main/drivers/geckodriver 5");
//        }else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("firefox")){
//            System.setProperty("webdriver.gecko.driver","/Users/tawhidurislam/Google/src/main/drivers/geckodriver.exe");
//        }
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//        driver.get(url);


        return driver;
    }

    @Test
    public  void ebayHomePage(){
        setupDriver("Mac", "https://www.ebay.com/", "chrome");


//        try{
//            Thread.sleep(5000);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }

    }



}
