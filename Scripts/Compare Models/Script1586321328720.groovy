import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.uat.mipulse.co/en/buy/compare')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Model comparison  Mitsubishi Motors/img_XPANDER_homepage-car-selector__vehicleImage___Z2UZd'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Model comparison  Mitsubishi Motors/img_XPANDER_homepage-car-selector__vehicleImage___Z2UZd'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Model comparison  Mitsubishi Motors/select_ga1wxnshr6-euga1wxnfxl6-euASX GA1WXNFHR6-EUga1wxnhhr6-euGA1WXNSHL6-EUGA1WXNSXL6-EUga1wxnhhl6-euga1wxnfhl6-euGA1WXNHXL6-EU'), 
    0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Model comparison  Mitsubishi Motors/select_ga1wxnshr6-euga1wxnfxl6-euASX GA1WXNFHR6-EUga1wxnhhr6-euGA1WXNSHL6-EUGA1WXNSXL6-EUga1wxnhhl6-euga1wxnfhl6-euGA1WXNHXL6-EU'), 
    'GA1WXNSHL6-EU', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Model comparison  Mitsubishi Motors/select_ga1wxnshr6-euga1wxnfxl6-euASX GA1WXNFHR6-EUga1wxnhhr6-euGA1WXNSHL6-EUGA1WXNSXL6-EUga1wxnhhl6-euga1wxnfhl6-euGA1WXNHXL6-EU'), 
    'GA1WXNSXL6-EU', true)


WebUI.scrollToElement(findTestObject('Object Repository/Page_Model comparison  Mitsubishi Motors/h2_Key-Features'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Model comparison  Mitsubishi Motors/h2_Key-Features'), 'Key-Features\n')

WebUI.click(findTestObject('Object Repository/Page_Model comparison  Mitsubishi Motors/img_XPANDER_homepage-car-selector__vehicleImage___Z2UZd'))

WebUI.closeBrowser()

