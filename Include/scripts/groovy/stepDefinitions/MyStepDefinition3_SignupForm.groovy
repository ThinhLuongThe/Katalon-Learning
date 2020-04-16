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



class MyStepDefinition3_SignupForm {
	@Given("User is on Registration Page")
	def User_comes_on_Registration_Page() {
		WebUI.openBrowser("https://www.thetestingworld.com/testings/")
	}

	@When("User inputs Username")
	def User_enters_username(){
		WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_username'), "Soul2")
	}

	@And("User inputs Email")
	def User_enters_email(){
		WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_email'), "Abdc1232@gmail.com")
	}

	@And("User inputs Password")
	def User_enters_Password(){
		WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_password'), "Abdc123")
	}

	@And("User inputs Confirm Password")
	def User_enters_CPassword(){
		WebUI.setText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_cpassword'), "Abdc123")
	}

	@And("User selects Gender")
	def User_selects_Gender(){
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Login  Sign Up Forms/select_Choose Gender                  Male                  Female'), "Male", false)
		//		WebUI.deselectOptionByIndex(findTestObject('Object Repository/Page_Login  Sign Up Forms/select_Choose Gender                  Male                  Female'), 1, false)
	}

	@And("User clicks TOC")
	def User_clicks_TOC(){
		WebUI.click(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_terms'))
	}

	@And("User clicks Signup button")
	def User_clicks_Submit(){
		WebUI.click(findTestObject('Object Repository/Page_Login  Sign Up Forms/input'))
	}

	@Then("Confirmation text appears")
	def User_sees_confirmation_text(){
		//		WebUI.verifyTextPresent(findTestObject('Object Repository/Page_Login  Sign Up Forms/div_User is successfully Register Now You can Login').toString(), false)
		//		WebUI.verifyTextPresent(findTestObject('Object Repository/Page_Login  Sign Up Forms/div_User is successfully Register Now You can Login').toString(), false)
		WebUI.verifyTextPresent("User is successfully Register. Now You can Login", false)
	}

	@And("Username field is empty")
	def Username_is_empty(){
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Login  Sign Up Forms/input_Address type HomeOffice_fld_username'), "")
	}
}