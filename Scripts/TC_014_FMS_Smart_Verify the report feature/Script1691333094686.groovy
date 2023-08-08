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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC_007_FMS_Smart_Verify Login feature'), [('url') : 'https://ioclfmssmart.tmsitrimble.in/FMSSmartApp/#/login'
        , ('username') : '11038331', ('password') : 'Nr@747900'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('OB_010_FMS_Smart_Report feature verify/Report feature verify/a_Reports'))

WebUI.mouseOver(findTestObject('OB_010_FMS_Smart_Report feature verify/Report feature verify/div_Safety  Summary  Report'))

WebUI.delay(2)

WebUI.verifyTextPresent('Safety Summary Report', false)

WebUI.click(findTestObject('OB_010_FMS_Smart_Report feature verify/Report feature verify/div_Safety  Summary  Report'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_010_FMS_Smart_Report feature verify/Report feature verify/span_Select vehicle(s)'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_010_FMS_Smart_Report feature verify/Report feature verify/label_AN01R4264'))

WebUI.click(findTestObject('OB_010_FMS_Smart_Report feature verify/Report feature verify/button_Submit'))

WebUI.delay(5)

WebUI.verifyTextPresent('Result', false)

WebUI.closeBrowser()

