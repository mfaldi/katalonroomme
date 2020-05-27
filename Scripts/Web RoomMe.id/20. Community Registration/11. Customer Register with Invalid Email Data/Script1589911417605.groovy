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

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Welcome Video/Button Continue on the Form Registration'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/20. Community Registration/1. Verify Registration Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), 0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), 'Faldi')

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/RadioButton Male'))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Mobile Number'), '081234567890')

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Birthdate Datepicker/Datepicker Birthdate_date (1)'))

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Birthdate Datepicker/Button Day 1'))

WebUI.selectOptionByIndex(findTestObject('Web RoomMe.id/Community Page/Community Registration/Dropdown Interest'), '4')

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Button Submit'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Email is required'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), 'ab')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Email is not valid'), 
    0)

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Button Submit'))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), '123')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Email is not valid'), 
    0)

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Button Submit'))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), '!@#$')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Email is not valid'), 
    0)

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Button Submit'))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), 'abcde12345abcde12345abcde12345abcde12345abcde12345as')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Email is not valid'), 
    0)

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Button Submit'))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), 'asdas@')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Email is not valid'), 
    0)

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Button Submit'))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), 'asdas@get')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Email is not valid'), 
    0)

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Button Submit'))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), 'asdas@get.')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Email is not valid'), 
    0)

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Button Submit'))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), Keys.chord(
        Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email Address'), 'asdas@get.c')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Email is not valid'), 
    0)

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Button Submit'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Email is not valid'), 
    0)

