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

WebUI.callTestCase(findTestCase('APP_02_FMS_SMART_WEB_APP/TC_007_FMS_Smart_Verify Login feature'), [('url') : 'https://ioclfmssmart.tmsitrimble.in/FMSSmartApp/#/login'
        , ('username') : '11038331', ('password') : 'Nr@747900'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/Logout1'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/Logout2'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/5 Star'))

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/Enter name'))

WebUI.setText(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/Enter name'), 'Maddy patil')

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/Enter Email'))

WebUI.setText(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/Enter Email'), 'maddy@gmail.com')

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/button_Others'))

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/Description'))

WebUI.setText(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/Description'), 'Application is very good,it helps lot ,thank you so much for this')

WebUI.click(findTestObject('OB_008_Fms smart Lgout and Feedback/Logout And Feedback/button_Send Feedback'))

WebUI.verifyTextPresent('Thank You', false)

