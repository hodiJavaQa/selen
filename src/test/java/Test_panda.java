import org.junit.Assert;
import org.junit.Test;

public class Test_panda {

        @Test
        public void sanityTest(){
                String url= "https://amazon.com";
                String expected= "Automation Panda | A blog for software development and testing";
                DOMselenium selenium= new DOMselenium();
                selenium.driver.get( url );
                Assert.assertEquals(expected , selenium.driver.getTitle() );
                selenium.driver.quit();
        }

        @Test
        public void contactUsPTest(){
                String expected ="Your message has been sent";
                String url = "https://automationpanda.com/";
                // selectors
                String contactSelector= "#menu-item-10 > a";
                String nameSelector="#g3-name";
                String emailSelector="#g3-email";
                String messageSelector= "#contact-form-comment-g3-message";
                String SubmitSelector="#contact-form-3 > form > div > div.wp-block-jetpack-button.wp-block-button > button";
                // inputs
                String nameInput="tania";
                String emailInput="taniagmail.com";
                String messageInput="i love pandas and i hate your website ";
                // declare
                DOMselenium selenium= new DOMselenium();
                //open window
                selenium.driver.get(url);
                selenium.getElement(contactSelector).click();
                selenium.getElement(nameSelector).sendKeys(nameInput);
                selenium.getElement(emailSelector).sendKeys(emailInput);
                selenium.getElement(messageSelector).sendKeys(messageInput);
                selenium.getElement(SubmitSelector).click();
                String actualValue =selenium.getElement(
                        "#contact-form-success-header").getText();
                Assert.assertEquals(expected,actualValue);



        }
}
