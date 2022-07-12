package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

import java.time.LocalDate;
import java.util.List;

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

    public static void clickCheckBoxButton() {
        pages.Common.clickElement(Locators.SeleniumEasy.CheckBoxDemo.buttonCheckAll);
    }

    public static String getTextOfButtonCheckBox() {
        return pages.Common.getElementAttributeValue(
                Locators.SeleniumEasy.CheckBoxDemo.buttonCheckAll,
                "value"
        );
    }

    public static boolean checkSelectedStatusOfAllCheckboxes(boolean expectedStatus) {
        List<Boolean> statusList =
                pages.Common.getSelectedStatusOfCheckBoxesByLocator(
                  Locators.SeleniumEasy.CheckBoxDemo.inputMultipleCheckBox
                );

        for(Boolean status : statusList){
            if(status != expectedStatus) return false;
        }


        return true;
    }
}
