package test.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.BaseTest;

public class RadioButtonsDemo extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.seleniumEasy.RadioButtonsDemo.open();
    }

    @DataProvider(name = "radioButtonGender")
    public Object[][] radioButtonGenderDataProvider(){
        return new Object[][]{
                {"Male"},
                {"Female"}
        };
    }

    @Test (dataProvider = "radioButtonGender")
    public void testRadioButtonGender(String gender) {

        pages.seleniumEasy.RadioButtonsDemo.clickRadioButton(gender);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        String actualMessage = pages.seleniumEasy.RadioButtonsDemo.readMessage();

        Assert.assertTrue(actualMessage.contains(gender));
    }


    @DataProvider(name = "groupRadioButtonGenderAndAgeGroup", parallel = true)
    public Object[][] radioButtonGenderAndAgeGroupDataProvider(){
        return new Object[][]{
                {"Male", "0 - 5"},
                {"Female", "0 - 5"},
                {"Male", "5 - 15"},
                {"Female", "5 - 15"},
                {"Male", "15 - 50"},
                {"Female", "15 - 50"}
        };
    }


    @Test (dataProvider = "groupRadioButtonGenderAndAgeGroup", threadPoolSize = 6)
    public void testGroupRadioButtonByGenderAndAgeGroup(String gender, String ageGroup) {
        pages.seleniumEasy.RadioButtonsDemo.selectMaleGender(gender);
        pages.seleniumEasy.RadioButtonsDemo.selectAgegroup(ageGroup);
        pages.seleniumEasy.RadioButtonsDemo.clickGetValues();
        String message = pages.seleniumEasy.RadioButtonsDemo.readValuesMessage();

        Assert.assertTrue(message.contains(gender));
        Assert.assertTrue(message.contains(ageGroup));
    }
}
