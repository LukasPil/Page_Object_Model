package pages.demoQa;

import pages.Common;
import pages.Locators;

public class Buttons {


    public static void open() {

        pages.Common.openUrl("https://demoqa.com/buttons");
    }

    public static void performDoubleclick() {
        pages.Common.doubleClickByAction(Locators.DemoQa.Buttons.buttonDoubleClick);

    }

    public static String readMessageofDoubleClick() {

        return pages.Common.getElementText(Locators.DemoQa.Buttons.fieldDoubleClick);
    }

    public static void performRightClick() {
        pages.Common.rightClickByAction(Locators.DemoQa.Buttons.buttonRightClick);

    }

    public static String readMessageofRightClick() {
        return pages.Common.getElementText(Locators.DemoQa.Buttons.fieldRightClick);

    }
}
