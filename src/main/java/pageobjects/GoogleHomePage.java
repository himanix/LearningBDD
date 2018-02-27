package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends BaseClass{

    public GoogleHomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='lst-ib']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@value='Google Search']")
    public WebElement searchButton;

    public void getUrl(){
        openUrl("http://www.google.com");
    }

    public void enterkeyword(String keyword){
        sendDatatofields(searchBox,keyword);
    }
    public void clickonSearch(){
        clickelement(searchButton);
    }
    public String verifyTitle(){
        String actualTitle=getTitle();
        return actualTitle;
    }


     /*  public void enterkeyword(String keyword){
        sendDatatofields(By.xpath("//input[@id='lst-ib']"),keyword);
    }
    public void clickonSearch(){
        clickelement(By.xpath("//input[@value='Google Search']"));
    }*/



}
