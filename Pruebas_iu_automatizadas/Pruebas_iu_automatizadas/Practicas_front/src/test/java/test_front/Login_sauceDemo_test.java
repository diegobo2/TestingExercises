package test_front;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObject.Inventory_page;
import pageObject.Login_page;
import static org.junit.Assert.assertTrue;

public class Login_sauceDemo_test {

    public WebDriver driver;
    Login_page login;
    Inventory_page inventory;

    @Before
    public void setUp() {
        login = new Login_page(driver);
        driver = login.chromeDriverConnection();
        login.urlAccess("https://www.saucedemo.com/");

        inventory = new Inventory_page(driver);
    }

    @Test
    public void successLogIn() throws InterruptedException {
        login.access();
        Thread.sleep(2000);

        assertTrue(inventory.isInventoryPage());
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
