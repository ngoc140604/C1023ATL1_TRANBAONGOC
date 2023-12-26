package selenium.LearningAtCodeGym.BtTopic7;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_01 extends Before {
    WebDriver driver;
    HomePage homePage;
    @BeforeTest
    public void before(){
        driver =getDriver();

    }
    @Test
    public void run(){
        homePage =  new HomePage(driver);
        homePage.clickAddToCard();



    }
}
