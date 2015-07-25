package pagem;

import PageObjects.BasePage;
import PageObjects.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jagdish on 25/07/2015.
 */
public class SmokeTestSuite extends BaseTest {
    LoginPage loginPage=new LoginPage();



    //Test Data
    String username=LoadProps.getProperty("username");
    String password=LoadProps.getProperty("password");
    String errormsg=LoadProps.getProperty("errormsg");


    @Test
    public void verifyUserCanLoginSuccessfully(){
        loginPage.goToLoginaPage();
        loginPage.login(username, password);
        Assert.assertTrue(Utils.isTextPresent(errormsg));

    }
}
