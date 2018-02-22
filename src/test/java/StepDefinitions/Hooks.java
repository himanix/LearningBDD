package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.BaseClass;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void startbrowser(){
        String exepath="src\\main\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",exepath);
        driver = new ChromeDriver();
        BaseClass bc=new BaseClass(driver);
    }

    @After
    public void closebrowser(){
        driver.quit();
    }
}
