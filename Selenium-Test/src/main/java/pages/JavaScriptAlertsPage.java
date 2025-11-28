package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By alertButton= By.xpath("//p[text()='JavaScript Alerts']/button[@type='button']");

    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String triggerAlert(){
        driver.findElement(alertButton).click();
        Alert alert1=driver.switchTo().alert();
        alert1.accept();
        return alert1.getText();
    }




}
