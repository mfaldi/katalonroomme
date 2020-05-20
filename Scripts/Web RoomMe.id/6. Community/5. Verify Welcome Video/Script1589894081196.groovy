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

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/6. Community/1. Customer Access Community Page From Header'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Welcome Video/Text JOIN OUR COMMUNITY'), 0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Welcome Video/Text And enjoy the benefits and features'), 
    0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Welcome Video/Video Events RoomMe'), 0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Welcome Video/Button Continue on the Form Registration'), 
    0)

WebUI.delay(10)
