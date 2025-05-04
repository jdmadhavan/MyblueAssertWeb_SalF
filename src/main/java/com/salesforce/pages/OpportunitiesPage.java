package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class OpportunitiesPage extends ProjectSpecificMethods {

	public CreateOpportunityPage clickNewOpportunity() {
		click(locateElement(Locators.XPATH, "//div[text()='New']"));
		reportStep("Cliked New button Successfully", "pass");
		return new CreateOpportunityPage();
	}

	public OpportunitiesPage searchOpportunities(String opportunityName) {
		
		typeAndEnter(locateElement(Locators.XPATH, "(//input[@type='search'])[2]"), opportunityName);
		reportStep("Search for Existing Opportunities is Successful", "pass");
			return this;
	}
     public OpportunitiesPage selectOpportunityDropDown() {
		pause(3000);
		click(locateElement(Locators.XPATH, "//span[@class='slds-icon_container slds-icon-utility-down']/span"));
		reportStep("Opportunity dropdown is clicked Successfully", "pass");
		return this;
	}

	public OpportunitiesPage clickOpportunityCheckBox() {
		pause(3000);
		click(locateElement(Locators.XPATH, "//div/following::span[@class='slds-checkbox--faux slds-checkbox_faux'][1]"));
		reportStep("Opportunity checkbox is clicked Successfully", "pass");
		return  this;
	}

	
}
