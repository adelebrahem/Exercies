package ForgotPasswordTest;

import TestBasis.Basis;
import org.testng.annotations.Test;
import pages.ForgotPassword;

public class forgotTest extends Basis {
    @Test
    public void successfulTest(){
    ForgotPassword forget = homePage.clickForgetPassword();
    forget.getTheEmail("Adelhema18@gmail.com");
    forget.retrievePassword();

    }
}
