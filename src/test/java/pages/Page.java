package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Page {

    private WebDriver driver = Driver.getDriver();

    By sign_in_tab = By.xpath("//span[@class='ssrcss-qgttmg-AccountText eki2hvo4']");
    By userName = By.id("user-identifier-input");
    By password = By.id("password-input");
    By sign_in_button = By.xpath("//button[@id='submit-button']//span[contains(text(),'Sign in')]");
    By your_acct = By.xpath("//a[@class='ssrcss-1wrc3mj-NavigationLink-AccountLink eki2hvo9']");


    public void getUrl(final String url) {
        driver.navigate().to(url);
    }


    public void click_sign_in(){
        driver.findElement(sign_in_tab).click();
    }

    public void enter_userName(final String email){
        driver.findElement(userName).sendKeys(email);
    }

    public void enter_password(final String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public void click_signInBtn(){
        driver.findElement(sign_in_button).click();
    }

    public void verify_yourAcnt(){
        String Account = driver.findElement(your_acct).getText();
        Assert.assertEquals( "Your account", Account );
    }

}
