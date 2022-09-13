package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.login;

public class testcase extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Createuser";
		testDescription ="Create a new user";
		authors="Praveen";
		category ="Smoke";
		excelFileName="Sales";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateIndividual(String username, String password, String lname, String fname){
		new login()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifySfHomePage()
		.clickWaIcon()
		.clickViewAllButton()
		.clickIndividual()
		.clickIndividualDrop()
		.clickNewIndividual()
		.enterLastName(lname)
		.clickSave()
		.verifyLastName(lname)
		.clickEdit()
		.selectSalutation()
		.enterFirstName(fname)
		.clickSaveButton()
		.verifyFirstName(fname);
		
	}

}
