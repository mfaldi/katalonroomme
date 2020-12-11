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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

Mobile.startApplication('C:\\Users\\Faldi\\Desktop\\scrcpy\\roomme.apk', false)

Mobile.tap(findTestObject('Android RoomMe.id/Menu Bar/Icon Account'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Login Page/Button Sign Up'), 0)

def FullName = Mobile.setText(findTestObject('Android RoomMe.id/Sign Up Page/Textfield Full Name'), 'Faldi Test AT', 0)

Mobile.setText(findTestObject('Android RoomMe.id/Sign Up Page/Textfield Emails'), ('faldiat' + RandomStringUtils.randomNumeric(
        5)) + '@gmail.com', 0)

not_run: Mobile.sendKeys(findTestObject('Android RoomMe.id/Sign Up Page/Textfield Emails'), '@gmail.com')

Mobile.setText(findTestObject('Android RoomMe.id/Sign Up Page/Textfield Phone Number'), '8123456789', 0)

Mobile.setEncryptedText(findTestObject('Android RoomMe.id/Sign Up Page/Textfield Password'), 'aeHFOx8jV/A=', 0)

Mobile.setEncryptedText(findTestObject('Android RoomMe.id/Sign Up Page/Textfield Confirm Password'), 'aeHFOx8jV/A=', 0)

Mobile.tap(findTestObject('Android RoomMe.id/Sign Up Page/Button Sign Up'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Android RoomMe.id/Sign Up Page/Success Page/Image Check Email After Register'), 
    0)

not_run: WelcomeToRoomMe = Mobile.getText(findTestObject('Android RoomMe.id/Sign Up Page/Success Page/Text Welcome to RoomMe'), 
    0, FailureHandling.STOP_ON_FAILURE)

text = Mobile.getText(findTestObject('Android RoomMe.id/Sign Up Page/Success Page/Text Welcome to RoomMe'), 0)

not_run: if (text.contains(FullName)) {
    not_run: println('Match')
} else {
    not_run: println('No Match')
}

not_run: Mobile.verifyElementText(findTestObject('Android RoomMe.id/Sign Up Page/Success Page/Text Thank You after Registration'), 
    'Thank you! You’ve successfully signed up.Please check your email for activation.')

Mobile.verifyElementExist(findTestObject('Android RoomMe.id/Sign Up Page/Success Page/Button Lets Find a Room Now'), 0)

Mobile.closeApplication()

