package framework;

import org.openqa.selenium.WebDriver;

public class Driver {
    protected static WebDriver driver;

    public static WebDriver getInstanceOfDriver() {
        return driver;
    }
}
