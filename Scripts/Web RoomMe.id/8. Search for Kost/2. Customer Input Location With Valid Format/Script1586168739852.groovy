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

WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/1. Customer Access RoomMe Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Search Kost Menu/Textfield Input Location'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Search Kost Menu/Textfield Input Location'), 'Jakarta')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Search Kost Menu/Text Location Suggestion'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web RoomMe.id/Search Kost Menu/Button Search'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Search Kost Menu/Error Message/Text Please choose check in date'), 
    30, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Search Kost Menu/Error Message/Text Please choose check out date'), 
    30, FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Web RoomMe.id/Search Kost Menu/Textfield Input Location'))

