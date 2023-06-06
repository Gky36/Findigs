package findigs.step_definitions;

import findigs.pages.CreateNewAccountPageElements;
import findigs.pages.CreateVerifyPhoneNumber;
import findigs.utilities.BrowserUtils;
import findigs.utilities.ConfigurationReader;
import findigs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewAccount_StepDefinitions extends BrowserUtils {

    CreateNewAccountPageElements createNewAccountPageElements = new CreateNewAccountPageElements();
    CreateVerifyPhoneNumber createVerifyPhoneNumber = new CreateVerifyPhoneNumber();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user opens the new user account page")
    public void userOpensTheNewUserAccountPage() {
        String url = ConfigurationReader.getProperty("findigs");
        Driver.getDriver().get(url);

    }

    @When("user enters valid input")
    public void userEntersValidInput() {
    createNewAccountPageElements.firstName.sendKeys("gokay");
    createNewAccountPageElements.lastName.sendKeys("yazr");
    createNewAccountPageElements.Email.sendKeys("Clarissagor25@yahoo.com");
    createNewAccountPageElements.Phone.sendKeys("1234567890");
    createNewAccountPageElements.Password.sendKeys("Nickjonas52594");
    createNewAccountPageElements.confirmPassword.sendKeys("Nickjonas52594");
    createNewAccountPageElements.createAccountButton.click();

    }

    @And("user enter valid verification code")
    public void userEnterValidVerificationCode() throws InterruptedException {
        Thread.sleep(5000);
//        fluentWait(createVerifyPhoneNumber.verifyButton,5);
//        waitForClickability(createVerifyPhoneNumber.verifyButton,5);
        String digitCode = ConfigurationReader.getProperty("digitCode");
        createVerifyPhoneNumber.verificationBox.sendKeys(ConfigurationReader.getProperty(digitCode));
        createVerifyPhoneNumber.verifyButton.click();
    }

    @Then("user is able to successfully create new account")
    public void userIsAbleToSuccessfullyCreateNewAccount() {

    }
}
