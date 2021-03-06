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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/1. Customer Access RoomMe Page'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/2. Verify Header RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/7. Verify Footer RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Button Sign In'))

not_run: WebUI.waitForElementClickable(findTestObject('Web RoomMe.id/Sign In Menu/Textfield Email'), 0)

not_run: WebUI.waitForElementClickable(findTestObject('Web RoomMe.id/Sign In Menu/Textfield Password'), 0)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/3. Sign In/Verify Sign In Menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Web RoomMe.id/Sign In Menu/Textfield Email'), GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('Web RoomMe.id/Sign In Menu/Textfield Password'), GlobalVariable.password)

WebUI.click(findTestObject('Web RoomMe.id/Sign In Menu/Button Sign In'))

not_run: WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Header/User Menu/Button User Menu'), 10, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Header/User Menu/User Profile Image'), 10, 
    FailureHandling.STOP_ON_FAILURE)

