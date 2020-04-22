package stepDefinitions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import jxl.*;
import org.codehaus.groovy.antlr.parser.GroovyRecognizer;

class MyStepDefinition_LoginToShahid {
	//Scenario: Check elements of the Promo Page
	@Given("Go to HomePage")
	def I_want_to_go_to_Homepage() {
		WebUI.openBrowser("https://shahid-qc-pyco-web.shahid.net/ar")
//		WebUI.click(findTestObject("Object Repository/Demo/Page_ -/Accept Cookie Button")) //Click on Accept Cookie Button
	}

	@When("Click on button1 (.*)")
	def I_click_on_VIP_button(String btnName){
		//				switch(btnName){
		//					case "جرّب شاهد VIP":
		//						WebUI.click(findTestObject('Object Repository/Demo/Page_ -/PromoLink'))
		//					case "الدخول":
		//						WebUI.click(findTestObject('Object Repository/Demo/Page_ -/LoginLink'))
		//					case "متابعة":
		//						WebUI.click(findTestObject('Object Repository/Demo/Page_Login_Shahid/CheckmailBtn'))
		//				}
		WebUI.click(findTestObject('Object Repository/Demo/Page_ -/PromoLink'))
		
		
	}

	@When("Click on button2 (.*)")
	def I_click_on_Login_button(String btnName){
		WebUI.click(findTestObject('Object Repository/Demo/Page_ -/LoginLink'))
	}

	@And("Click on button3 (.*)")
	def I_click_on_CheckMail_button(String btnName){
		WebUI.click(findTestObject('Object Repository/Demo/Page_Login_Shahid/CheckmailBtn'))
	}

	@Then("Verify that the URL of the page is (.*)")
	def I_verify_the_URL_of_the_page(String URL){
		WebUI.getUrl().compareTo(URL)
	}

	@And("Verify that the page display the text (.*)")
	def I_verify_the_text_display(String TextVerification){
		//		WebUI.verifyElementText(findTestObject('Object Repository/Demo/Page_Shahid/p_7'), TextVerification)
		WebUI.verifyElementText(findTestObject('Object Repository/Demo/Page_Shahid/p_7'), "7 أيام تجربة مجانية")
		
		
	}


	//Scenario: Login to Shahid with Invalid accounts
	@And ("Input Invalid data to (.*)")
	def I_input_invalid_Email(String EmailAddress){
		WebUI.setText(findTestObject('Object Repository/Demo/Page_Login_Shahid/input_emailBox'), EmailAddress)
	}

	@And ("Input Invalid data to Email Text Box from (.*)")
	def I_input_invalid_Email_from_file(String FileAddress){
	//////TRY to get data from Excel file (Unsuccessfully):
//		Workbook workbook = Workbook.getWorkbook(new File("D:/SOAPUI/ConversionRate.xls"))
//		Sheet sheet1 = workbook.getSheet("DataDriven")
//		def rows = sheet1.getRows()
//		def cols = sheet1.getColumns()
//		log.info "Row Count =" + rows
//		log.info "Column Count =" + cols
//		for(i=1;i<rows;i++) {
//			for(j=0;j<cols;j++) {
//				Cell cell = sheet1.getCell(j,i)
//				log.info cell.getContents()
//			}
//		}
	}


	@Then("Verify that there is error display with no input (.*)")
	def I_verify_the_error_when_no_input(String TextVerification){
		//		WebUI.verifyElementText(findTestObject('Demo/Page_Login_Shahid/NoinputMessage'), TextVerification)
		WebUI.verifyElementText(findTestObject('Demo/Page_Login_Shahid/NoinputMessage'), 'هذه الخانة مطلوبة.')
	}

	@Then("Verify that there is error display with invalid data: (.*)")
	def I_verify_the_error_when_invalid_data(String TextVerification){
		//		WebUI.verifyElementText(findTestObject('Demo/Page_Login_Shahid/InvalidMessage'), TextVerification)
		WebUI.verifyElementText(findTestObject('Demo/Page_Login_Shahid/InvalidMessage'), 'صيغة البريد الالكتروني غير صحيحة.')
	}

}