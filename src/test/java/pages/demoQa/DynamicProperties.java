package pages.demoQa;

import pages.Locators;

public class DynamicProperties {

    public static void open() {
        pages.Common.openUrl("https://demoqa.com/dynamic-properties");
    }

    public static void clickButtonAferEnabled() {
        pages.Common.waitForElementToBeClickable(Locators.DemoQa.DynamicProperties.buttonAfterEnabled);
        pages.Common.clickElement(Locators.DemoQa.DynamicProperties.buttonAfterEnabled);
    }

    public static void clickButtonAfterColorChange() {
    String attributeName = "class";
    String attributeValue = "text-danger";
        pages.Common.waitForElementAttributeContains(
                Locators.DemoQa.DynamicProperties.buttonAfterColorChange,
                attributeName,
                attributeValue

        );
        pages.Common.clickElement(Locators.DemoQa.DynamicProperties.buttonAfterColorChange);
    }
}
