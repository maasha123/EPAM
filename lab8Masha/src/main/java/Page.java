import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    public void moveTo(WebElement element, WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    public void waitElement(WebElement element, WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
