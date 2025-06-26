package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class BaseClass {

    public WebDriver driver;

    public BaseClass(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver chromeDriverConnection() {
        // === Chrome configuration ===
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);

        prefs.put("profile.password_manager_enable", false);
        options.setExperimentalOption("prefs", prefs);
        prefs.put("profile.default_content_setting_values.notifications", 2);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void type(String text, By locator) {
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public void urlAccess(String url) {
        driver.get(url);
    }

    public boolean isDisplayed(By locator) {
        try{
            return findElement(locator).isDisplayed();
        } catch( org.openqa.selenium.NoSuchElementException ex){
            return false;
        }
    }
}
