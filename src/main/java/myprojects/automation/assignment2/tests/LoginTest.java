package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseScript {
    private static final int ONE_SECOND = 1000;

    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get(Properties.getBaseAdminUrl());

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        loginButton.click();

        setSleepTime(ONE_SECOND);

        WebElement employeeAvatar = driver.findElement(By.className("employee_avatar_small"));
        employeeAvatar.click();

        setSleepTime(ONE_SECOND);

        WebElement headerLogout = driver.findElement(By.id("header_logout"));
        headerLogout.click();

        setSleepTime(ONE_SECOND);

        driver.quit();
    }

    private static void setSleepTime(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
