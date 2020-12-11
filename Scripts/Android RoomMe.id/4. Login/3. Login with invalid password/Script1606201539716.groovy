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

Mobile.startApplication('C:\\Users\\Faldi\\Desktop\\scrcpy\\roomme.apk', false)

not_run: WebUI.callTestCase(findTestCase('Android RoomMe.id/1. Page Verifier/Verify Home Page'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android RoomMe.id/Menu Bar/Icon Account'), 0)

Mobile.setText(findTestObject('Android RoomMe.id/Login Page/Textfield Email Address'), GlobalVariable.email, 0)

Mobile.setEncryptedText(findTestObject('Android RoomMe.id/Login Page/Textfield Password'), 'LkeMBBcPFbAAvZmc7xnzcQ==', 0)

Mobile.tap(findTestObject('Android RoomMe.id/Login Page/Button Sign In'), 0)

Mobile.verifyElementText(findTestObject('Android RoomMe.id/Login Page/Error Message/Text Password is incorrect'), 'Password is incorrect')

Mobile.closeApplication()

