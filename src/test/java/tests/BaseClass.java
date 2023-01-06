package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class BaseClass {
	static AppiumDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities(); // creating an object

		caps.setCapability("deviceName", "Pixel 4a");
		caps.setCapability("platformName", "Android");
		caps.setCapability("udid", "07221JEC203984");
		caps.setCapability("platformVersion", "13");
		caps.setCapability("app", "");
		caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		// caps.setCapability("appPackage", "com.google.android.calculator");
		// caps.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, caps);

	}

	@Test
	public void sampleTest() {
		System.out.println("Sample Test is running");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
