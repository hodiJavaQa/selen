import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOMselenium {
    WebDriver driver;

    public DOMselenium() {
        System.setProperty("webdriver.chrome.driver"
                ,
                "/Users/hothaifa/Desktop/chromedriver");
        this.driver = new ChromeDriver();
    }

    public WebElement getElement(String selector){
        WebElement element = this.driver
                .findElement(By.cssSelector(selector));
        return element;
    }



}
