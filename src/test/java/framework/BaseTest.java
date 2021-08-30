package framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Driver {
    public WebDriver driver;

//    @BeforeMethod
//    public void setUp() {
//        driver = getInstanceOfDriver();
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}
