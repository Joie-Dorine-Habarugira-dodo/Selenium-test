package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormDemoPage {
    private WebDriver driver;

    private By nameField=By.name("name");
    private By emailField=By.id("inputEmail4");
    private By passwordField=By.name("password");
    private By companyField=By.name("company");
    private By websiteField=By.name("website");
    private By countryField=By.name("country");
    private By cityField=By.name("city");
    private By addressField=By.name("address_line1");
    private By addressField2=By.name("address_line2");
    private By stateField=By.id("inputState");
    private By zipCodeField=By.id("inputZip");

    private By submitButton= By.xpath("//button[text()='Submit']");

    public FormDemoPage(WebDriver driver){
        this.driver=driver;
    }

    public void setName(){
        driver.findElement(nameField).sendKeys("Joie Dorine Habarugira");
    }
    public void setEmail(){
        driver.findElement(emailField).sendKeys("joiedorine.habarugira22a@kepler.org");
    }
    public void setPassword(){
        driver.findElement(passwordField).sendKeys("12345678");
    }
    public void setCompany(){
        driver.findElement(companyField).sendKeys("The Gym Rwanda");
    }
    public void setWebsite(){
        driver.findElement(websiteField).sendKeys("https://www.the-gym.rw/");
    }
    public void setCountry(){
        driver.findElement(countryField).sendKeys("Rwanda");
    }
    public void setCity(){
        driver.findElement(cityField).sendKeys("Kigali City");
    }
    public void setAddress1(){
        driver.findElement(addressField).sendKeys("KG 29 Ave 16");
    }
    public void setAddress2(){
        driver.findElement(addressField2).sendKeys("KG 29 Ave 16");
    }
    public void setState(){
        driver.findElement(stateField).sendKeys("Kigali");
    }
    public void setZipCode(){
        driver.findElement(zipCodeField).sendKeys("00000");
    }
    public SuccessfulSubmissionPage clickSubmit(){
        driver.findElement(submitButton).click();
        return new SuccessfulSubmissionPage(driver);
    }
}
