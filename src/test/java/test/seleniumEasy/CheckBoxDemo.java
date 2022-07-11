package test.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.BaseTest;
import utils.Driver;

import java.util.prefs.BackingStoreException;

public class CheckBoxDemo extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp(){
        super.setUp();
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


}
