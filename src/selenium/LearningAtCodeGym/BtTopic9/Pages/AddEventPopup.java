package selenium.LearningAtCodeGym.BtTopic9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.LearningAtCodeGym.BtTopic9.Before.ValidateHelper;

public class AddEventPopup {
    private WebDriver driver;
    private ValidateHelper validateHelper;
    private Actions actions;

    public AddEventPopup(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
        PageFactory.initElements(driver,this);
    }
    //Element at AddEventPopup
    @FindBy(id ="title")
    private WebElement txtTitle;
    @FindBy(id ="description")
    private WebElement txtDescription;
    @FindBy(name="start_date")
    private WebElement eleStartDate;
    @FindBy(name="end_date")
    private WebElement eleEndDay;
    @FindBy(name="start_time")
    private WebElement eleStartTime;
    @FindBy(name="end_time")
    private WebElement eleEndTime;
    @FindBy(name="location")
    private WebElement txtLocation;
    @FindBy(xpath="//div[@id='s2id_clients_dropdown']//input")
    private WebElement drdClient;
    //s2id_clients_dropdown
    @FindBy(xpath="//ul[@id='select2-results-2']/li[4]")
    private WebElement vluHalvorsoninc;
    @FindBy(xpath="//input[@type='checkbox']")
    private WebElement cbxRepeat;
    @FindBy(xpath="//div[@class='color-palet']//span[5]")
    private WebElement color;
    @FindBy(xpath="//button[@type='submit']")
    private WebElement btnSubmit;

    public void saveButton() {
        validateHelper.setText(txtTitle, "Ngoc");
        validateHelper.setText(txtDescription,"demo");
        validateHelper.setText(eleEndDay,"11/2/2023");
        validateHelper.setText(eleStartDate,"11/10/2002");
        validateHelper.setText(eleStartTime,"1:00AM");
        validateHelper.setText(eleEndTime,"5:00PM");
        validateHelper.setText(txtLocation,"60le");
//        drdClient.sendKeys("Demo Client");
//        actions = new Actions(driver);
//        actions.sendKeys(Keys.ENTER).build().perform();
        validateHelper.handleDropdown(drdClient,"Demo Client");

    }








}
