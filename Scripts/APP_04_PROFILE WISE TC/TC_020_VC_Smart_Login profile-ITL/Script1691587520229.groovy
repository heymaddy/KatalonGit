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

WebUI.waitForPageLoad(15)

WebUI.verifyElementPresent(findTestObject('OB_001_Login screen/Login Screen/Username'), 0)

WebUI.verifyElementPresent(findTestObject('OB_001_Login screen/Login Screen/Password'), 0)

WebUI.verifyElementPresent(findTestObject('OB_001_Login screen/Login Screen/button_Sign in'), 0)

WebUI.click(findTestObject('OB_001_Login screen/Login Screen/Username'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OB_001_Login screen/Login Screen/Username'), GlobalVariable.USERNAME)

WebUI.click(findTestObject('OB_001_Login screen/Login Screen/Password'))

WebUI.setEncryptedText(findTestObject('OB_001_Login screen/Login Screen/Password'), GlobalVariable.PASSWORD)

WebUI.waitForElementClickable(findTestObject('OB_001_Login screen/Login Screen/button_Sign in'), 3)

WebUI.click(findTestObject('OB_001_Login screen/Login Screen/button_Sign in'))

WebUI.waitForPageLoad(14)

WebUI.verifyTextPresent('VC Smart', false)

