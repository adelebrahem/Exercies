package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By selectElement = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setSelectElement(String option){
        findDropdownElements().selectByVisibleText(option);
    }
   public List<String>getOptions(){
        List<WebElement> selectElements=findDropdownElements().getAllSelectedOptions();
        return selectElements.stream().map(e->e.getText()).collect(Collectors.toList());
   }
    private Select findDropdownElements(){
        return new Select(driver.findElement(selectElement));
    }
}
 /*  public void selectOptions( String options){
       findDropdownElements().selectByVisibleText(options);
   }
   public List<String> getOptions(){
    List<WebElement> selectElements=findDropdownElements().getAllSelectedOptions();
    return selectElements.stream().map(e->e.getText()).collect(Collectors.toList());
   }

}*/
