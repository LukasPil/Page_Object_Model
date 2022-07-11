package test.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Driver;

public class CheckBoxDemo {

    @BeforeMethod
    public void setUp() {
        Driver.setDriver();
        pages.seleniumEasy.CheckBoxDemo.open();
    }

    @Test
    public void testSingleCheckBox() {
        String expectedMessage = "Success - Check box is checked";
        String actualMessage;

        pages.seleniumEasy.CheckBoxDemo.clickSinlgeCheckBox();
        actualMessage = pages.seleniumEasy.CheckBoxDemo.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}
