package frontend.positive;

import frontend.core.BaseTest;
import org.testng.annotations.Test;
import pages.frontend.RegisterAccount;

public class UserRegistrationTests extends BaseTest {

    @Test
    public void succesfsulRegistration(){
        RegisterAccount.goTo();
        RegisterAccount.register("Ivan", "Ivanov", "zzzz@zzz.com", 55555, "parola12", "parola12");
        RegisterAccount.verifyRegistrationMessage("Your Account Has Been Created!", "Unable to locate the registration message");
    }
}
