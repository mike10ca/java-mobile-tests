package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateWalletPage extends BasePage {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"CreateNewWalletButton\")")
    private WebElement createNewWalletButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Confirm passcode\")")
    private WebElement passCodeConfirmationString;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"secondaryAction\")")
    private WebElement doLaterOption;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Brilliant, your wallet is ready!\")")
    private WebElement walletReadyConfirmationString;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Those passwords didn’t match!\")")
    private WebElement passCodeMismatchWarningString;

    private WebElement getPasscodeButton(char digit) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                AppiumBy.androidUIAutomator("new UiSelector().text(\"" + digit + "\")")
        ));
    }

    public void setPassCode(String passcode) {
        for (char digit : passcode.toCharArray()) {
            WebElement digitButton = getPasscodeButton(digit);
            wait.until(ExpectedConditions.elementToBeClickable(digitButton)).click();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        wait.until(ExpectedConditions.visibilityOf(passCodeConfirmationString));
    }

    public void clickCreateNewWalletButton() {
        wait.until(ExpectedConditions.visibilityOf(createNewWalletButton));
        wait.until(ExpectedConditions.elementToBeClickable(createNewWalletButton)).click();
    }

    public void confirmPassCodeStringVisible() {
        wait.until(ExpectedConditions.visibilityOf(passCodeConfirmationString));
    }

    public void clickDoLaterOption() {
        wait.until(ExpectedConditions.visibilityOf(doLaterOption));
        wait.until(ExpectedConditions.elementToBeClickable(doLaterOption)).click();
    }

    public void walletReadyConfirmationVisible() {
        wait.until(ExpectedConditions.visibilityOf(walletReadyConfirmationString));
    }

    public void passCodeMismatchWarningVisible() {
        wait.until(ExpectedConditions.visibilityOf(passCodeMismatchWarningString));
    }

}
