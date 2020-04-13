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
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/1. Customer Access RoomMe Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Search Kost Menu/Textfield Input Location'), 'jakarta')

WebUI.click(findTestObject('Web RoomMe.id/Search Kost Menu/Text Location Suggestion'))

WebUI.click(findTestObject('Web RoomMe.id/Search Kost Menu/Datepicker Check-in'))

WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Day Pick'))

WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Button Duration'))

WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Button 1 Month'))

WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Button Additional'))

not_run: WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Button 1 Day'))

WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Button Search'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Search Result Menu/Field Facilities'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Search Result Menu/Text Nama Kost'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Search Result Menu/div_Submit_col-md-4 img-s'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Search Result Menu/div_Rp1400000'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Search Result Menu/Image Kost'))

WebUI.waitForPageLoad(0)

