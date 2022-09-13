package com.salesforce.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class Page extends ProjectSpecificMethods {

	public Page clickIndividualDrop() {
		click(locateElement(Locators.XPATH,
				"//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']/one-app-nav-bar-menu-button"));
		reportStep("Individual dropdown is clicked successfully", "pass");
		return this;
	}

	public Page clickNewIndividual() {
		clickUsingJs(locateElement(Locators.XPATH, "(//span[text()='New Individual'])"));
		reportStep("New Individual is clicked successfully", "pass");
		return this;
	}

	public Page enterLastName(String data) {

		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Last Name']"), data);

		reportStep("Lastname is entered successfully", "pass");
		return this;
	}

	public Page clickSave() {
		click(locateElement(Locators.XPATH, "//button[@title='Save']//span[1]"));
		reportStep("Save button is clicked successfully", "pass");
		return this;
	}

	public Page verifyLastName(String data) {
		verifyExactText(locateElement(Locators.XPATH, "(//span[@class='uiOutputText'])[1]"), data);
		reportStep(data + " is matching with provided Last name", "pass");
		return this;

	}

	public Page clickEdit() {
		click(locateElement(Locators.XPATH, "//div[@title='Edit']"));
		reportStep("Edit button is clicked successfully", "pass");
		return this;
	}

	public Page selectSalutation() {
		click(locateElement(Locators.XPATH, "//a[@class='select']"));
		click(locateElement(Locators.XPATH, "//a[text()='Mr.']"));
		reportStep("Salutation is selected successfully", "pass");
		return this;
	}

	public Page enterFirstName(String data) {

		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='First Name']"), data);
		reportStep("First name is entered successfully", "pass");
		return this;
	}

	public Page clickSaveButton() {
		click(locateElement(Locators.XPATH, "//button[@title='Save']"));
		reportStep("Save button is clicked successfully", "pass");
		return this;
	}

	public Page verifyFirstName(String data) {
		pause(500);
		WebElement ele = locateElement(Locators.XPATH, "//span[contains(text(),'" + data + "')]");
		verifyPartialText(ele, data);
		reportStep("First name:" +data + " is present in the Individual name", "pass");
		return this;

	}

}