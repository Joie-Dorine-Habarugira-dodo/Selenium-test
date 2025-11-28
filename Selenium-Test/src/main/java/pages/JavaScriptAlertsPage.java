package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By alertButton= By.xpath("//p[text()='JavaScript Alerts']/button[@type='button']");
    private By confirmButton= By.xpath("//p[text()='Confirm box:']/button[@type='button']");
    private By promptButton= By.xpath("//p[text()='Prompt box:']/button[@type='button']");
    private By confirmText= By.id("confirm-demo");
    private By promptText= By.id("prompt-demo");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(alertButton).click();
    }
    public void triggerConfirm(){
        driver.findElement(confirmButton).click();
    }
    public void triggerPrompt(){
        driver.findElement(promptButton).click();
    }
    public void alert_accept(){
        driver.switchTo().alert().accept();
    }
    public void alert_cancel(){
        driver.switchTo().alert().dismiss();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public String getConfirmText(){
        return driver.findElement(confirmText).getText();
    }
    public void inputPromptText(){
        driver.switchTo().alert().sendKeys(Keys.chord(Keys.CONTROL, "a")+Keys.BACK_SPACE);
        driver.switchTo().alert().sendKeys("jane");
    }
    public String getPromptText(){
        return driver.findElement(promptText).getText();
    }








}
