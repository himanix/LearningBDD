package pageobjects;

import org.openqa.selenium.By;
import pageobjects.BaseClass;

public class UsernamePage extends BaseClass {

    public void enterusername(String username){
        sendDatatofields(By.xpath("//span[@class='pwd_field']/input"),username);
    }

    public void clickonnext(){
        clickelement(By.xpath("//table[@class='lForm']/tbody/tr[6]/td[2]/a/img"));
        driver.switchTo().frame("login_page");
    }
}
