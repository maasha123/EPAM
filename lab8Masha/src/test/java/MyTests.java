import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import page.HomePage;

public class MyTests {
    WebDriver driver;
    @BeforeGroups(groups = "ftx")
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(groups = "ftx", priority = 1)
    @Description("Change language from English to Russian")
    public void ChangeLanguage(){
        HomePage homePage = new HomePage(driver)
                .openPage()
                .clickLanguageButton()
                .clickChangeLanguageToEnglishButton();
        Assert.assertEquals(homePage.getLanguageButtonText(), "ENGLISH", "Language is not changed!");
    }

    @Test(groups = "ftx", priority = 2)
    @Description("Change currency from USD to RUB")
    public void ChangeTheme(){
        HomePage homePage = new HomePage(driver)
                .openPage()
                .clickThemesButton()
                .clickChangeThemeOnLightButton();
        Assert.assertTrue(homePage.getThemeAttribute().contains("selected"),"Theme is not changed!");
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        driver.manage().deleteAllCookies();
    }

    @AfterGroups(groups = "ftx")
    public void close(){driver.close();}
}
