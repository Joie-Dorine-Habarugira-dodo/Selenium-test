package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxDemoPage {
    private WebDriver driver;
    private By singleCheckbox= By.xpath("//label[text()='Click on check box']/input[@type='checkbox']");
    private By confirmationText= By.xpath("//label[text()='Click on check box']/following-sibling::p[1]");

    public CheckboxDemoPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickSingleCheckbox(){
        driver.findElement(singleCheckbox).click();
    }

    public String getConfirmationText(){
        return driver.findElement(confirmationText).getText();
    }
}
