package com.TestScripts.Pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;

public class Loginpage 
{
	AndroidDriver<MobileElement> driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	Actions action;
	Select select;
	AndroidTouchAction touch;
	
	@BeforeTest
	  public void beforeTest() throws MalformedURLException 
	{
		htmlReporter = new ExtentSparkReporter("dailybookings.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		  
		cap.setCapability("Devicename", "Galaxy M12");
		cap.setCapability("UDID", "RZ8R918FGWH");
		cap.setCapability("Platformname", "Android");
		cap.setCapability("Platformversion", "13");
		
		cap.setCapability("apppackage", "com.joey_room");
		cap.setCapability("appactivity", "com.joeyrooms.MainActivity - Joey Rooms Host");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
		System.out.println("Android driver started successfully");
		
	}
	 @AfterTest
	  public void afterTest() 
	 {
		  extent.flush();
		 // driver.close();
	  }
	 @Test
	public void BestDalsandOffers() throws Exception
	{
		 
	
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Joey Rooms Host']")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(3000);
		 By logintext=By.xpath("//android.widget.TextView[@text='Login']");
		 WebElement logintextl=driver.findElement(logintext);
		 logintextl.isDisplayed();
		 String textdata=logintextl.getText();
		 System.out.println(textdata);
		 String expectedtext="Login";
		 Assert.assertEquals(textdata, expectedtext);
		 Thread.sleep(2000);
		 if(logintextl.isDisplayed())
		 {
			 logintextl.click();
			 Thread.sleep(2000);
		 By username=By.xpath("//android.widget.EditText[@text='Enter E-mail or mobile Number']");
		 WebElement usernamel=driver.findElement(username);
		 usernamel.clear();
		 usernamel.sendKeys("8179592352");
		 Thread.sleep(2000);
		 By password=By.xpath("//android.widget.EditText[@text='atleast 8 characters']");
		 WebElement passwordl=driver.findElement(password);
		 passwordl.clear();
		 passwordl.sendKeys("abcd@123");
		 Thread.sleep(3000);
		 By clickonloginbtn=By.xpath("//android.view.ViewGroup[@bounds='[61,946][659,1030]']");
		 WebElement Clickloginbtnl=driver.findElement(clickonloginbtn);
		 Clickloginbtnl.isDisplayed();
		 Clickloginbtnl.click();
		 Thread.sleep(2000);
		 By Isdisplaypropertylist=By.xpath("//android.widget.TextView[@text='Property List']");		
		 WebElement Isdisplaypropertylistl=driver.findElement(Isdisplaypropertylist);
		 Isdisplaypropertylistl.isDisplayed();
		 String text= Isdisplaypropertylistl.getText();
		  System.out.println(text);
		  String exptext="Property List";
		  Assert.assertEquals(text, exptext,"test case pass login succeessfully");
		 Thread.sleep(2000);
		 By clickonMenubar=By.xpath("//android.view.ViewGroup[@bounds='[0,53][90,143]']");		
		 WebElement clickonMenubarl=driver.findElement(clickonMenubar);
		 clickonMenubarl.isDisplayed();
		 clickonMenubarl.click();
		 Thread.sleep(3000);
		 By propertylist=By.xpath("//android.widget.TextView[@text='Property List']");		
		 WebElement pertylistl=driver.findElement(propertylist);
		 pertylistl.isDisplayed();
		 pertylistl.click();
		 Thread.sleep(2000);
		 
		 MobileElement elementer= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true))" +
			         ".scrollIntoView(new UiSelector().text(\"JR1012 NovaHotel\"))"));
		 Thread.sleep(2000);
		 By propertsvr=By.xpath("//android.widget.TextView[@text='JR1213 SVRamanaLodge']");
		 WebElement propertysvrl=driver.findElement(propertsvr);
		 propertysvrl.isDisplayed();
		 String actualpropertytext=propertysvrl.getText();
		 System.out.println(actualpropertytext);
		 String exppropertytext="JR1213 SVRamanaLodge";
		 Assert.assertEquals(actualpropertytext, exppropertytext,"test case pass");
		 
		 }
		 else
		 {
			 By Isdisplaypropertylist=By.xpath("//android.widget.TextView[@text='Property List']");		
			 WebElement Isdisplaypropertylistl=driver.findElement(Isdisplaypropertylist);
			 Isdisplaypropertylistl.isDisplayed();
			  String text= Isdisplaypropertylistl.getText();
			  System.out.println(text);
			  String exptext="Property List";
			  Assert.assertEquals(text, exptext,"test case pass login succeessfully");
			  
			 Thread.sleep(2000);
			 By clickonMenubar=By.xpath("//android.view.ViewGroup[@bounds='[0,53][90,143]']");		
			 WebElement clickonMenubarl=driver.findElement(clickonMenubar);
			 clickonMenubarl.isDisplayed();
			 clickonMenubarl.click();
			 Thread.sleep(3000);
			 By clickonpropertylist=By.xpath("//android.widget.TextView[@text='Property List']");		
			 WebElement clickonpropertylistl=driver.findElement(clickonpropertylist);
			 clickonpropertylistl.isDisplayed();
			 clickonpropertylistl.click();
			 Thread.sleep(2000);
			 MobileElement elementer= (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				         ".scrollIntoView(new UiSelector().text(\"JR1012 NovaHotel\"))"));
			 Thread.sleep(2000);
			 if(elementer.isDisplayed())
			 {
			 By propertsvr=By.xpath("//android.widget.TextView[@text='JR1213 SVRamanaLodge']");
			 WebElement propertysvrl=driver.findElement(propertsvr);
			 propertysvrl.isDisplayed();
			 String actualpropertytext=propertysvrl.getText();
			 System.out.println(actualpropertytext);
			 String exppropertytext="JR1213 SVRamanaLodge";
			 Assert.assertEquals(actualpropertytext, exppropertytext,"test case pass");
		 }
		 }
	}
}
