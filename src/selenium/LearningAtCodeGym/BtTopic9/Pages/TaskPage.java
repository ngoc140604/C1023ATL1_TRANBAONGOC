package selenium.LearningAtCodeGym.BtTopic9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.LearningAtCodeGym.BtTopic9.Before.ValidateHelper;

public class TaskPage {
    WebDriver driver;
    private ValidateHelper validateHelper;
    @FindBy(xpath = "//a[@class='btn btn-default'][normalize-space()='Add task']")
    WebElement openAddTaskPopup;
    @FindBy(xpath ="//div[@id='task-table_filter']//input")
    private WebElement btnSearch;
    @FindBy(xpath="//a[text()='Ngoc123']")
    WebElement btnInforTask;

    public TaskPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        validateHelper = new ValidateHelper(driver);
    }
    public AddTaskPopup openTaskPopup(){
        validateHelper.verifyUrl("all_tasks");
        validateHelper.clickElement(openAddTaskPopup);
        return new AddTaskPopup(driver);

    }
    public void search() throws InterruptedException {
        validateHelper.handleDropdown(btnSearch,"Ngoc");
        Thread.sleep(2000);
    }
    public taskInForPopup opentTaskInFor(){
        validateHelper.clickElement(btnInforTask);
        return new taskInForPopup(driver);
    }




}
