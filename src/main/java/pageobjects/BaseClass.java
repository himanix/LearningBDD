package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
   public static WebDriver driver;
    //WebDriverWait mwait=new WebDriverWait(driver,40);

    public BaseClass(){}

    public BaseClass(WebDriver driver){
        this.driver=driver;
    }

    public void openUrl(String url){ driver.get(url); }

    public void clickelement(By locator){
        driver.findElement(locator).click();
    }

    public void sendDatatofields(By locate,String data){
        driver.findElement(locate).sendKeys(data);
    }

    public String getTitle(){
        String title=driver.getTitle();
          return title;
    }

}
