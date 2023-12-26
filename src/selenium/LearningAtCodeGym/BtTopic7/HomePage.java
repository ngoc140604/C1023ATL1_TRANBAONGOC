package selenium.LearningAtCodeGym.BtTopic7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private ValidateHelper validateHelper;
    private WebDriverWait wait;

    //element at Home page
    @FindBy(xpath = "//h2[@class='product-name']//a[text()='Samsung Galaxy']/../following-sibling::div[@class='actions']//button")
    WebElement btnAddToCard;
    public HomePage(WebDriver driver){
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
        wait = new WebDriverWait(driver,20);
        PageFactory.initElements(driver,this);

    }

    public void clickAddToCard(){
        validateHelper.clickElement(btnAddToCard);

    }



}
