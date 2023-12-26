package selenium.LearningAtCodeGym.BtDemoTopic6.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendEmailPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPage loginPage;


    public SendEmailPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,20);

    }
    //element at this page
    @FindBy(name ="emailid")
    private WebElement txbEmailID;
    @FindBy(name ="btnLogin")
    private WebElement btnSubmit;
    @FindBy(xpath = "//td[text()='User ID :']/following-sibling::td")
    private WebElement userId;
    @FindBy(xpath = "//td[text()='Password :']/following-sibling::td")
    private WebElement passwordId;
    String ExTitle = " GTPL Bank Home Page ";

    public String getPageTitle(){
        return driver.getTitle();
    }
    public boolean verifyPageTittle(String expectedTitle){
        return getPageTitle().contains(expectedTitle);

    }






    public void inputTextBoxEmailID(){
        System.out.println("Step 3: Input Email ID");
        wait.until(ExpectedConditions.elementToBeClickable(txbEmailID));
        txbEmailID.sendKeys("tranbaongoc140604@gmail.com");
        btnSubmit.click();
        System.out.println("Step 4: Get UserName and Password");
        String getPass = passwordId.getText();
        String getUser = userId.getText();
        System.out.println("UserName: "+getUser);
        System.out.println("PassWord: "+getPass);
        driver.navigate().back();
        driver.navigate().back();
        System.out.println("Step 5: Login with userName and PassWord just getting");
        loginPage = new LoginPage(driver);
        loginPage.Login(getUser,getPass);
        verifyPageTittle("");
    }
}






