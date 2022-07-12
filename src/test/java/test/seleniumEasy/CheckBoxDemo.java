package test.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.BaseTest;
import utils.Driver;

import java.util.prefs.BackingStoreException;

public class CheckBoxDemo extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
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

    @DataProvider(name = "multipleCheckBox")
    public Object[][] multipleCheckBoxDataProvider() {
        return new Object[][]{
                {"Uncheck All", true},
                {"Check All", false},

        };
    }

    @Test(dataProvider = "multipleCheckBox")
    public void testMultipleCheckBox(String expectedButtonText, boolean expectedStatus) {
//         1. Spaudziam mygtuka 'Check all'
        // 2. Patikrinam mygtuko teksta (turetu buti 'Uncheck all')
        // 3. Patikrinam, kad visi checkbox'ai yra pazymeti
        // 4. Spaudziam mygtuka 'Uncheck all'
        // 5. Patikrinam mygtuko teksta (turetu buti 'Check all')
        // 6. Patikrinma, kad visi checkbox'ai yra nuzymeti


        pages.seleniumEasy.CheckBoxDemo.clickCheckBoxButton();
        if (!expectedStatus) pages.seleniumEasy.CheckBoxDemo.clickCheckBoxButton();

        String actualButtonText = pages.seleniumEasy.CheckBoxDemo.getTextOfButtonCheckBox();
        Assert.assertEquals(actualButtonText, expectedButtonText);

        boolean status = pages.seleniumEasy.CheckBoxDemo.checkSelectedStatusOfAllCheckboxes(expectedStatus);
        Assert.assertTrue(status);

//        pages.seleniumEasy.CheckBoxDemo.clickCheckBoxButton();
//        actualButtonText = pages.seleniumEasy.CheckBoxDemo.getTextOfButtonCheckBox();
//        Assert.assertEquals(actualButtonText, expectedUnheckButtonText);
//
//        status = pages.seleniumEasy.CheckBoxDemo.checkSelectedStatusOfAllCheckboxes(false);
//        Assert.assertTrue(status);

    }
}
