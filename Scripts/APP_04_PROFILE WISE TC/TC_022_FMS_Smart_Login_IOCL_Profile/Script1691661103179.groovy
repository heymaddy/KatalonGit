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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('OB_005_Login screen_fms smart/login screen/username'), 0)

WebUI.verifyElementClickable(findTestObject('OB_005_Login screen_fms smart/login screen/username'))

WebUI.click(findTestObject('OB_005_Login screen_fms smart/login screen/username'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_005_Login screen_fms smart/login screen/username'), GlobalVariable.USERNAME)

WebUI.verifyElementPresent(findTestObject('OB_005_Login screen_fms smart/login screen/Password'), 0)

WebUI.verifyElementClickable(findTestObject('OB_005_Login screen_fms smart/login screen/Password'))

WebUI.click(findTestObject('OB_005_Login screen_fms smart/login screen/Password'))

WebUI.setEncryptedText(findTestObject('OB_005_Login screen_fms smart/login screen/Password'), GlobalVariable.PASSWORD)

WebUI.verifyElementPresent(findTestObject('OB_005_Login screen_fms smart/login screen/button_Sign in'), 0)

WebUI.verifyElementClickable(findTestObject('OB_005_Login screen_fms smart/login screen/button_Sign in'))

WebUI.verifyElementText(findTestObject('OB_005_Login screen_fms smart/login screen/button_Sign in'), 'Sign in')

WebUI.click(findTestObject('OB_005_Login screen_fms smart/login screen/button_Sign in'))

WebUI.waitForPageLoad(14)

WebUI.click(findTestObject('OB_005_Login screen_fms smart/login screen/button_ACCEPT AND CLOSE'))

WebUI.verifyTextPresent('FMS Smart', false)

WebUI.closeBrowser()

