package pages.demoQa;

import pages.Common;
import pages.Locators;

public class Buttons {


    public static void open() {

        pages.Common.openUrl("https://demoqa.com/buttons");
    }

    public static void performDoubleclick() {
        Common.doubleClickByAction(Locators.DemoQa.Buttons.buttonDoubleClick);

    }

    public static String readMessageofDoubleClick() {

        return Common.getElementText(Locators.DemoQa.Buttons.fieldDoubleClick);
    }
}
