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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

WebUI.callTestCase(findTestCase('Web RoomMe.id/7. Landlord/1. Customer Access Landlord Page From Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), 0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), 'ab')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Error Message/Text At least input 3 characters long'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), 'ab1')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Error Message/Text Your name seems to contain incorrect characters'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), 'faldi ')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Error Message/Text Your name seems to contain incorrect characters'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), 'ABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEABCDEa')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Error Message/Text Maximum input 50 characters long'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Error Message/Text Name is required'), 
    0)

