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
import internal.GlobalVariable as GlobalVariable
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/1. Customer Access RoomMe Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/2. Verify Header RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Header/Button Sign In'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign In Menu/Button Sign Up'), 0)

WebUI.click(findTestObject('Web RoomMe.id/Sign In Menu/Button Sign Up'))

WebUI.callTestCase(findTestCase('Web RoomMe.id/2. Sign Up/Verify Sign Up Menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Name Textfield'), 0)

WebUI.setText(findTestObject('Web RoomMe.id/Sign Up Menu/Name Textfield'), 'Faldi Test AT')

WebUI.setText(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), 'faldiat' + RandomStringUtils.randomNumeric(
        5))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), '@gmail.com')

WebUI.setText(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Phone Number'), '081234567890')

WebUI.setEncryptedText(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Password'), 'da8fEzhczGg=')

WebUI.setEncryptedText(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Confirm Password'), 'da8fEzhczGg=')

WebUI.click(findTestObject('Web RoomMe.id/Sign Up Menu/Button Sign Up'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Success Sign Up/Button Close'), 0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Success Sign Up/Icon RoomMe'), 0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Success Sign Up/Text Welcome to RoomMe'), 0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Success Sign Up/Text Thank you Youve successfully signed up'), 
    0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Success Sign Up/Text Please check your email for activation'), 
    0)

