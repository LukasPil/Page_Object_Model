package test.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;

public class SimpleFormDemo {

    @Test
    public void testSingleInputFieldInSeleniumEasy() {
        Driver.setDriver();
        pages.seleniumEasy.SimpleFormDemo.open();
        pages.seleniumEasy.SimpleFormDemo.closeAd();

        String expectedMessage = "Lukas";
        String actualMessage;

        pages.seleniumEasy.SimpleFormDemo.enterMessage(expectedMessage);
        //        WebElement inputSingleField = driver.findElement(By.xpath("//input[@id='user-message']"));
//        inputSingleField.sendKeys(expectedMessage);
        pages.seleniumEasy.SimpleFormDemo.clickShowMessageButton();
//        WebElement buttonShowMessage = driver.findElement(By.xpath("//*[@id='get-input']//button"));
//        buttonShowMessage.click();
        actualMessage = pages.seleniumEasy.SimpleFormDemo.readMessage();
//        WebElement spanMessage = driver.findElement(By.xpath("//span[@id='display']"));
//        actualMessage = spanMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);

        Driver.closeDriver();

    }
}
