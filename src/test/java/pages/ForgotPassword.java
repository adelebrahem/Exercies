package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private WebDriver driver;
    private By writeEmail=By.id("email");
    private By retrievePassword=By.id("form_submit");
    public ForgotPassword(WebDriver driver){
        this.driver=driver;
    }
    public void getTheEmail(String email){
        driver.findElement(writeEmail).sendKeys(email);
    }
    public void retrievePassword(){
        driver.findElement(retrievePassword).click();
    }
}
