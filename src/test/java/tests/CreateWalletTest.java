package tests;
import org.testng.annotations.Test;

import pages.CreateWalletPage;

public class CreateWalletTest extends BaseTest {

    @Test(description = "Verify a user can create a new wallet")
    public void createWalletTest() {
        String passcode = "123456";
        CreateWalletPage createWalletPage = new CreateWalletPage();

        createWalletPage.clickCreateNewWalletButton();
        createWalletPage.setPassCode(passcode);
        createWalletPage.confirmPassCodeStringVisible();
        createWalletPage.setPassCode(passcode);
        createWalletPage.clickDoLaterOption();
        createWalletPage.walletReadyConfirmationVisible();

    }

    @Test(description = "Verify passcodes cannot differ when creating a new wallet")
    public void passCodeValidationTest() {
        String passcode_1 = "123456";
        String passcode_2 = "123457";
        CreateWalletPage createWalletPage = new CreateWalletPage();

        createWalletPage.clickCreateNewWalletButton();
        createWalletPage.setPassCode(passcode_1);
        createWalletPage.confirmPassCodeStringVisible();
        createWalletPage.setPassCode(passcode_2);
        createWalletPage.passCodeMismatchWarningVisible();
    }
}
