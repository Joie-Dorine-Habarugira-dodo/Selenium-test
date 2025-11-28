package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private WebDriver driver;
    private By inputField= By.id("my_field");
    private By result=By.id("result");
    public KeyPressPage(WebDriver driver) {
        this.driver=driver;
    }

    public void inputText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getText(){
        return driver.findElement(result).getText();
    }

}
