package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateOpportunityPage extends ProjectSpecificMethods {

	public CreateOpportunityPage enterOpportunity(String oppName) {
		clearAndType(locateElement(Locators.XPATH, "//label[contains(text(),'Opportunity Name')]//following::input[1]"),oppName);
		return this;
	}

	public CreateOpportunityPage selectDate() {
		click(locateElement(Locators.XPATH, "//tr/td[@data-value='2025-02-24']"));
		return this;
	}

	public CreateOpportunityPage selectStage() {
		click(locateElement(Locators.XPATH, "//div[contains(@class,'slds-combobox__form-element slds-input-has-icon')]//button"));
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Needs Analysis']"));
		return this;
	}



}
