package newMytrip.saucelabs;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Saucelab_1  {
	@Test
	public  void chromeopt() throws IOException {
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("latest");
		Map<String, Object> sauceOptions = new HashMap<>();
		browserOptions.setCapability("sauce:options", sauceOptions);
		sauceOptions.put("username", System.getenv("oauth-sananthkumar1611-1043c"));
		sauceOptions.put("accessKey", System.getenv("66370f7d-379a-418b-9ab2-5070d1628fd3"));
		sauceOptions.put("name", "ABCD");

		browserOptions.setCapability("sauce:options", sauceOptions);
		URL url = new URL("https://oauth-sananthkumar1611-1043c:66370f7d-379a-418b-9ab2-5070d1628fd3@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,browserOptions);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("test completed");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File ("C:\\Users\\91999\\Downloads\\TCS Revised Compensation-01-Aug-2021-2021-2022\\Test1_Login.png"));

	}
}
