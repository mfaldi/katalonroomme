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

WebUI.callTestCase(findTestCase('Web RoomMe.id/6. Community/Customer Access Community Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Welcome Video/Button Continue on the Form Registration'), 
    0)

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Welcome Video/Button Continue on the Form Registration'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Mobile Number'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Mobile Number'), 'ab')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Phone Number contains an invalid number'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Mobile Number'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Mobile Number'), '123')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Phone Number contains an invalid number'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Mobile Number'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Mobile Number'), '!@#$')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Phone Number contains an invalid number'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Mobile Number'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Mobile Number'), 'abcde12345abcde12345abcde12345abcde12345abcde12345as')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Phone Number contains an invalid number'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Mobile Number'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

