package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.BaseClass;

public class ContinuePage extends BaseClass {

    public void clickoncontinue(){
       clickelement(By.xpath("//div[@class='full_container']/div[2]/div/a"));
    }

    public void switchframe(){
        WebElement frameelement=driver.findElement(By.name("login_page"));
        driver.switchTo().frame(frameelement);
    }
}
