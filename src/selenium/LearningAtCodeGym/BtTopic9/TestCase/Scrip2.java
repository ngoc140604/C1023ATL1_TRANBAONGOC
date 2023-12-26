package selenium.LearningAtCodeGym.BtTopic9.TestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.LearningAtCodeGym.BtTopic9.Before.BaseSetup;
import selenium.LearningAtCodeGym.BtTopic9.Pages.AddTaskPopup;
import selenium.LearningAtCodeGym.BtTopic9.Pages.DashBoardPage;
import selenium.LearningAtCodeGym.BtTopic9.Pages.SignInPage;
import selenium.LearningAtCodeGym.BtTopic9.Pages.TaskPage;

public class Scrip2 extends BaseSetup {
    private WebDriver driver;
    private DashBoardPage dashBoardPage;
    private SignInPage signInPage;
    private TaskPage taskPage;
    private AddTaskPopup addTaskPopup;



    @BeforeClass
    public void setup(){
        driver=getDriver();

    }
    @Test(priority = 1)
    public void signInPage() throws InterruptedException {
        signInPage = new SignInPage(driver);
        dashBoardPage =signInPage.signIn("admin@demo.com", "riseDemo");
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void openTaskPage() throws InterruptedException {
        taskPage= dashBoardPage.opentTaskPage();
        Thread.sleep(2000);

    }
    @Test(priority = 3)
    public void openTaskPopup() throws InterruptedException{
        addTaskPopup = taskPage.openTaskPopup();
        Thread.sleep(2000);


    }
    @Test(priority = 4)
    public void fillAddTaskPopup() throws InterruptedException{
        taskPage =addTaskPopup.fillForm();
        Thread.sleep(2000);

    }

    @Test(priority = 5)
    public void viewInformationProduct() throws InterruptedException {
        taskPage.search();
        taskPage.opentTaskInFor();

    }



    @AfterClass
    public void close(){
        if(driver!=null){
            System.exit(0);
        }
    }

}
