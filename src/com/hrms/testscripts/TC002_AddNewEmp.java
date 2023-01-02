package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002_AddNewEmp {
	@Test
	//public static void main(String args[]) {
	public void tc002() {
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.enterframe();
		obj.addNewEmp();
		obj.exitframe();
		obj.logout();
		obj.closeApplication();
		
	}
		
		
	//}

}
