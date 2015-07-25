package pagem;

import PageObjects.BasePage;
import PageObjects.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Jagdish on 25/07/2015.
 */
public class BaseTest extends BasePage {

    String url=LoadProps.getProperty("url");

     @Before
    public void startBrowser(){
       driver=new FirefoxDriver();
       driver.get(url);
       Utils.windowMaximize();
       Utils.waitForPageToLoad(10);
   }
   // @After
    public  void closeBrowser(){
        driver.quit();
    }
}
