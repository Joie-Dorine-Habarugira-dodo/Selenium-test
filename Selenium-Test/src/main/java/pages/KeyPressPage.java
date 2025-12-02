package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private WebDriver driver;
    private By inputField= By.id("my_field");
    private By result=By.id("result");
    public KeyPressPage(WebDriver driver) {
        this.driver=driver;
    }

    public void inputText(){
        driver.findElement(inputField).sendKeys("Janee"+Keys.BACK_SPACE);
    }

    public String getText(){
        return driver.findElement(result).getText();
    }

}
