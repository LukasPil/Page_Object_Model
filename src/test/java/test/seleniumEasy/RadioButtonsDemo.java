package test.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.BaseTest;

public class RadioButtonsDemo extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.seleniumEasy.RadioButtonsDemo.open();
    }

    @Test
    public void testRadioButtonByMaleGender(){
       String genderMale = "Male";
       String actualMessage;

pages.seleniumEasy.RadioButtonsDemo.clickRadioButton(genderMale);
pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
actualMessage = pages.seleniumEasy.RadioButtonsDemo.readMessage();

        Assert.assertTrue(actualMessage.contains(genderMale));
    }


    @Test
    public void testRadioButtonByFemaleGender(){
        String genderFemale = "Female";
        String actualMessage;

        pages.seleniumEasy.RadioButtonsDemo.clickRadioButton(genderFemale);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        actualMessage = pages.seleniumEasy.RadioButtonsDemo.readMessage();

        Assert.assertTrue(actualMessage.contains(genderFemale));
    }
}
