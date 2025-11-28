package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public CheckboxDemoPage clickCheckboxDemo(){
        clickLink("Checkbox Demo");
        return new CheckboxDemoPage(driver);
    }

    public FormDemoPage clickFormDemo(){
        clickLink("Input Form Submit");
        return new FormDemoPage(driver);
    }
    public JavaScriptAlertsPage clickAlertBoxDemo(){
        clickLink("Javascript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public DynamicDataLoadingPage clickDynamicDataLoading(){
        clickLink("Dynamic Data Loading");
        return new DynamicDataLoadingPage(driver);
    }

    public KeyPressPage clickKeyPress(){
        clickLink("Key Press");
        return new KeyPressPage(driver);
    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)));
    }
}
