package frames;

import dropdown.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {
        @Test
        public void testWysiwyg(){
                var editorPage = homePage.clickWysiwygEditor();
                editorPage.clearTextArea();

                String text1 = "hello";
                String text2 = "world";

                editorPage.setTextArea(text1);
                editorPage.increaseIndention();
                editorPage.setTextArea(text2);

                assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text is from editor is incorrect!");
        }
}
