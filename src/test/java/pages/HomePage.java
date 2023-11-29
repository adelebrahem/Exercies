package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public  LoginPage clickAuthenticatio(){
        clickLink("Form Authentication");
    return new LoginPage(driver);
    }
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public  ForgotPassword clickForgetPassword(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);

    }
   public HoverPage clickHover(){
        clickLink("Hovers");
        return new HoverPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
