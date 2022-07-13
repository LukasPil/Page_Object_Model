package pages.seleniumEasy;

import org.openqa.selenium.NoAlertPresentException;
import pages.Locators;
import utils.Driver;

public class JavaScriptAlertBoxDemo {
    public static void open() {
        pages.Common.openUrl("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
    }

    public static void clickButtonToOpenAlertBox() {
        pages.Common.clickElement(Locators.SeleniumEasy.JavaScriptAlertBoxDemo.buttonOpenAlertBox);
    }

    public static void clickButtonToCloseAlertBox() {
        pages.Common.acceptAlert();
    }

    public static void clickOkToCloseAlertBox() {
        pages.Common.dismissAlert();
    }

    public static boolean isAlertPresent() {
        return pages.Common.isAlertPresent();
    }

    public static void clickButtonToOpenConfirmBox() {
        pages.Common.clickElement(Locators.SeleniumEasy.JavaScriptAlertBoxDemo.buttonOpenConfirmBox);
    }

    public static void clickOkToCloseConfirmBox() {
        pages.Common.acceptAlert();
    }

    public static void clickCancelToCloseConfirmBox() {
        pages.Common.dismissAlert();
    }

    public static String readMessageFromConfirmBox() {
        return pages.Common.getElementText(Locators.SeleniumEasy.JavaScriptAlertBoxDemo.fieldMessageOfConfirmBox);
    }

    public static void clickButtonToOpenPromptBox() {
        pages.Common.clickElement(Locators.SeleniumEasy.JavaScriptAlertBoxDemo.buttonOpenPromptBox);
    }

    public static void sendMessageToPromptBox(String message) {
        pages.Common.sendKeysToAlert(message);
    }

    public static void clickOkToClosePromptBox() {
        pages.Common.acceptAlert();
    }

    public static String readMessageFromPromptBox() {
        return pages.Common.getElementText(Locators.SeleniumEasy.JavaScriptAlertBoxDemo.fieldMessageOfPromptBox);
    }

    public static void clickCancelToClosePromptBox() {
        pages.Common.dismissAlert();
    }
}

