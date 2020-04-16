package stepDefinitions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class MyStepDefinition_LoginToShahid {
	//Scenario: Check elements of the Promo Page
	@Given("Go to HomePage")
	def I_want_to_go_to_Homepage() {
		WebUI.openBrowser("https://shahid-qc-pyco-web.shahid.net/ar")
//		WebUI.click("//*[@id="DGPR"]/div[2]/div")
	}

	@When("Click on button (.*)")
	def I_click_on_VIP_button(String btnName){
		switch(btnName){
			case "جرّب شاهد VIP":
//				WebUI.click(findTestObject('Object Repository/Demo/Page_ -/PromoLink'))
//			WebUI.click(findTestObject('Object Repository/Demo/Page_ -/div_  VIP'))
			WebUI.click(findTestObject('Object Repository/Demo/Page_ -/a_  VIP'))
			
			case "الدخول":
				WebUI.click(findTestObject('Object Repository/Demo/Page_ -/LoginLink'))
			case "متابعة":
				WebUI.click(findTestObject('Object Repository/Demo/Page_Login_Shahid/CheckmailBtn'))
		}}

	@Then("Verify that the URL of the page is (.*)")
	def I_verify_the_URL_of_the_page(String URL){
		WebUI.getUrl().compareTo(URL)
	}

	@And("Verify that the page display the text (.*)")
	def I_verify_the_text_display(String TextVerification){
		WebUI.verifyElementText(findTestObject('Object Repository/Demo/Page_Shahid/p_7'), TextVerification)
	}




	//Scenario: Login to Shahid with Invalid accounts
	@And ("Input Invalid data to (.*)")
	def I_input_invalid_Email(String EmailAddress){
		WebUI.setText(findTestObject('Object Repository/Demo/Page_Login_Shahid/input_emailBox'), EmailAddress)
	}

	@Then("Verify that there is error display with no input (.*)")
	def I_verify_the_error_when_no_input(String TextVerification){
		WebUI.verifyElementText(findTestObject('Demo/Page_Login_Shahid/NoinputMessage'), TextVerification)
	}

	@And("Verify that there is error display with invalid data: (.*)")
	def I_verify_the_error_when_invalid_data(String TextVerification){
		WebUI.verifyElementText(findTestObject('Demo/Page_Login_Shahid/InvalidMessage'), TextVerification)
	}
}