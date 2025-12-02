package form;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FormDemoPage;
import pages.HomePage;
import pages.SuccessfulSubmissionPage;

import static org.testng.Assert.assertEquals;

public class FormDemoTests extends BaseTests {
    @Test
    public void testInputForm(){
        HomePage homePage = new HomePage(driver);
        homePage.clickFormDemo();
        FormDemoPage formDemoPage= new FormDemoPage(driver);
        formDemoPage.setName();
        formDemoPage.setEmail();
        formDemoPage.setPassword();
        formDemoPage.setCompany();
        formDemoPage.setWebsite();
        formDemoPage.setCountry();
        formDemoPage.setCity();
        formDemoPage.setAddress1();
        formDemoPage.setAddress2();
        formDemoPage.setState();
        formDemoPage.setZipCode();
        formDemoPage.clickSubmit();
        SuccessfulSubmissionPage sucessfullSubmissionPage= new SuccessfulSubmissionPage(driver);
        assertEquals(sucessfullSubmissionPage.getSuccessMessage(), "Thanks for contacting us, we will get back to you shortly.", "Incorrect message");
    }
}
