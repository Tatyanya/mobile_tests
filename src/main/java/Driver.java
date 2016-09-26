import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {

    private static String deviceID = "emulator-5554";
    private static String url = "http://0.0.0.0:4723/wd/hub";
    private static String pathToApk = "d:/Program Files (x86)/Appium/node_modules/appium/build/unlock_apk/unlock_apk-debug.apk";

    private static AndroidDriver driver;

    public static void createDriver() throws MalformedURLException {
        driver = new AndroidDriver(new URL(url), getCaps());
    }

    public static AndroidDriver get() throws MalformedURLException {
        if (driver == null){
            createDriver();
        }
        return driver;
    }

    private static DesiredCapabilities getCaps(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceID);
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", pathToApk);
        return caps;
    }
}
