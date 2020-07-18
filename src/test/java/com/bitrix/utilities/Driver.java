package com.bitrix.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver() {

    }

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {

            String browser = ConfigurationReader.getProperty("browser");

            switch (browser) {
                case "Chrome":
                case "chrome":
                case "CHROME":
                    WebDriverManager.chromiumdriver().setup();
                   driver = new ChromeDriver();
                    break;

                case "Firefox":
                case "FIREFOX":
                case "firefox":
                    WebDriverManager.chromiumdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                default:
                    System.out.println("Browser not found");


            }
        }
      return driver;
            }

            public static void closeDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
            }


}
