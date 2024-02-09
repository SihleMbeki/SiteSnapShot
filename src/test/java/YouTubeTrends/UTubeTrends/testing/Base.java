package YouTubeTrends.UTubeTrends.testing;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;

import YouTubeTrends.UTubeTrends.Utilities.Report;
import YouTubeTrends.UTubeTrends.Utilities.WebDriverInstance;

public class Base {
	private String directory;
	protected String excelFileName;
	protected int columnNum;
	protected ExtentTest test;
	
	protected String database;
	protected String table;
	public static YouTubeTrends.UTubeTrends.Utilities.WebDriverInstance driver;

	@BeforeSuite
	public void suiteSetup() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String report = format.format(date).toString();
		directory = System.getProperty("user.dir") + "\\Reports\\"
				+ report.replace(":", "_").replace(" ", "").replace("-", "");
		try {
			File file = new File(directory);
			file.mkdir();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Report.createReport(directory);
		
		driver =new WebDriverInstance();
		driver.zoomOut();
	}
	
	public String getDirectory() {
		return directory;
	}

	@AfterSuite
	public void suiteCleanup() {
		Report.closeReport();
		driver.closeDriver();
	}
}
