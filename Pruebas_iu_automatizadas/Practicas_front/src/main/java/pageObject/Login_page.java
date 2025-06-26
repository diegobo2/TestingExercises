package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page extends BaseClass {

    By userName = By.id("user-name");
    By password = By.id("password");
    By buttonLogin = By.id("login-button");

    public Login_page(WebDriver driver) {
        super(driver);
    }

    public void access() {
        type("standard_user", userName);
        type("secret_sauce", password);
        click(buttonLogin);
    }
}
