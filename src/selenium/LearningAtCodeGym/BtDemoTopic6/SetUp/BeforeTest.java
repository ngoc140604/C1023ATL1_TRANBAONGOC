package selenium.LearningAtCodeGym.BtDemoTopic6.SetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BeforeTest {
    WebDriver driver;
    Actions actions;
    public WebDriver getDriver(){
        return driver;
    }

    @BeforeClass
    public WebDriver beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ngoc\\DataSelenium\\b1\\browserdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/V1/index.php");
        return driver;

    }
    public void afterTest() {
        if(driver!=null){
            driver.quit();
        }
    }

}

