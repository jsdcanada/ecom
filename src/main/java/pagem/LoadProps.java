package pagem;

import PageObjects.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Jagdish on 25/07/2015.
 */
public class LoadProps extends BasePage {
    static Properties prop;
    static String getPropertiesFileLocation="src/test/java/Properties/";
    static String PropetiesFileName="TestData.properties";
    static FileInputStream input;
    public static String getProperty(String key){
        prop =new Properties();
        try {
            input=new FileInputStream(getPropertiesFileLocation+PropetiesFileName);
            prop.load(input);
            input.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

}

