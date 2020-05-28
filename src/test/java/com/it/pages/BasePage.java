package com.it.pages;

import com.it.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
   protected static WebDriver driver = DriverFactory.getDriver();

    /*static {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
    }*/

    public BasePage() {
        PageFactory.initElements(driver, this);

    }
}
