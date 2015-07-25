package pagem;

import PageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jagdish on 25/07/2015.
 */
public class Utils extends BasePage {

    public static void click(By by){
        driver.findElement(by).click();
    }

    public static void enterText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public static void selectfFromList(By by, String text){
        Select select =new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void windowMaximize(){
        driver.manage().window().maximize();
    }
    public static void waitForPageToLoad(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
    public static String getValue(By by){
        return driver.findElement(by).getAttribute("value");
    }
    public static boolean isTextPresent(String text){
        return driver.findElement(By.tagName("body")).getText().contains(text);
    }
    public static void waitForElementPresent(By by, int time){
        WebDriverWait wait= new  WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static boolean isElemnetPresent(By by){
        return driver.findElement(by).isDisplayed();
    }
    public static String randomDate(){
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        return format.format(new Date());
    }
    public static String getText(By by){
        return driver.findElement(by).getText();
    }
}
