package selenium.LearningAtCodeGym.Topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic5 {

    By slbTittle =By.id("user_title");
    By txtFirstName = By.id("user_firstname");
    By txtSurName = By.id("user_surname");
    By phone = By.id("user_phone");
    By drdYear = By.id("user_dateofbirth_1i");
    By drdMonth = By.id("user_dateofbirth_2i");

    By drdDate = By.id("user_dateofbirth_3i");
    By rdoFull = By.xpath("//labe[@for='licencetype_t'");






    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ngoc\\DataSelenium\\b1\\browserdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/register.php");
    }
    @Test
    public void xuLy(){
       select(slbTittle,"Doctor");
       senKeyValue(txtFirstName,"Ngoc");
       senKeyValue(txtSurName,"Mai");
       senKeyValue(phone,"0336977731");
       select(drdYear,"1938");
       select(drdMonth,"February");
       select(drdDate,"2");
       clickElement(rdoFull);


    }















    public void select(By element,String text){
        WebElement dropdown =driver.findElement(element);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);

    }
    public void clickElement(By element){
        driver.findElement(element).click();
    }
    public void senKeyValue(By element,String value){
        driver.findElement(element).sendKeys(value);
    }



}
