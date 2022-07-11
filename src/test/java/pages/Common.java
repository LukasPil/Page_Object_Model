package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void clickElement(By locator) {

        WebElement buttonCloseAd = Driver.getDriver().findElement(locator);
        buttonCloseAd.click();
    }

    public static void waitForElementToBeVisiable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
