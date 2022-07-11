package pages.seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import pages.Locators;
import utils.Driver;

import java.time.Duration;

public class SimpleFormDemo {

    public static void open() {
        pages.Common.openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void closeAd() {
        Common.waitForElementToBeVisiable(Locators.SeleniumEasy.SimpleFormDemo.formAd);
        Common.clickElement(Locators.SeleniumEasy.SimpleFormDemo.buttonCloseAd);

    }

    public static void enterMessage(String expectedMessage) {
        Common.sendKeysToElement(By.xpath("//input[@id='user-message']"), expectedMessage);
    }

    public static void clickShowMessageButton() {
        Common.clickElement(Locators.SeleniumEasy.SimpleFormDemo.buttonShowMessage);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.SimpleFormDemo.fieldMessage);
    }

}
