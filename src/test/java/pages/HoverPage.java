package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoverPage {
    private WebDriver driver;
    private By figureBox= By.className("figure");
    public HoverPage(WebDriver driver) {
        this.driver = driver;

    }
    /**
     * @param index starts at 1
      **/
    public HoverCaption hoverOverFigure(int index){
        WebElement hoverFigure= driver.findElements(figureBox).get(index-1);
        Actions action=new Actions(driver);
        action.moveToElement(hoverFigure).perform();
        return new HoverCaption(hoverFigure.findElement(figureBox));
    }
    public class HoverCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public HoverCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        public String getTitle() {
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
    }

}
