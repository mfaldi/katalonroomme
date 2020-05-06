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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Web RoomMe.id/6. Community/1. Customer Access Community Page From Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Image 2020 RoomMe All Right Reserved'), 
    0)

WebUI.callTestCase(findTestCase('Web RoomMe.id/20. Community Registration/1. Verify Registration Form'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Your Name'), 0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Your Name'), 'Faldi AT')

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/RadioButton Male'))

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Birthdate Datepicker/Datepicker Birthdate_date'))

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Birthdate Datepicker/Button Year'))

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Birthdate Datepicker/Button Left Year'))

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Birthdate Datepicker/Button Left Year'))

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Birthdate Datepicker/Button Left Year'))

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Birthdate Datepicker/Button Year 1994'))

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Birthdate Datepicker/Button Month Dec'))

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Birthdate Datepicker/Button Date 18'))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Phone Number'), '081234567890')

not_run: WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Emails'), 'faldidev@getnada.com')

WebUI.setText(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email'), 'faldiat' + RandomStringUtils.randomNumeric(
        5))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Email'), '@gmail.com')

WebUI.selectOptionByIndex(findTestObject('Web RoomMe.id/Community Page/Community Registration/Dropdown Interest'), '4')

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Community Registration/Button Submit'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Success Message/Image Success'), 
    0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Success Message/Button Close'), 
    0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Success Message/Text Community Registration Successfull'), 
    0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Success Message/Text Well done Welcome to our community'), 
    0)

