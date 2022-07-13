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

            public static By inputMultipleCheckBox = By.xpath("//*[@class='cb1-element']");
            public static By buttonCheckAll = By.xpath("//*[@id='check1']");

        }

        public static class SelectDropdownList {
            public static By selectDayOfWeek = By.xpath("//*[@id='select-demo']");
            public static By fieldDayOfWeek = By.xpath("//*[@class='selected-value']");
        }

        public static class RadioButtonsDemo {
            public static By buttonGetCheckedValue = By.xpath("//*[@id= 'buttoncheck']");
            public static By fieldCheckedValue = By.xpath("//p[@class= 'radiobutton']");
            public static By buttonGetValues = By.xpath("(//button)[3]");
            public static By fieldGroupValue = By.xpath("//*[@class='groupradiobutton']");


            public static By inputByGender(String gender) {
                return By.xpath(
                        String.format("//*[@name = 'optradio' and @value='%s']", gender)
                );
            }

            public static By inputByGenderGroup(String gender) {
                return By.xpath(
                        String.format("//*[@value='%s' and @name='gender']", gender)
                );
            }

            public static By inputByAgeGroup(String ageGroup) {
                return By.xpath(
                        String.format("//*[@value='%s' and @name='ageGroup']", ageGroup)
                );
            }
        }

    }

    public static class DemoQa {
        public static class Home {
            public static By menuElements = By.xpath("//*[@class=\"category-cards\"]/div[1]");
        }

        public static class Elements {
            public static By menuButtons = By.xpath("//*[@class=\"element-list collapse show\" ]//*[@id=\"item-4\"]");

        }

        public static class Buttons {
            public static By buttonDoubleClick = By.xpath("//*[@id=\"doubleClickBtn\"]");
            public static By fieldDoubleClick = By.xpath("//*[@id=\"doubleClickMessage\"]");
            public static By buttonRightClick = By.xpath("//*[@id=\"rightClickBtn\"]");
            public static By fieldRightClick = By.xpath("//*[@id=\"rightClickMessage\"]");

        }
    }
}
