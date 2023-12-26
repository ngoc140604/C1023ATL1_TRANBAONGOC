package selenium.LearningAtCodeGym.BtDemoTopic6.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.LearningAtCodeGym.BtDemoTopic6.Page.LoginPage;
import selenium.LearningAtCodeGym.BtDemoTopic6.Page.SendEmailPage;
import selenium.LearningAtCodeGym.BtDemoTopic6.SetUp.BeforeTest;

public class TestLogin extends BeforeTest {
   private WebDriver driver;
   private LoginPage loginPage;
   private SendEmailPage sendEmailPage;

    @BeforeClass
    public void before(){
        driver= getDriver();
    }
    @Test(priority = 1)
    public void clickVisitInLoginPage(){
        loginPage = new LoginPage(driver);
        sendEmailPage = loginPage.clickVisit();

    }
    @Test(priority = 2)
    public void loginPage(){
        sendEmailPage.inputTextBoxEmailID();

    }

}
