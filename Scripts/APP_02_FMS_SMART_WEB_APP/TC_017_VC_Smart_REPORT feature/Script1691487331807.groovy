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

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/a_Reports'))

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/div_Safety Index Report'))

WebUI.delay(4)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/button_Submit'))

WebUI.delay(11)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/a_Reports'))

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/div_Exception Report'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/button_Select Date Range'))

WebUI.delay(4)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/button_Apply'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/button_Submit'))

WebUI.delay(21)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/a_Reports'))

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/div_External Consignment Log'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/report submit btn/Ext con log-button_Submit'))

WebUI.delay(8)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/a_Reports'))

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/div_Login History Report'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/report submit btn/login history button_Submit'))

WebUI.delay(11)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/a_Reports'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/div_User Access Report'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/report submit btn/user-access button_Submit'))

WebUI.delay(12)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/a_Reports'))

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/div_New Trip Report'))

WebUI.delay(4)

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/report submit btn/New trip re-button_Submit'))

WebUI.delay(21)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/a_Reports'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/div_Deviation Summary Report'))

WebUI.delay(5)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/button_Select Date Range'))

WebUI.delay(4)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/button_Apply'))

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/span_Select Violation Type'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_013_VC_Smart_REPORT Feature/Page_VCSmart  Trimble/span_Over Speed 2Min Violation'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/report submit btn/deviation report-button_Submit'))

