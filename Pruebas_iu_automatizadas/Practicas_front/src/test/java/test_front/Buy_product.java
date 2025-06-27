package test_front;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObject.*;
import static org.junit.Assert.assertTrue;

public class Buy_product {

    public WebDriver driver;

    Login_page login;
    Inventory_page inventory;
    ValidateOrder_page validator;
    EnterData_page enterData;
    ConfirmOrder_page confirmOrder;
    ConfirmPurchase_page confirmPurchase;

    @Before
    public void setUp(){
        confirmOrder = new ConfirmOrder_page(driver);
        driver = confirmOrder.chromeDriverConnection();
        confirmOrder.urlAccess("https://www.saucedemo.com/");
        login = new Login_page(driver);
        inventory = new Inventory_page(driver);
        validator = new ValidateOrder_page(driver);
        enterData = new EnterData_page(driver);
        confirmPurchase = new ConfirmPurchase_page(driver);
    }

    @Test
    public void test() throws InterruptedException {
        login.access();
        inventory.selectProduct();
        validator.validateProductSelected();
        enterData.insertBuyData();
        confirmOrder.confirmOrder();

        assertTrue(confirmPurchase.isConfirmationPurchasePage());
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
