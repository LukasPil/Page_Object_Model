package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }


    public static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }


    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String keys) {
        getElement(locator).sendKeys(keys);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByValue(By locator, String value) {
        WebElement webElement = getElement(locator);
        Select selectElement = new Select(webElement);
        selectElement.selectByValue(value);

    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static List<Boolean> getSelectedStatusOfCheckBoxesByLocator(By locator) {
        List<WebElement> elemenentsList = getElements(locator);
        List<Boolean> statusList = new ArrayList<>();

        for (WebElement element : elemenentsList) {
            statusList.add(element.isSelected());

        }
        return statusList;
    }

    public static void doubleClickByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.doubleClick(element);
        action.perform();
    }

    public static void clickElementByAction(By locator) {

        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.click();
        action.perform();

    }

    public static void rightClickByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.contextClick(element);
        action.perform();

    }

    public static void waitForElementToBeVisiable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(
                ExpectedConditions.elementToBeClickable(locator));

    }

    public static void waitForElementAttributeContains(
            By locator,
            String atributeName,
            String atributeValue) {

        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(
                ExpectedConditions.attributeContains(
                        locator,
                        atributeName,
                        atributeValue
                )
        );

    }

    public static void acceptAlert() {
        Driver.getDriver().switchTo().alert().accept();

    }

    public static void dismissAlert() {
        Driver.getDriver().switchTo().alert().dismiss();
    }
    public static void sendKeysToAlert(String keys) {

        Driver.getDriver().switchTo().alert().sendKeys(keys);
    }


    public static boolean isAlertPresent() {
        try {
            Driver.getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
