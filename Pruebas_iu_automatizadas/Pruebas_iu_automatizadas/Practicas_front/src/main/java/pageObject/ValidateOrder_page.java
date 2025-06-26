package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidateOrder_page extends BaseClass {

    By checkoutButton = By.id("checkout");
    By removeButton = By.id("remove-sauce-labs-backpack");
    By continueShoppingButton = By.id("continue-shopping");

    public ValidateOrder_page(WebDriver driver) {
        super(driver);
    }

    public void validateProductSelected() {
        click(checkoutButton);
    }



}
