package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPge {
    private WebDriver driver;
    public SecureAreaPge(WebDriver driver){
        this.driver=driver;
    }
    private By getSecureArea=By.id("flash");
    public String getALertMassage(){
        return driver.findElement(getSecureArea).getText();
    }
}
