package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulSubmissionPage {
    private WebDriver driver;
    private By successMessage= By.className("success-msg");

    public SuccessfulSubmissionPage(WebDriver driver){
        this.driver= driver;
    }

    public String getSuccessMessage(){
        return driver.findElement(successMessage).getText();
    }

}
