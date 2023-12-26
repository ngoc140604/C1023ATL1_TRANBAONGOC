package selenium.LearningAtCodeGym.BtTopic7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Before {
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
        driver.get("http://live.techpanda.org/index.php/mobile.html");
        return driver;

    }
    @AfterClass
    public void afterTest() {
        if(driver!=null){
            driver.quit();
        }
    }

}

