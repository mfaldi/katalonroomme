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

WebUI.callTestCase(findTestCase('Web RoomMe.id/3. Sign In/1. Login With Valid Credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Header/User Menu/Button User Menu'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/User Menu/Button My Profile'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/User Menu/Button My Booking'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/User Menu/Button Sign Out'))

not_run: WebUI.click(findTestObject('Web RoomMe.id/User Menu/Button My Profile'))

not_run: btnusermenu = WebUI.getText(findTestObject('Web RoomMe.id/Sign In Menu/Button User Menu'))

not_run: WebUI.setText(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/input_First Name_Label'), 'Faldi')

not_run: WebUI.getAttribute(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/input_First Name_Label'), 'username')

not_run: WebUI.verifyElementText(btnusermenu, username)

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/img'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/a_Change Photo'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/input_First Name_Label'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/input_Last Name_Label'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/input_Phone Number_Label'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/input_Email_Label'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/input_Date of Birth_Label'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/textarea_Address_form-control'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/a_Reset Password'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id My Profile Page/button_Update'))

WebUI.click(findTestObject('Web RoomMe.id/User Menu/Button Change Photo'))

String userDir = System.getProperty('user.dir')

String filePath = userDir + '/Data Files/PP.jpg'

WebUI.uploadFile(findTestObject('Web RoomMe.id/User Menu/Button Select Files'), 'filePath')

