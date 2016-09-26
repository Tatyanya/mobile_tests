import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class Tests {
    private AndroidDriver driver;

    public Tests() throws MalformedURLException {
        driver = Driver.get();
    }

    @Test
    public void apps() {
        driver.findElementByName("Apps").click();

        Assert.assertTrue(driver.findElementByName("API Demos").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Browser").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Google").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Calendar").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Camera").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Music").isDisplayed());
        Assert.assertTrue(driver.findElementByName("Maps").isDisplayed());
    }

    @Test
    public void music() {
        driver.findElementByName("Apps").click();
        driver.findElementByName("Music").click();
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.android.music:id/playlisttab\")").click();

        Assert.assertTrue(driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Recently added\")").isDisplayed());
    }
}
