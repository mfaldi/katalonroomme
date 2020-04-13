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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Web RoomMe.id/8. Search for Kost/1. Customer Search For Kost 1 Month 0 Day'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web RoomMe.id/Search Result Menu/Image Kost'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Image Primary Photo'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Image Second Photo'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Text Nama Kost'))

kostname = WebUI.getText(findTestObject('Web RoomMe.id/Search Result Menu/Text Nama Kost'))

not_run: WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Text Nama Kost'), kostname, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Button Read More'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Button See Map'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Button Map'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Field Building Facilities'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Field Room Details'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Field Booking Summary'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Field Reccomend Kost Nearby'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Button Select'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Button Booking Summary'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Button Schedule Free Visit'))

