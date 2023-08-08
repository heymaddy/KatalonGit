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

WebUI.callTestCase(findTestCase('TC_001_Verify the Login feature with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OB_012_VC_Smart_ADMIN Feature/Page_VCSmart  Trimble/a_Admin'))

WebUI.click(findTestObject('OB_012_VC_Smart_ADMIN Feature/Page_VCSmart  Trimble/div_Landmark Manager'))

WebUI.delay(4)

WebUI.verifyTextPresent('Records', false)

WebUI.click(findTestObject('OB_012_VC_Smart_ADMIN Feature/Page_VCSmart  Trimble/a_Admin'))

WebUI.click(findTestObject('OB_012_VC_Smart_ADMIN Feature/Page_VCSmart  Trimble/div_Route Manager'))

WebUI.verifyTextPresent('Records', false)

WebUI.click(findTestObject('OB_012_VC_Smart_ADMIN Feature/Page_VCSmart  Trimble/a_Admin'))

WebUI.click(findTestObject('OB_012_VC_Smart_ADMIN Feature/Page_VCSmart  Trimble/div_Carrier Manager'))

WebUI.verifyTextPresent('Records', false)

WebUI.click(findTestObject('OB_012_VC_Smart_ADMIN Feature/Page_VCSmart  Trimble/a_Admin'))

WebUI.click(findTestObject('OB_012_VC_Smart_ADMIN Feature/Page_VCSmart  Trimble/div_Geo Area Manager'))

WebUI.verifyTextPresent('Records', false)

WebUI.click(findTestObject('OB_012_VC_Smart_ADMIN Feature/Page_VCSmart  Trimble/a_Admin'))

WebUI.click(findTestObject('OB_012_VC_Smart_ADMIN Feature/Page_VCSmart  Trimble/div_Vehicle Manager'))

WebUI.verifyTextPresent('Records', false)

WebUI.closeBrowser()

