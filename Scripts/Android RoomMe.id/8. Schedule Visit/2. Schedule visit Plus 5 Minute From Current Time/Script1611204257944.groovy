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

WebUI.callTestCase(findTestCase('Android RoomMe.id/7. Search For Unit/1. Search unit by Name'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android RoomMe.id/Unit Detail Page/TextButton Schedule Visit'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Schedule Visit Page/Text Jam Terpilih'), 0)

Mobile.swipe(625, 1818, 625, 1300)

Mobile.tap(findTestObject('Android RoomMe.id/Schedule Visit Page/Time Picker/Button Select'), 0)

selectedbulantahun = Mobile.getText(findTestObject('Android RoomMe.id/Schedule Visit Page/Text Bulan Tahun Terpilih'), 0)

selectedtanggal = Mobile.getText(findTestObject('Android RoomMe.id/Schedule Visit Page/Text Tanggal Terpilih'), 0)

selectedjam = Mobile.getText(findTestObject('Android RoomMe.id/Schedule Visit Page/Text Jam Terpilih'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Schedule Visit Page/Button Submit'), 0)

Mobile.verifyElementVisible(findTestObject('Android RoomMe.id/Schedule Visit Page/Success Page/Image Calendar'), 0)

Mobile.verifyElementVisible(findTestObject('Android RoomMe.id/Schedule Visit Page/Success Page/Text Successfully set your schedule visit'), 
    0)

Mobile.tap(findTestObject('Android RoomMe.id/Schedule Visit Page/Success Page/Button Check Schedule Visit'), 0)

Mobile.scrollToText(selectedbulantahun)

