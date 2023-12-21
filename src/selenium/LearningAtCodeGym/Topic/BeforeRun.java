package selenium.LearningAtCodeGym.Topic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BeforeRun {
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
        driver.get("https://jqueryui.com/tooltip/");
        actions = new Actions(driver);
        return driver;

    }
    public void afterTest() {
        if(driver!=null){
            driver.quit();
        }
    }

}
