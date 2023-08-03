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

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/All Vehicle BOX'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/button_Grid view'))

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/Close Grid view'))

WebUI.delay(5)

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/All Vehicle BOX'))

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/button_Map view'))

WebUI.delay(4)

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/Map View-Moving Vehicle'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/Map Vew-Untracked vehicles'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/Map View-NRD'))

WebUI.delay(4)

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/Map View-On trip vehicles'))

WebUI.delay(3)

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/Map view-Stopped vehicle'))

WebUI.delay(2)

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/button_View grid'))

WebUI.delay(6)

WebUI.click(findTestObject('OB_006_Dashbaord_Grid view feature 1/Page_FMS Smart/Close Grid view'))

