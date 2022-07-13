package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    //    private static WebDriver driver;
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addArguments("--start-in-incognito");
        options.addArguments("--force-device-scale-factor=0.8");


        driver.set(new ChromeDriver(options));
        driver.get().manage().window().setSize(new Dimension(2000, 5000));

    }

    public static void closeDriver() {
//        driver.quit();
        driver.get().quit();
        driver.remove();
    }
}
