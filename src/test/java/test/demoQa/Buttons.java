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
//        pages.demoQa.Buttons.open();
        pages.demoQa.Home.open();
        pages.demoQa.Home.clickElementsPage();
        pages.demoQa.Elements.clickButtonsPage();
    }

    @Test
    public void testDoubleClick() {
        String expectedMessage = "You have done a double click";

        pages.demoQa.Buttons.performDoubleclick();
        String actualMessage = pages.demoQa.Buttons.readMessageofDoubleClick();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void testRightClick (){
        String expectedMessage = "You have done a right click";
        pages.demoQa.Buttons.performRightClick();
        String actualMessage = pages.demoQa.Buttons.readMessageofRightClick();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
