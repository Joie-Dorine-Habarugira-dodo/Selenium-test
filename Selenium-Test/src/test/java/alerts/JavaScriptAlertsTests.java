package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JavaScriptAlertsPage;
import static org.testng.Assert.assertEquals;

public class JavaScriptAlertsTests extends BaseTests {
    @Test
    public void testJavaScriptAlerts(){
        HomePage homePage = new HomePage(driver);
        homePage.clickAlertBoxDemo();
        JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
        javaScriptAlertsPage.triggerAlert();
        assertEquals(javaScriptAlertsPage.getAlertText(), "I am an alert box!", "Incorrect alert text");
    }

    @Test
    public void testConfirmBox(){
        HomePage homePage = new HomePage(driver);
        homePage.clickAlertBoxDemo();
        JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
        javaScriptAlertsPage.triggerConfirm();
        javaScriptAlertsPage.alert_cancel();
        assertEquals(javaScriptAlertsPage.getConfirmText(), "You pressed Cancel!", "Incorrect text");
    }

    @Test
    public void testPromptBox(){
        HomePage homePage = new HomePage(driver);
        homePage.clickAlertBoxDemo();
        JavaScriptAlertsPage javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
        javaScriptAlertsPage.triggerPrompt();
        javaScriptAlertsPage.inputPromptText();
        javaScriptAlertsPage.alert_accept();
        assertEquals(javaScriptAlertsPage.getPromptText(), "You have entered 'jane' !", "Incorrect alert text");
    }
}
