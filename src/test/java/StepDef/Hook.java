package StepDef;

import io.cucumber.java.Before;
import org.testng.util.Strings;

import static base.config.driver;
import static base.config.setupBrowser;

public class Hook {
    public static String browserType=System.getProperty("browser");
    public static String envType=System.getProperty("env");

    @Before
    public void beforeEachTest(){
        if(Strings.isNullOrEmpty(browserType)){
            browserType= "Chrome";
        }
        if(Strings.isNullOrEmpty(envType)){
            envType="QA";
        }

        driver=setupBrowser(browserType);
        if(envType.equalsIgnoreCase("qa")){
            driver.get("https://www.target.com/");
        }
        else{
            System.out.println("invalid envType:" +envType);
        }

    }
//    @After
//    public void afterEachTest(){
//        driver.quit();
//    }
}


