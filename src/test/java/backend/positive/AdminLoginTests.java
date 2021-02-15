package backend.positive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.backend.AdminDashboard;
import pages.backend.AdminLogin;
import utils.Browser;

public class AdminLoginTests {

    @Test
    public void successfullLogin(){
        AdminLogin.goTo();
        AdminLogin.login("admin", "parola123!");

        AdminDashboard.verifyPageTitle("Dashboard", "bug ako go nqma");
    }

}
