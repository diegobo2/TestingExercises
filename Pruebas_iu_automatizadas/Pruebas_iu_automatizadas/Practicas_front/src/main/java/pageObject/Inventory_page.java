package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inventory_page extends BaseClass {

    By buyBagButton = By.id("add-to-cart-sauce-labs-backpack");
    By cart = By.xpath("//a[@class='shopping_cart_link']");
    By pageInventoryTitle = By.xpath("//div[contains(text(),'Swag Labs')]");

    public Inventory_page(WebDriver driver) {
        super(driver);
    }

    public boolean isInventoryPage() {
        return isDisplayed(pageInventoryTitle);
    }

    public void selectProduct() throws InterruptedException {
        click(buyBagButton);
        click(cart);
        Thread.sleep(2000);
    }
}
