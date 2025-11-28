package dataLoading;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicDataLoadingPage;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class DataLoadingTests extends BaseTests {
    @Test
    public void testDataLoading(){
        HomePage homePage= new HomePage(driver);
        homePage.clickDynamicDataLoading();
        DynamicDataLoadingPage dataLoadingPage= new DynamicDataLoadingPage(driver);
        assertTrue(dataLoadingPage.isUserDisplayed(),"User not displayed");
    }
}
