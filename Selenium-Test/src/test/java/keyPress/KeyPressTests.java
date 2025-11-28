package keyPress;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KeyPressPage;
import static org.testng.Assert.assertEquals;

public class KeyPressTests extends BaseTests {
    @Test
    public void testKeyPress(){
        HomePage homePage = new HomePage(driver);
        homePage.clickKeyPress();
        KeyPressPage keyPressPage = new KeyPressPage(driver);
        String text="jane"
        keyPressPage.inputText(text);
        assertEquals(keyPressPage.getText(),"You entered: jane", "incorrect text");
    }
}
