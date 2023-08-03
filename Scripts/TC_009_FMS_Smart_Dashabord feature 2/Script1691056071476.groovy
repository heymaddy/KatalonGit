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

WebUI.delay(3)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Dashboard feature/Moving VehicleBOX'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Dashboard feature/button_Grid view'))

WebUI.delay(2)

WebUI.verifyTextPresent('Moving vehicles', false)

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Dashboard feature/CLose Grid Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Dashboard feature/Stopped Vehicle BOX'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Grid view btn/Grid view-StopVeh'))

WebUI.delay(2)

WebUI.verifyTextPresent('Stopped vehicles', false)

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Dashboard feature/CLose Grid Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Dashboard feature/NRD Box'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Grid view btn/Grid view-NRD'))

WebUI.delay(2)

WebUI.verifyTextPresent('NRD vehicles', false)

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Dashboard feature/CLose Grid Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Dashboard feature/On Trip Box'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Grid view btn/Grid view-OnTrip'))

WebUI.delay(2)

WebUI.verifyTextPresent('On trip vehicles', false)

WebUI.delay(2)

WebUI.click(findTestObject('OB_007_Dashabord Feature2/Dashboard feature/CLose Grid Button'))

WebUI.delay(2)

