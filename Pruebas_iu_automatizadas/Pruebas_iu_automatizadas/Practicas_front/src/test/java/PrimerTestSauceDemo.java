import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertTrue;

public class PrimerTestSauceDemo {
    private WebDriver driver;

    By userName = By.id("user-name");
    By password = By.id("password");
    By buttonLogin = By.id("login-button");
    By pageInventoryTitle = By.xpath("//div[contains(text(),'Swag Labs')]");
    By buyBagButton = By.id("add-to-cart-sauce-labs-backpack");
    By cart = By.xpath("//a[@class='shopping_cart_link']");
    By checkoutButton = By.id("checkout");
    By firstNameInput = By.id("first-name");
    By lastNameInput = By.id("last-name");
    By postalCodeInput = By.id("postal-code");
    By continueButton = By.id("continue");
    By finishButton = By.id("finish");
    By confirmationMsg = By.xpath("//h2[@class='complete-header']");


    @Before
    public void setUp() {
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
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void buyProduct() throws InterruptedException {
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys("standard_user");
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(buttonLogin).click();
        driver.findElement(buyBagButton).click();
        driver.findElement(cart).click();
        Thread.sleep(2000);

        driver.findElement(checkoutButton).click();

        this.type("Maria Belen", firstNameInput);
        this.type("Vera", lastNameInput);
        this.type("5123", postalCodeInput);
        driver.findElement(continueButton).click();
        driver.findElement(finishButton).click();
        Thread.sleep(2000);

        assertTrue(driver.findElement(confirmationMsg).isDisplayed());

    }

    private void type(String text, By element) {
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }

    @Test
    public void loginTest() {
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys("standard_user");
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys("secret_sauce");
        driver.findElement(buttonLogin).click();

        assertTrue(driver.findElement(pageInventoryTitle).isDisplayed());
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
