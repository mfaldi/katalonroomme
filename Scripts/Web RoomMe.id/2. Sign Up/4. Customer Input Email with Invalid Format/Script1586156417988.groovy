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

WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/1. Customer Access RoomMe Page'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/2. Verify Header RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Header/Button Sign In'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign In Menu/Button Sign Up'), 0)

WebUI.click(findTestObject('Web RoomMe.id/Sign In Menu/Button Sign Up'))

WebUI.callTestCase(findTestCase('Web RoomMe.id/2. Sign Up/Verify Sign Up Menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), 'abc123')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Error Message/Text Email is not valid'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), 'abc 123')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Error Message/Text Email is not valid'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), '!@#$$!@')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Error Message/Text Email is not valid'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), 'ab@gmail')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Error Message/Text Email is not valid'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), 'ab@.com')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Error Message/Text Email is not valid'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), 'abc 1 2 3@ac.com')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign Up Menu/Error Message/Text Email is not valid'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Sign Up Menu/Textfield Email'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

