package alerts;

import dropdown.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


@SuppressWarnings("TestFailedLine")
public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\Cristian\\IdeaProjects\\TestAutomation\\resources\\chromedriver.exe");
    assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded files incorrect");
    }
}
