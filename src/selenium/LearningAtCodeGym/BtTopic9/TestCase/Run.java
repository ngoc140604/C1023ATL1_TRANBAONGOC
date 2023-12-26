package selenium.LearningAtCodeGym.BtTopic9.TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.LearningAtCodeGym.BtTopic9.Before.BaseSetup;
import selenium.LearningAtCodeGym.BtTopic9.Pages.AddEventPopup;
import selenium.LearningAtCodeGym.BtTopic9.Pages.DashBoardPage;
import selenium.LearningAtCodeGym.BtTopic9.Pages.EventPage;
import selenium.LearningAtCodeGym.BtTopic9.Pages.SignInPage;

public class Run extends BaseSetup {
    private WebDriver driver;
    private SignInPage signInPage;
    private DashBoardPage dashBoardPage;
    private EventPage eventPage;
    private AddEventPopup addEventPopup;

    @BeforeClass
    public void setup() {
        driver = getDriver();

    }

    @Test(priority = 1)
    public void signInPage() throws InterruptedException {
        signInPage = new SignInPage(driver);
        dashBoardPage =signInPage.signIn("admin@demo.com", "riseDemo");
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void openEventPage() throws InterruptedException {
//        dashBoardPage = new DashBoardPage(driver);
       eventPage=dashBoardPage.openEventPage();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void openPopupEventPage() throws InterruptedException {
        addEventPopup =eventPage.addEvent();
        Thread.sleep(2000);

    }
    @Test(priority = 4)
    public void fillFormAddEvent() throws InterruptedException {
        addEventPopup.saveButton();
        Thread.sleep(2000);


    }

    @AfterClass
    public void close() throws InterruptedException {
        driver.quit();

    }

}
