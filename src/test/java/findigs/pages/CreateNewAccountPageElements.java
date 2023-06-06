package findigs.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import findigs.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccountPageElements {

    public CreateNewAccountPageElements() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div/div[1]/div[1]/div/input")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div/div[1]/div[2]/div/input")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div/div[1]/div[3]/div/input")
    public WebElement Email;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div/div[1]/div[4]/div/input")
    public WebElement Phone;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div/div[1]/div[5]/div/div[1]/div/input")
    public WebElement Password;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/form/div/div[1]/div[6]/div/div/div/input")
    public WebElement confirmPassword;

    @FindBy(className = "index-module_inner-text__4qU1f")
    public WebElement createAccountButton;



}



