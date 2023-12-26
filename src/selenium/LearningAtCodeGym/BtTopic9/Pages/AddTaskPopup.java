package selenium.LearningAtCodeGym.BtTopic9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.LearningAtCodeGym.BtTopic9.Before.ValidateHelper;

public class AddTaskPopup {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    public AddTaskPopup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        validateHelper = new ValidateHelper(driver);

    }
    //element at Popup addTask
    @FindBy(id ="title")
    private WebElement txbTitle;
    @FindBy(xpath ="//textarea[@name='description']")
    private WebElement txbDescription;
    @FindBy(xpath ="//div[@id='s2id_task-context']//input")
    private WebElement drdRelatedTo;
   @FindBy(xpath = "//div[@id='s2id_client_id']//input")
   private WebElement drdClient;
    @FindBy(xpath ="//div[@id='s2id_autogen18']//input")
    private WebElement drdPoints;
    @FindBy(xpath ="//div[@id='s2id_milestone_id']//input")
    private WebElement drdMilesStone;
    @FindBy(xpath ="//div[@id='s2id_assigned_to']//input")
    private WebElement drdAssignTo;
    @FindBy(xpath ="//li[@class='select2-search-field']//input")
    private WebElement txbCollaborators;
    @FindBy(xpath ="//div[@id='s2id_task_status_id']//input")
    private WebElement drdStatus;
    @FindBy(xpath ="//div[@id='s2id_priority_id']//input")
    private WebElement drdPriority;
    @FindBy(xpath ="//div[@id='s2id_project_labels']//input")
    private WebElement drdLabels;
    @FindBy(name ="start_date")
    private WebElement txbStartDate;
    @FindBy(xpath ="//input[@id='deadline']")
    private WebElement txbDeadline;
    @FindBy(xpath ="//button[@type='submit']")
    private WebElement btnSubmit;


    public TaskPage fillForm() throws InterruptedException {
        validateHelper.setText(txbTitle,"Ngoc123");
        validateHelper.setText(txbDescription,"C1023ATL1");
        Thread.sleep(1000);
        validateHelper.handleDropdown(drdRelatedTo,"Client");
        Thread.sleep(2000);
//        validateHelper.handleDropdown(drdClient,"Hauck Ltd");
        validateHelper.handleDropdown(drdClient,"Halvorson Inc");
        validateHelper.handleDropdown(drdPoints,"3");
        validateHelper.handleDropdown(drdAssignTo,"John Doe");
        validateHelper.handleDropdown(txbCollaborators,"Mark Thomas");
        validateHelper.handleDropdown(drdStatus,"To do");
        validateHelper.handleDropdown(drdPriority,"Major");
        validateHelper.handleDropdown(drdLabels,"Bug");
        validateHelper.setText(txbStartDate,"10-12-2020");
        validateHelper.setText(txbDeadline,"20-12-2024");
        validateHelper.clickElement(btnSubmit);


        return new TaskPage(driver);
    }

}
