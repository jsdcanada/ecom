package PageObjects;

import org.openqa.selenium.By;
import pagem.Utils;

/**
 * Created by Jagdish on 25/07/2015.
 */

public class LoginPage extends BasePage {
    By usernamefield=By.id("Email");
    By passwordfield=By.id("Password");
    By loginfield=By.xpath("//form/div[3]/input");
    By loginlinkfield= By.linkText("Log in");
    public void login(String username, String password){
        Utils.enterText(usernamefield,username);
        Utils.enterText(passwordfield,password);
        Utils.click(loginfield);

    }
    public void goToLoginaPage(){
      Utils.click(loginlinkfield);
    }
}
