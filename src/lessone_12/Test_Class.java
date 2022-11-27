package lessone_12;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class Test_Class {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "D:\\my new driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//		Date currentDate = new Date();
//		String theAcutalDate = currentDate.toString().replace(":","-");
		driver.get("file:///D:/QA/AUTOMATION/Automations%20test%20using%20screenshote%20%2312/Qa-automation-7thmar/index.html");
//		TakesScreenshot src = ((TakesScreenshot)driver);
//		File SrcFile = src.getScreenshotAs((OutputType.FILE));
//		File Dest = new File(".//mypictuers/"+theAcutalDate+".png");
//		FileUtils.copyFile(SrcFile, Dest);
		
		List <WebElement> theStudents = driver.findElements(By.tagName("option"));
		int theTotalNumberOfStudents = theStudents.size();
//		System.out.println(theTotalNumberOfStudents);
		System.out.println(theTotalNumberOfStudents+"This is the original number");
		int HowManyItems = 1;
		System.out.println(HowManyItems+"This is the number of items i want remove");
		for(int i=0 ; i< HowManyItems ;i++) {
			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
		}
		List <WebElement> theStudentsAfterRemove = driver.findElements(By.tagName("option"));
		int actualNumber = theStudentsAfterRemove.size();
		System.out.println(actualNumber+"this is the new actual number");
		int expectedItem = theTotalNumberOfStudents - HowManyItems ;
		System.out.println(expectedItem+"This is the expected number");
		Assert.assertEquals(actualNumber, expectedItem);


		
		
		}

}
