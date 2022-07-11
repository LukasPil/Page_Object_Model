package test.seleniumEasy;

import org.testng.annotations.Test;
import utils.Driver;

public class SimpleFormDemo {

    @Test
    public void testSingleInputFieldInSeleniumEasy() {
        Driver.setDriver();
        pages.seleniumEasy.SimpleFormDemo.open();

        pages.seleniumEasy.SimpleFormDemo.closeAd();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Driver.closeDriver();

    }
}
