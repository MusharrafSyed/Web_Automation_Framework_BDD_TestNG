package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver d) {
        super(d);
        PageFactory.initElements(d, this);
    }

    // locator for hte usernane

    @FindBy(name="username")
    private WebElement username;


    //locator for the password

    @FindBy(name="password")
    private WebElement password;

    // lloactor for login buttont

    @FindBy(xpath="//button[@type='submit']")
    private WebElement login;


    // actio on the element

    public void enterUserName(String value) {
        enterValue(username, value);
    }

    public void enterPassword(String value) {
        enterValue(password, value);
    }

    public void clickOnLogin(){
        click(login);
    }


}
