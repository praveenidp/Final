package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class Home extends ProjectSpecificMethods{
	
	public Home verifySfHomePage() {
		verifyDisplayed(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
		reportStep("Homepage is loaded", "pass");
		return this;
		
	}
	public Home clickWaIcon() {
		click(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
		reportStep("Icon is clicked", "pass");
		return this;
		
	}
	
	public Home clickViewAllButton() {
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("View All is clicked successfully","pass");
		return this;
	}
	
	

	public Page clickIndividual() {
	WebElement ele = locateElement(Locators.XPATH, "//p[text()='Individuals']");
	act = new Actions(getDriver());
	act.moveToElement(ele).perform();
	ele.click();
		reportStep("Individual is clicked successfully","pass");
		return new Page();
	}
	

	
}



