package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Page {

    @Override
    public HomePage openPage() {
        driver.get("https://ftx.com");
        return this;
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickLanguageButton(){
        WebElement languageButton = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By
                        .xpath("//*[@id='root']/div/header/div/div/div[4]/button")));
        languageButton.click();
        return this;
    }
    public HomePage clickChangeLanguageToEnglishButton(){
        WebElement changeLanguageButton = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By
                        .xpath("/html/body/div[4]/div[3]/ul/li[1]")));
        changeLanguageButton.click();
        return this;
    }
    public String getLanguageButtonText(){
        WebElement languageButton = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By
                        .xpath("//*[@id='root']/div/header/div/div/div[4]/button")));
        return languageButton.getText();
    }

    public HomePage clickThemesButton(){
        WebElement themesButton = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By
                        .xpath("//*[@id='root']/div/header/div/div/button[2]/span[1]")));
        themesButton.click();
        return this;
    }
    public HomePage clickChangeThemeOnLightButton(){
        WebElement lightThemesButton = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By
                        .xpath("/html/body/div[4]/div[3]/ul/li[3]")));
        lightThemesButton.click();
        return this;
    }
    public String getThemeAttribute(){
        WebElement themesButton = (new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.presenceOfElementLocated(By
                        .xpath("/html/body/div[4]/div[3]/ul/li[3]")));
        return themesButton.getAttribute("class");
    }
}
