package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class HomePage extends BaseClass {


    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@id='loginsubmit']")
    public WebElement loginbutton;

    public void openhomepage(){
        driver.get("https://www.hdfcbank.com/");
    }

    public void clickonlogin(){
       // clickelement(By.xpath("//a[@id='loginsubmit']"));
        clickelement(loginbutton);
    }

    public void movedriverhandle(){
        String handle=driver.getWindowHandle();

        Set handles=driver.getWindowHandles();
        System.out.println(handles);
        for(String handle1:driver.getWindowHandles()){
            System.out.println(handle1);
            driver.switchTo().window(handle1);
        }
    }
}
