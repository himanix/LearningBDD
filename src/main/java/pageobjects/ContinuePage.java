package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BaseClass;

public class ContinuePage extends BaseClass {

    @FindBy(xpath = "//div[@class='full_container']/div[2]/div/a")
    public WebElement continuebutton;

    public ContinuePage(){
        PageFactory.initElements(driver,this);
    }

    public void clickoncontinue(){
       //clickelement(By.xpath("//div[@class='full_container']/div[2]/div/a"));
        clickelement(continuebutton);
    }

    public void switchframe(){
        WebElement frameelement=driver.findElement(By.name("login_page"));
        driver.switchTo().frame(frameelement);
    }
}
