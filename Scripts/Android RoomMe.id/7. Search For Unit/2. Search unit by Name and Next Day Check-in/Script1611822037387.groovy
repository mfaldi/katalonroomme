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

Mobile.startApplication(GlobalVariable.applocation, false)

Mobile.callTestCase(findTestCase('Android RoomMe.id/6. Banner/1. Close Banner'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android RoomMe.id/Home Page/Button Search'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Find Kost Page/Button Select Date Check-In'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Find Kost Page/Check-In Date Picker/Button 1st Day of 2nd Week'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Find Kost Page/Check-In Date Picker/Button 2nd Day of 2nd Week'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Find Kost Page/Check-In Date Picker/Button Select'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Find Kost Page/Textfield Find Area City Landmark'), 0)

Mobile.setText(findTestObject('Android RoomMe.id/Search Location Page/Textfield Find Area City Landmark'), 'FD Test02', 
    0)

Mobile.tap(findTestObject('Android RoomMe.id/Search Location Page/TextButton RoomMe FD Test02'), 0)

