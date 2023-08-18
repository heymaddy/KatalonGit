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

WebUI.callTestCase(findTestCase('APP_01_VC_SMART_WEB_APP/TC_001_Verify the Login feature with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(11)

WebUI.click(findTestObject('OB_003_All feature/All feature/a_Reports'))

WebUI.verifyTextPresent('Safety Index Report', false)

WebUI.delay(3)

WebUI.click(findTestObject('OB_003_All feature/All feature/div_Safety Index Report'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_003_All feature/All feature/a_Reports'))

WebUI.click(findTestObject('OB_003_All feature/All feature/div_User Access Report'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_003_All feature/All feature/a_Reports'))

WebUI.click(findTestObject('OB_003_All feature/All feature/div_New Trip Report'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_003_All feature/All feature/a_Reports'))

WebUI.click(findTestObject('OB_003_All feature/All feature/div_Login History Report'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_003_All feature/All feature/a_Reports'))

WebUI.click(findTestObject('OB_003_All feature/All feature/div_External Consignment Log'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_003_All feature/All feature/a_Reports'))

WebUI.click(findTestObject('OB_003_All feature/All feature/div_Exception Report'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_003_All feature/All feature/a_Reports'))

WebUI.click(findTestObject('OB_003_All feature/All feature/a_Admin'))

WebUI.delay(4)

WebUI.verifyTextPresent('Landmark Manager', false)

WebUI.click(findTestObject('OB_003_All feature/All feature/a_Admin'))

WebUI.click(findTestObject('OB_003_All feature/All feature/a_NRD Dashboard'))

WebUI.delay(11)

WebUI.verifyTextPresent('Device Status', false)

WebUI.click(findTestObject('OB_003_All feature/All feature/a_Map View'))

WebUI.delay(12)

WebUI.verifyTextPresent('View Grid', false)

WebUI.closeBrowser()

