package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By UserName=By.id("username");
    private By password=By.id("password");
    private By loginButton=By.cssSelector("#login button");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void getUserName(String username){
    driver.findElement(UserName).sendKeys(username);
    }
    public void setPassword(String Password){
        driver.findElement(password).sendKeys(Password);
    }
    public SecureAreaPge clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPge(driver);
    }
}
