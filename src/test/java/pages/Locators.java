package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class SeleniumEasy {

        public static class SimpleFormDemo {
            public static By formAd = By.xpath("//div[@id='at-cv-lightbox-content']");
            public static By buttonCloseAd = By.xpath("//*[@id='at-cv-lightbox-close']");
            public static By inputMessage = By.xpath("//input[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//*[@id='get-input']//button");
            public static By fieldMessage = By.xpath("//span[@id='display']");

            public static By inputA = By.xpath("//*[@id='sum1']");
            public static By inputB = By.xpath("//*[@id='sum2']");
            public static By buttonGetTotal = By.xpath("//*[@id='gettotal']//button");
            public static By elementTotal = By.xpath("//*[@id='displayvalue']");

        }

        public static class CheckBoxDemo {
            public static By inputSingleCheckBox = By.xpath("//*[@id='isAgeSelected']");
            public static By fieldSingleCheckBox = By.xpath("//*[@id='txtAge']");

        }

        public static class SelectDropdownList {
            public static By selectDayOfWeek = By.xpath("//*[@id='select-demo']");
            public static By fieldDayOfWeek = By.xpath("//*[@class='selected-value']");
        }

        public static class RadioButtonsDemo {
            public static By buttonGetCheckedValue = By.xpath("//*[@id= 'buttoncheck']");
            public static By fieldCheckedValue = By.xpath("//p[@class= 'radiobutton']");
            public static By inputByGender(String gender) {
                return By.xpath(String.format("//*[@name = 'optradio' and @value='%s']", gender));
            }
        }
    }
}
