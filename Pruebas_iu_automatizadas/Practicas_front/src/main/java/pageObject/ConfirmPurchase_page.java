package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmPurchase_page extends BaseClass {

    By backHomeButton = By.id("back-to-products");
    By purchaseConfirmationMsg = By.xpath("//h2[@class='complete-header']");

    public ConfirmPurchase_page(WebDriver driver) {
        super(driver);
    }

    public boolean isConfirmationPurchasePage() {
        return isDisplayed(purchaseConfirmationMsg);
    }
}
