package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CheckMainMenuTest extends BaseScript{
    private static final int ONE_SECOND = 1000;
    private static final int TWO_SECOND = 2000;

    private static final WebDriver driver = getDriver();

    private static List<String> idsList = new ArrayList<>();


    public static void main(String[] args) {

        driver.get(Properties.getBaseAdminUrl());

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        loginButton.click();

        setSleepTime(ONE_SECOND);

        inializeIdsList();

        for (String id : idsList) {
            if (id.equals("subtab-AdminParentCustomer") || id.equals("subtab-AdminParentThemes")) {
                driver.navigate().back();
            }
            checkMenuItem(driver.findElement(By.id(id)));
            setSleepTime(ONE_SECOND);
        }

        driver.quit();
    }

    private static void inializeIdsList() {
        idsList.add("tab-AdminDashboard");
        idsList.add("subtab-AdminParentOrders");
        idsList.add("subtab-AdminCatalog");
        idsList.add("subtab-AdminParentCustomer");
        idsList.add("subtab-AdminParentCustomerThreads");
        idsList.add("subtab-AdminStats");
        idsList.add("subtab-AdminParentModulesSf");
        idsList.add("subtab-AdminParentThemes");
        idsList.add("subtab-AdminParentShipping");
        idsList.add("subtab-AdminParentPayment");
        idsList.add("subtab-AdminInternational");
        idsList.add("subtab-ShopParameters");
        idsList.add("subtab-AdminAdvancedParameters");
    }

    private static void setSleepTime(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void checkSectionCorrectness(String title) {
        System.out.println("The user remains in the same section after the page refresh? - "
                + title.equals(CheckMainMenuTest.driver.getTitle()));
    }

    private static void checkMenuItem(WebElement webElement) {
        webElement.click();
        String initialTitleOfSection = driver.getTitle();
        System.out.println(initialTitleOfSection);
        setSleepTime(TWO_SECOND);
        driver.navigate().refresh();
        checkSectionCorrectness(initialTitleOfSection);
    }
}
