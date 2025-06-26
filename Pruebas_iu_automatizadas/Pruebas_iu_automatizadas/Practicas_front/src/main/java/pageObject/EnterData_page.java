package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterData_page extends BaseClass {

    By firstNameInput = By.id("first-name");
    By lastNameInput = By.id("last-name");
    By postalCodeInput = By.id("postal-code");
    By continueButton = By.id("continue");
    By cancelButton = By.id("cancel");

    public EnterData_page(WebDriver driver) {
        super(driver);
    }

    public void insertBuyData() {
        type("Maria Belen", firstNameInput);
        type("Vera", lastNameInput);
        type("5123", postalCodeInput);
        click(continueButton);
    }

}
