package pageobjects;

import org.openqa.selenium.By;

public class GoogleHomePage extends BaseClass{


    public void getUrl(){
        openUrl("http://www.google.com");
    }

    public void enterkeyword(String keyword){
        sendDatatofields(By.xpath("//input[@id='lst-ib']"),keyword);
    }
    public void clickonSearch(){
        clickelement(By.xpath("//input[@name='btnK']"));
    }
    public String verifyTitle(){
        String actualTitle=getTitle();
        return actualTitle;
    }
}
