package pages.seleniumEasy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Common;
import utils.Driver;

import java.time.Duration;

public class SimpleFormDemo {
    public static void open() {
        pages.Common.openUrl("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public static void closeAd() {
        Common.waitForElementToBeVisiable(By.xpath("//div[@id='at-cv-lightbox-content']"));
        Common.clickElement(By.xpath("//*[@id='at-cv-lightbox-close']"));

    }
}
