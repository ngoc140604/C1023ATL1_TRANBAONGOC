package selenium.LearningAtCodeGym.Topic;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic3_LocatorNangCao {

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
    public void interactLocators() {
        //ID
//        driver.findElement(By.id("userName"));
//
//        //tag
//        List<WebElement> elements  = driver.findElements(By.tagName("input"));
//        int num = elements.size();
//        System.out.println(num);
        //element at text box
        driver.findElement(By.id("userName")).sendKeys("kk");

        //element at checkbox
        driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
        //span[@class='rct-checkbox']
        driver.findElement(By.xpath("//label[normalize-space()='Impressive']"));
        //elemeent at button
        driver.findElement(By.xpath("//button[@id='doubleClickBtn']")).click();
        //element at link
        driver.findElement(By.linkText("Moved")).click();
        driver.findElement(By.cssSelector("a[href='http://demoqa.com']")).click();
        //contain
        //tagname[contains(@CLASS = '')]


        // tim kiem theo contains
             //input[contains(@placeholder,'name')]
            //input[contains(@placeholder,'Full Name')]
            //input[contains(@class,'form-control')][1]
           //textarea[contains(@id,'currentAddress')]
        //tim kiem theo startwith
            //input[starts-with(@id,'userEmail')]
           //input[starts-with(@placeholder,'Full Name')]
          //textarea[starts-with(@id,'currentAddress')]
         //textarea[starts-with(@id,'permanentAddress')]

        //tim kiem theo text
           //label[text()='Current Address']
          //label[text()='Full Name']
         //label[text()='Permanent Address']
        //tim kiem theo normalizespace
           //label[normalize-space()='Permanent Address']
        //label[normalize-space()='Full Name']
        //label[normalize-space()='Current Address']

        //tim kiem theo toan tu and va or
          //textarea[@id='currentAddress' and @placeholder='Current Address']
        //textarea[@id='userEmail' and @placeholder='name@example.com']
        //textarea[@id='permanentAddress' or @class='form-control']




















    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
