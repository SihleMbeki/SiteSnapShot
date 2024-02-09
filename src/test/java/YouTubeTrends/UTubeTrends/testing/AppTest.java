package YouTubeTrends.UTubeTrends.testing;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;

import YouTubeTrends.UTubeTrends.Utilities.Report;

public class AppTest extends Base{

	@Test
	public void test() throws IOException {
		ExtentTest test = Report.createTest("YouTube_HomePage");
		System.out.println("YouTube Home Page");
		driver.goTo("https://www.youtube.com");
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		test.log(Status.INFO, "Test Step");
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		
	}
	@Test
	public void test2() throws IOException {
		ExtentTest test = Report.createTest("YouTube_HomePage");
		System.out.println("Hello World");
		driver.goTo("https://www.youtube.com/feed/trending");
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		test.log(Status.PASS, "YouTube Trends");
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		
	}
	
	@Test
	public void test3() throws IOException {
		ExtentTest test = Report.createTest("Google Trends SA");
		System.out.println("Hello World");
		driver.goTo("https://trends.google.com/trends/trendingsearches/daily?geo=ZA&hl=en-US");
		test.log(Status.PASS, "Google  Trends");
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());	
	}
	
	@Test(dataProvider = "test1")
	public void test4(String site) throws IOException {
		ExtentTest test = Report.createTest("News");
		driver.goTo(site);
		test.log(Status.PASS, "Newss");
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());
		driver.pressPageDown();
		test.pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(driver.takeScreenShot(getDirectory())).build());	
	}
	@DataProvider(name = "test1")
	public Object[] createData1() {
	 return new Object[] {"https://www.rt.com","https://www.aljazeera.com","https://www.bbc.com","https://odysee.com/","https://rumble.com/","https://rumble.com/videos?sort=views&date=today"};
	}
}
