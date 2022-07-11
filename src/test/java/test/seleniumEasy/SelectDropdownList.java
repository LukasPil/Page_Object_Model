package test.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.BaseTest;

public class SelectDropdownList extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.seleniumEasy.SelectDropdownList.open();
    }

    @Test
    public void testSelectDropdownList() {

        String expectedMessage = "Friday";
        String actualMessage;

        pages.seleniumEasy.SelectDropdownList.selectDayFromDropdownList(expectedMessage);
        actualMessage = pages.seleniumEasy.SelectDropdownList.readMessage();

        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
