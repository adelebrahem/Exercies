package TestBasis;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class Basis {

    private ChromeDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setup(){
    driver=new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/");
    driver.manage().window().maximize();
    homePage=new HomePage(driver);

    }

    @AfterClass
     void tearDown() {
        driver.quit();
    }
}
