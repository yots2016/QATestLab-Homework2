package myprojects.automation.assignment2;

import myprojects.automation.assignment2.tests.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", BaseScript.class.getResource("/chromedriver.exe").getPath());
        return new ChromeDriver();
    }
}
