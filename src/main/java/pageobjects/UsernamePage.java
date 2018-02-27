package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BaseClass;

public class UsernamePage extends BaseClass {

    @FindBy(xpath = "//span[@class='pwd_field']/input")
    public WebElement userfield;

    @FindBy(xpath = "//table[@class='lForm']/tbody/tr[6]/td[2]/a/img")
    public WebElement loginbutton;

    public UsernamePage(){
        PageFactory.initElements(driver,this);
    }

    public void enterusername(String username){
       // sendDatatofields(By.xpath("//span[@class='pwd_field']/input"),username);
        sendDatatofields(userfield,username);
    }

    public void clickonnext(){
      //  clickelement(By.xpath("//table[@class='lForm']/tbody/tr[6]/td[2]/a/img"));
        clickelement(loginbutton);
        driver.switchTo().frame("login_page");
    }
}
