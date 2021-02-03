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

WebUI.callTestCase(findTestCase('Android RoomMe.id/7. Search For Unit/1. Search unit by Name'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android RoomMe.id/Unit Detail Page/TextButton See Available Room'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Unit Detail Page/Button Book Now (Top Room Type)'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Unit Detail Page/Confirmation Booking/Button Book Now'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Contact Details Page/Button Continue'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Payment Term Option Page/RadioButton Deposit and 1st Monthly Rent'), 0)

Mobile.scrollToText('Continue', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android RoomMe.id/Payment Term Option Page/Button Continue'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Payment Page/RadioButton Bank Transfer'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Payment Page/Bank Transfer/RadioButton BCA'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Payment Page/Bank Transfer/Button Select'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Payment Page/CheckBox Terms and Condition'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Payment Page/Button Pay Now'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Payment Page/Confirmation Window Payment/Button Confirm'), 0)

Mobile.verifyElementVisible(findTestObject('Android RoomMe.id/Payment Instruction With Countdown Page/Text Complete Your Payment Immediately'), 
    0)

bookid = Mobile.getText(findTestObject('Android RoomMe.id/Payment Instruction With Countdown Page/Text Booking ID Number'), 
    0)

Mobile.swipe(625, 1818, 625, 1300)

Mobile.tap(findTestObject('Android RoomMe.id/Payment Instruction With Countdown Page/Button Check Payment Status'), 0)

Mobile.verifyElementText(findTestObject('Android RoomMe.id/My Booking Page/Booked Tab/Text Booking ID for Current Booking (Top)'), 
    bookid)

