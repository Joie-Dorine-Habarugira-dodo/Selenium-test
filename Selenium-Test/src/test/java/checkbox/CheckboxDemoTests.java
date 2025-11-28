package checkbox;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CheckboxDemoPage;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class CheckboxDemoTests extends BaseTests {
    @Test
    public void testSingleCheckbox(){
        HomePage homePage= new HomePage(driver);
        homePage.clickCheckboxDemo();
        CheckboxDemoPage checkboxPage= new CheckboxDemoPage(driver);
        checkboxPage.clickSingleCheckbox();
        assertEquals(checkboxPage.getConfirmationText(), "Checked!", "Incorrect Text");
    }
}
