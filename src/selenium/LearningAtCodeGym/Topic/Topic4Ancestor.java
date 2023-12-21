package selenium.LearningAtCodeGym.Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic4Ancestor {


    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ngoc\\DataSelenium\\b1\\browserdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
    }
    @Test
    public void dyNaMic_loCaTor(){
        String DYNAMIC_LOCATOR = "//input[@placeholder='%s'";
        String txbFirstName = String.format(DYNAMIC_LOCATOR,"First Name");
        String txbEmail = String.format(DYNAMIC_LOCATOR,"Last Name");
        String txbMobile = String.format(DYNAMIC_LOCATOR,"name@example.com");
        driver.findElement(By.xpath(txbFirstName));
        driver.findElement(By.xpath(txbEmail));
        driver.findElement(By.xpath(txbMobile));







    }







}
