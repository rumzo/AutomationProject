package backend.negative;

import backend.core.BaseTest;
import org.testng.annotations.Test;
import pages.backend.AdminLogin;
import utils.Browser;

public class AdminLoginTests extends BaseTest {

    @Test
    public void unsuccessfulLogin(){
        AdminLogin.goTo();
        AdminLogin.login("admin", "ajsdjasda");

        AdminLogin.verifyValidationMessage("Invalid token session. Please login again.", "the validation message on the login form was not present");
    }

}
