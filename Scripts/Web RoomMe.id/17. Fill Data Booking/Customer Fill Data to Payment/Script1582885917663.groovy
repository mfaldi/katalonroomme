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

WebUI.callTestCase(findTestCase('Web RoomMe.id/13. Kost Detail/Customer Continue To Book'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Text 1 Fill in data'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Text 2 Payment'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Text 3 Done Confirmation Booking'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Field Customer Information'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Text Customer Contact Name'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Text Customer Email Address'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Text Customer Phone Number'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Text Noted If the data doesnt match please edit in profile'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Button Edit Profile'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Checkbox Please tick if youre making booking for someone else'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Field Cancellation Policy'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Field Booking Details'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id Fill In Data/Button Continue to Payment'))

