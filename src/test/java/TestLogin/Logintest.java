package TestLogin;

import TestBasis.Basis;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPge;

import static org.testng.Assert.assertTrue;

public class Logintest extends Basis {
    @Test
    public void loginSuccessful(){
    LoginPage login=homePage.clickAuthenticatio();
    login.getUserName("tomsmith");
    login.setPassword("SuperSecretPassword!");
SecureAreaPge secureAreaPge=login.clickOnLoginButton();
    assertTrue (secureAreaPge.getALertMassage().contains("You logged into a secure area!"),
            "The alert is incorrect");

}
}
