package com.telus.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.telus.basePackage.TestBase;

public class ScreenShot extends TestBase {
	public void getScreenshot() throws IOException {

		Date currentdate = new Date();
		String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File(".//screenshot//" + screenshotfilename + ".png"));

	}

}
