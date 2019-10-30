package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;

    public class CommonAPI {
    public static WebDriver driver = null;

   @Parameters ({"platform","url","browser"})
    @BeforeMethod
    public static WebDriver SetupDriver(String platform,String url,String browser){
    if(platform.equalsIgnoreCase("mac")&& browser.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","..\\Generic\\src\\main\\resources\\Driver\\chromedriver");
    }
    else{
        System.setProperty("webdriver.chrome.driver","..\\Generic\\src\\main\\resources\\Driver\\chromedriver.exe");
    }
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    driver.get(url);

        return driver;
   }
    @AfterMethod
    public void quitDriver(){
       // driver.quit();
    }
}
