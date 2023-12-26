package selenium.LearningAtCodeGym.BtTopic9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import selenium.LearningAtCodeGym.BtTopic9.Before.ValidateHelper;

public class DashBoardPage {
    WebDriver driver;
    ValidateHelper validateHelper;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        validateHelper = new ValidateHelper(driver);
    }
    //element for DashBoardPage
    @FindBy(xpath = "//ul[@id='sidebar-menu']//span[contains(text(),'Events')]")
    WebElement eventMenu;
    @FindBy(xpath = "//ul[@id='sidebar-menu']//li[5]//a")
    WebElement taskMenu;
    private String url ="/dashboard";

    //Check url
    public boolean verifyUrl(String url1){
       return driver.getCurrentUrl().contains(url1); //True or false

    }
    public EventPage openEventPage(){
        //kiểm tra trước khi click qua event page thông qua verify url
        Assert.assertTrue(verifyUrl(url),"Không phải trang Dashboard");
        validateHelper.clickElement(eventMenu);
        return new EventPage(driver);
    }
    public TaskPage opentTaskPage(){
        Assert.assertTrue(verifyUrl(url),"Không phải trang Dashboard");
        validateHelper.clickElement(taskMenu);
        return new TaskPage(driver);

    }



}
