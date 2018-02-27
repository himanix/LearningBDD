package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
   public static WebDriver driver;
    //WebDriverWait mwait=new WebDriverWait(driver,40);

    public BaseClass(){}

    public BaseClass(WebDriver driver){
        this.driver=driver;
    }

    public void openUrl(String url){ driver.get(url); }

    public void clickelement(WebElement element){
        element.click();
    }

    public void sendDatatofields(WebElement elem,String data){
        elem.sendKeys(data);
    }

    public String getTitle(){
        String title=driver.getTitle();
          return title;
    }

}
