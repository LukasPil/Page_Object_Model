package test.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.BaseTest;

public class JavaScriptAlertBoxDemo extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.seleniumEasy.JavaScriptAlertBoxDemo.open();
    }

    @Test
    public void testClickToCloseAlertBox() {

        try {
            pages.seleniumEasy.JavaScriptAlertBoxDemo.clickButtonToOpenAlertBox();
            Thread.sleep(1000);

            pages.seleniumEasy.JavaScriptAlertBoxDemo.clickOkToCloseAlertBox();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertFalse(
                pages.seleniumEasy.JavaScriptAlertBoxDemo.isAlertPresent()
        );
    }

    @Test
    public void testToAcceptConfirmBox() {
        String expectedMessage = "OK";
        pages.seleniumEasy.JavaScriptAlertBoxDemo.clickButtonToOpenConfirmBox();
        pages.seleniumEasy.JavaScriptAlertBoxDemo.clickOkToCloseConfirmBox();
        String actualMessage = pages.seleniumEasy.JavaScriptAlertBoxDemo.readMessageFromConfirmBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testToRejectConfirmBox() {
        String expectedMessage = "Cancel";
        pages.seleniumEasy.JavaScriptAlertBoxDemo.clickButtonToOpenConfirmBox();
        pages.seleniumEasy.JavaScriptAlertBoxDemo.clickCancelToCloseConfirmBox();
        String actualMessage = pages.seleniumEasy.JavaScriptAlertBoxDemo.readMessageFromConfirmBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testToSendKeysToPromptBox() {
        String expectedMessage = "Hello";

        pages.seleniumEasy.JavaScriptAlertBoxDemo.clickButtonToOpenPromptBox();
        pages.seleniumEasy.JavaScriptAlertBoxDemo.sendMessageToPromptBox(expectedMessage);
        pages.seleniumEasy.JavaScriptAlertBoxDemo.clickOkToClosePromptBox();
        String actualMessage = pages.seleniumEasy.JavaScriptAlertBoxDemo.readMessageFromPromptBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testToRejectPromptBox() {
        String expectedMessage = "";

        pages.seleniumEasy.JavaScriptAlertBoxDemo.clickButtonToOpenPromptBox();
        pages.seleniumEasy.JavaScriptAlertBoxDemo.clickCancelToClosePromptBox();
        String actualMessage = pages.seleniumEasy.JavaScriptAlertBoxDemo.readMessageFromPromptBox();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

}

