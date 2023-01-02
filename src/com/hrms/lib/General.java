package com.hrms.lib;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class General extends Global {
	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", "E:\\Juned_Selenium\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		System.out.println("Application Opened");
		Reporter.log("Application Opened");
		Log.info("Application Opened");
		
		}
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		Log.info("Application Closed");
		Reporter.log("Application Closed");
		
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pwd);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Log.info("Login Completed");
		Reporter.log("Login Completed ");
		
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
		Log.info("Logout Completed");
		
	}
	public void enterframe() {
		driver.switchTo().frame(frame_empinfo);
		
	}
	public void exitframe() {
		driver.switchTo().defaultContent();
	}
	public void addNewEmp() {
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		driver.findElement(By.id(btn_save)).click();
		Log.info("New Employee Added");
		}
	


}
