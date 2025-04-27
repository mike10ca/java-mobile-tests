package pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.DriverUtils;

public class BasePage {

    protected AppiumDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = DriverUtils.getDriver();
        initializePageFactory();
        wait = new WebDriverWait(DriverUtils.getDriver(), Duration.ofSeconds(10));
    }

    private void initializePageFactory() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

}
