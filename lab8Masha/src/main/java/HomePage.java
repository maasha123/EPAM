import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
    @FindBy(xpath = "//*[@id='navContainer']/ul/li[15]/ul/li[5]/div[1]/i")
    private WebElement settings;
    @FindBy(css = "li[rel='ru_Ru']")
    private WebElement russianLanguage;
    @FindBy(css = "li[rel='2']")
    private WebElement rubCurrency;
    @FindBy(xpath = "//*[@id='popularTickers']/ul[2]/li[1]/div[2]/div[1]/span")
    private WebElement price;

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement changeLanguage(){
        moveTo(settings, driver);
        russianLanguage.click();
        return driver.findElement(By.cssSelector("a[href='/account/login']"));
    }
    public WebElement changeCurrency(){
        moveTo(settings, driver);
        rubCurrency.click();
        waitElement(price, driver);
        return price;
    }
}
