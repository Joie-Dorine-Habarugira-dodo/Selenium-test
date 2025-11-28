package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("chromedriver.exe", "C:\\Users\\hp\\Selenium-test\\Selenium-Test\\resources\\chromedriver.exe");
        driver= new ChromeDriver();
        goHome();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://www.lambdatest.com/selenium-playground/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
