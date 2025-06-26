package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmOrder_page extends BaseClass{

    By finishButton = By.id("finish");
    By cancelButton = By.id("cancel");

    public ConfirmOrder_page(WebDriver driver) {
        super(driver);
    }
    public void confirmOrder(){
        click(finishButton);
    }
}
