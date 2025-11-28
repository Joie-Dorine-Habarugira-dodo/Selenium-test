package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage {
    private WebDriver driver;
    private By hotspot= By.id("hot-spot");


    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHotspot(){
        Actions rightClick= new Actions(driver);
        rightClick.contextClick(driver.findElement(hotspot)).perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }


}
