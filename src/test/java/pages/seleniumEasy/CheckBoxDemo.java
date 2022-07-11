package pages.seleniumEasy;

import pages.Locators;

import java.time.LocalDate;

public class CheckBoxDemo {

    public static void open() {
        pages.Common.openUrl("https://demo.seleniumeasy.com/basic-checkbox-demo.html\n");
    }


    public static void clickSinlgeCheckBox() {
pages.Common.clickElement(Locators.SeleniumEasy.CheckBoxDemo.inputSingleCheckBox);
    }

    public static String readMessage() {
      return pages.Common.getElementText(Locators.SeleniumEasy.CheckBoxDemo.fieldSingleCheckBox);
    }
}
