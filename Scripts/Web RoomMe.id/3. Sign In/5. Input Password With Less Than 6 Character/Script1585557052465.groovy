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

WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/1. Customer Access RoomMe Page'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/2. Verify Header RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/7. Verify Footer RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Button Sign In'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/3. Sign In/Verify Sign In Menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign In Menu/Textfield Email'), 0)

WebUI.setText(findTestObject('Web RoomMe.id/Sign In Menu/Textfield Password'), 'abc')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign In Menu/Error Message/Text Minimum Password Required is 6 Character'), 
    10)

WebUI.clearText(findTestObject('Web RoomMe.id/Sign In Menu/Textfield Password'))

WebUI.setText(findTestObject('Web RoomMe.id/Sign In Menu/Textfield Password'), '12345')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign In Menu/Error Message/Text Minimum Password Required is 6 Character'), 
    10)

WebUI.clearText(findTestObject('Web RoomMe.id/Sign In Menu/Textfield Password'))

WebUI.setText(findTestObject('Web RoomMe.id/Sign In Menu/Textfield Password'), '!@#$%')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign In Menu/Error Message/Text Minimum Password Required is 6 Character'), 
    10)

