package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMainMenuTest extends BaseScript{
    private static final int ONE_SECOND = 1000;

    private static final WebDriver driver = getDriver();

    public static void main(String[] args) {

        driver.get(Properties.getBaseAdminUrl());

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        loginButton.click();

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("tab-AdminDashboard")));

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("subtab-AdminParentOrders")));

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("subtab-AdminCatalog")));

        setSleepTime(ONE_SECOND);

        driver.navigate().back();
        checkMenuItem(driver.findElement(By.id("subtab-AdminParentCustomer")));

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("subtab-AdminParentCustomerThreads")));

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("subtab-AdminStats")));

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("subtab-AdminParentModulesSf")));

        setSleepTime(ONE_SECOND);

        driver.navigate().back();
        checkMenuItem(driver.findElement(By.id("subtab-AdminParentThemes")));

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("subtab-AdminParentShipping")));

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("subtab-AdminParentPayment")));

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("subtab-AdminInternational")));

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("subtab-ShopParameters")));

        setSleepTime(ONE_SECOND);

        checkMenuItem(driver.findElement(By.id("subtab-AdminAdvancedParameters")));

        setSleepTime(ONE_SECOND);

        driver.close();
    }

    private static void setSleepTime(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void checkSectionCorrectness(String title, WebDriver driver) {
        System.out.println("The user remains in the same section after the page refresh? - "
                + title.equals(driver.getTitle()));
    }

    private static void checkMenuItem(WebElement webElement) {
        webElement.click();
        String initialTitleOfSection = driver.getTitle();
        System.out.println(initialTitleOfSection);
        setSleepTime(2000);
        driver.navigate().refresh();
        checkSectionCorrectness(initialTitleOfSection, driver);
    }
}
