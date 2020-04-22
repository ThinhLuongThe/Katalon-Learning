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
import static java.lang.Math.*

//CucumberKW.runFeatureFile('Include/features/New Feature File 4 _ Login.feature')
//WebUI.closeBrowser()
println('Start')

////Sample 1
//def letters = [1, 2, 3, 'a', 'b']
//println letters[2]	//3
//println letters[-1]	//b
//letters << 'C'
//println letters[-1]	//C
//println letters[1..4]	//[....]
//
//
////Sample 2
//def multi = [[0, 1], [2, 3]]
//println multi[1][0] //2
//
////Sample 3
//String[] arrStr = ['Ananas', 'Banana', 'Kiwi']
//println arrStr
//
////Sample 4
//Integer[][] matrix2
//matrix2 = [[1, 2], [3, 4]]
//println matrix2
//println matrix2.size()
//
//
//////////// Operators
////Sample 1
//boolean checkIfCalled() {
//	called = true
//}
//
//called = false
//true || checkIfCalled()
//assert !called
///*In the first case, after resetting the called flag, we confirm that if the left operand to || is true, the function is not called, as || short-circuits the evaluation of the right operand*/
//
//called = false
//false && checkIfCalled()
//assert !called
///*Likewise for &&, we confirm that the function is not called with a false left operand*/
//
//
////Sample 2
//def personInfo = [name: 'Daniel.Sun', location: 'Shanghai']
//assert 'Daniel.Sun' == personInfo['name']
//
////Sample 3
//Integer x = 123
//println s = x as String
//
//
//
//////////// Structure
//	//Sample 1
//assert sin(0) == 0.0
//assert cos(0) == 1.0
//
//	
//	//Sample 2
//int fib(int n) {
//	n < 2 ? 1 : fib(n-1) + fib(n-2)
//}
//println fib(6)
//
//	//Sample 3
//println 'Hello'
//int power(int n) { 2**n }
//println "2^6==${power(6)}"
println('End')

