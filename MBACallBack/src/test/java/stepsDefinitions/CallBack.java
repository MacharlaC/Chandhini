package stepsDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CallBackPage;

public class CallBack {
	CallBackPage callBackPage;
	
	
	@Given("^Launch MBA Contact Us$")
	public void launch_MBA_Contact_Us() throws Throwable {
		callBackPage = new CallBackPage();
		 callBackPage.contactUs();
	}

	@And("^Enter First name$")
	public void enter_First_name() throws Throwable {			
		callBackPage.enterFirstname();
	}

	@And("^Enter Last name$")
	public void enter_Last_name() throws Throwable {
		callBackPage.enterLastname();
	   
	}

	@And("^Enter Email address$")
	public void enter_Email_address() throws Throwable {
		callBackPage.enterEmailAddress();

	}

	@And("^Mobile number$")
	public void mobile_number() throws Throwable {
		callBackPage.enterPhoneNumber();

	}

	@And("^Enter Best time to call$")
	public void enter_Best_time_to_call() throws Throwable {
		callBackPage.enterTimeToCall();

	}

	@And("^Select Reason for Enquiry$")
	public void select_Reason_for_Enquiry() throws Throwable {
		callBackPage.SelectReason();
	}

	@Then("^Select Checkbox$")
	public void select_Checkbox() throws Throwable {
		callBackPage.SelectOPtional();

	}

}
