package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get(Properties.getBaseAdminUrl());

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        loginButton.click();

        setSleepTime(2000);

        WebElement adminDashboard = driver.findElement(By.id("tab-AdminDashboard"));
        adminDashboard.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        WebElement adminParentOrders = driver.findElement(By.id("subtab-AdminParentOrders"));
        adminParentOrders.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        WebElement adminCatalog = driver.findElement(By.id("subtab-AdminCatalog"));
        adminCatalog.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        driver.navigate().back();
        WebElement adminParentCustomer = driver.findElement(By.id("subtab-AdminParentCustomer"));
        adminParentCustomer.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        WebElement adminParentCustomerThreads = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        adminParentCustomerThreads.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        WebElement adminStats = driver.findElement(By.id("subtab-AdminStats"));
        adminStats.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        WebElement adminParentModulesSf = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        adminParentModulesSf.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        driver.navigate().back();
        WebElement adminParentThemes = driver.findElement(By.id("subtab-AdminParentThemes"));
        adminParentThemes.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        WebElement adminParentShipping = driver.findElement(By.id("subtab-AdminParentShipping"));
        adminParentShipping.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        WebElement adminParentPayment = driver.findElement(By.id("subtab-AdminParentPayment"));
        adminParentPayment.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        WebElement adminInternational = driver.findElement(By.id("subtab-AdminInternational"));
        adminInternational.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        WebElement shopParameters = driver.findElement(By.id("subtab-ShopParameters"));
        shopParameters.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        WebElement adminAdvancedParameters = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        adminAdvancedParameters.click();
        System.out.println(driver.getTitle());
        setSleepTime(2000);
        driver.navigate().refresh();

        setSleepTime(2000);

        driver.close();
    }

    private static void setSleepTime(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
