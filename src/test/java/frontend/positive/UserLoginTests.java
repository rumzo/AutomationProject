package frontend.positive;

import frontend.core.BaseTest;
import pages.frontend.MyAccount;
import pages.frontend.UserLogin;
import org.testng.annotations.Test;

public class UserLoginTests extends BaseTest {

    @Test
    public void successfuLogin(){
        UserLogin.goTo();
        UserLogin.login("rumzo@abv.bg", "1q2w3e11");

        MyAccount.verifyPageTitle("Pragmatic Test Store", "Unable to locate the title for My Account page");


    }
}
