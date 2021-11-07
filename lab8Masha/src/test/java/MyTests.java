import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class MyTests {
    WebDriver driver;
    HomePage homePage;
    @BeforeGroups(groups = "okex")
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://okex.com");
        driver.manage().window().maximize();
    }
    @Test(groups = "okex", priority = 1)
    @Description("Change language from English to Russian")
    public void ChangeLanguage() throws InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        Assert.assertEquals(homePage.changeLanguage().getText(), "Войти", "Language is not changed!");
    }

    @Test(groups = "okex", priority = 2)
    @Description("Change currency from USD to RUB")
    public void ChangeCurrency(){
        Assert.assertTrue(homePage.changeCurrency().getText().contains("₽"), "Currency is not changed!");
    }

    @AfterGroups(groups = "okex")
    public void close(){driver.close();}
}
