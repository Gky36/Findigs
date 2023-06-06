package findigs.pages;

import findigs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVerifyPhoneNumber
{
    public CreateVerifyPhoneNumber(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "code")
    public WebElement verificationBox;

    @FindBy(className = "index-module_inner-text__4qU1f")
    public WebElement reSendCode;

    @FindBy(className = "index-module_inner-text__4qU1f")
    public WebElement changePhoneNumber;

    @FindBy(className = "index-module_btn__p-9y- btn btn-primary")
    public WebElement verifyButton;

}
