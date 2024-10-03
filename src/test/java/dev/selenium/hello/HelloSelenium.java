package dev.selenium.hello;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

// See also:
// https://github.com/SeleniumHQ/seleniumhq.github.io/blob/trunk/examples/java/src/test/java/dev/selenium/drivers/RemoteWebDriverTest.java#L38-L39

public class HelloSelenium {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = null;

        try {
            URL gridUrl = URI.create("http://127.0.0.1:4444/wd/hub").toURL();
            driver = new RemoteWebDriver(gridUrl, options);

            driver.get("https://selenium.dev");
        } catch (MalformedURLException e) {
            System.err.println("Invalid URL: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                // Close the browser
                driver.quit();
            }
        }
    }
}
