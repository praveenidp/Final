package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class login extends ProjectSpecificMethods{
	
	public login enterUsername(String data) {
		clearAndType(locateElement(Locators.ID, "username"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public login enterPassword(String data) {
		clearAndType(locateElement(Locators.ID, "password"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
	
	public Home clickLogin() {
		click(locateElement(Locators.ID, "Login"));
		reportStep("Login button clicked successfully", "pass");
		return new Home();
	}

}

