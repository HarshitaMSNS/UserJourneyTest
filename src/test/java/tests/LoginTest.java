package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void testLogin() {
        WebDriver driver=new ChromeDriver();
        driver.get("http://ec2-52-66-22-206.ap-south-1.compute.amazonaws.com:3000/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("Userjourney");
        driver.findElement(By.name("password")).sendKeys("Test@123");
        driver.findElement(By.className("MuiButton-label")).click();
        WebDriverWait wait=new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("logout")));
        driver.findElement(By.id("logout")).click();
        driver.quit();
    }
}
