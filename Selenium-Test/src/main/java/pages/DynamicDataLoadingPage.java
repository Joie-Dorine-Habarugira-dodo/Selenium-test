package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicDataLoadingPage {
    private WebDriver driver;
    private By loadingDiv= By.id("loading");
    private By getRandomUserButton= By.id("save");

    public DynamicDataLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton(){
        driver.findElement(getRandomUserButton).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadingDiv)));
    }
    public boolean isUserDisplayed(){
        clickButton();
        return driver.findElement(loadingDiv).isDisplayed();
    }
}
