package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.HomePage;
import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testContextMenu(){
        HomePage homePage = new HomePage(driver);
        homePage.clickContextMenu();
        ContextMenuPage contextMenuPage = new ContextMenuPage(driver);
        contextMenuPage.clickHotspot();
        assertEquals(contextMenuPage.getAlertText(), "You selected a context menu", "Incorrect Text");

    }
}
