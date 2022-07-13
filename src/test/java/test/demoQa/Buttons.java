package test.demoQa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.BaseTest;

public class Buttons extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.demoQa.Buttons.open();
    }

    @Test
    public void testDoubleClick() {
        String expectedMessage = "You have done a double click";

        pages.demoQa.Buttons.performDoubleclick();
        String actualMessage = pages.demoQa.Buttons.readMessageofDoubleClick();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
