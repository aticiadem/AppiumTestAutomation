package turkcellSinav1TestAutomation;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public AndroidDriver<MobileElement> driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "5.2 Nexus 5X API 29");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10.0");
        caps.setCapability("appPackage", "com.turkcell.sinav1");
        caps.setCapability("appActivity",
                "com.turkcell.sinav1.presentation.ui.MainActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @Test
    public void loginTest() throws InterruptedException {
        loginAccount();
    }

    public void loginAccount() throws InterruptedException {
        MobileElement loginTel = driver.findElementById("editTextTelNo");
        MobileElement loginPassword = driver.findElementById("editTextPassword");
        MobileElement button = driver.findElementById("buttonLogin");
        loginTel.sendKeys("01111111111");
        // 01111111111
        loginPassword.sendKeys("#e&it1mm");
        // #e&it1m
        button.click();
        Thread.sleep(5000L);
        loginPassword.sendKeys("#e&it1m");
        button.click();
        Thread.sleep(1000L);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
