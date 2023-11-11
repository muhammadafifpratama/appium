package appium.fitur;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class feature {

    public static AndroidDriver driver;
    public static DesiredCapabilities capabilities;
    public static String baseUri = "http://127.0.0.1:4723/wd/hub";
    @Test
    public void main() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("app", System.getProperty("user.dir")+"/src/test/java/appium/apk/app-release.apk");
        capabilities.setCapability("autoGrantPermission", true);
        capabilities.setCapability("autoAcceptAlerts", true);

        URL url = new URL(baseUri);
        driver = new AndroidDriver(url,capabilities);

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        //klik search
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Search\n" + "Tab 2 of 3\"]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        //klik watchlist
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Watchlist\n" + "Tab 3 of 3\"]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        //klik home
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Home\n" + "Tab 1 of 3\"]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        //klik now playing
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Now playing\n" + "Tab 1 of 4\"]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        //klik upcoming
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Upcoming\n" + "Tab 2 of 4\"]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        //klik top rated
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Top Rated\n" + "Tab 3 of 4\"]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        //klik popular
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Popular\n" + "Tab 4 of 4\"]")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
                //fitur search di home
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("asd");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    }

}
