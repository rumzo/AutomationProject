package frontend.negative;

import frontend.core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.UserLogin;

public class UserLoginTests extends BaseTest {

    @Test
    public void unsuccessfulLogin(){
        UserLogin.goTo();
        UserLogin.login("rumzo@abv.bg", "zazaag1");

        UserLogin.verifyVerificationMessage("Warning: No match for E-Mail Address and/or Password.", "the validation message on the login form was not present");
    }
}
