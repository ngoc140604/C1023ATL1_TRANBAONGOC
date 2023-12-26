package selenium.LearningAtCodeGym.BtTopic9.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage {
    WebDriver driver;

    public EventPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //Element at EventPage
    private String pageText ="Event calendar";
    @FindBy(tagName = "h1")
    WebElement headerPageEvent;
    @FindBy(xpath = "//a[@class='btn btn-default add-btn']")
    WebElement btnAddEvent;

    public boolean verifyElementText(){
        return headerPageEvent.getText().equals(pageText);
    }
    public AddEventPopup addEvent(){
        btnAddEvent.click();
        return new AddEventPopup(driver);

    }

}
