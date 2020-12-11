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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/1. Customer Access RoomMe Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Header/Button Sign In'), 0)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Header/Button Sign In'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Sign In Menu/Button Sign In with Google'), 0)

WebUI.click(findTestObject('Web RoomMe.id/Sign In Menu/Button Sign In with Google'))

WebUI.getWindowTitle()

WebUI.switchToWindowTitle('Masuk - Akun Google')

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Google Sign In/Textfield Email Google'), 0)

WebUI.setText(findTestObject('Web RoomMe.id/Google Sign In/Textfield Email Google'), 'faldi@roomme.space')

WebUI.click(findTestObject('Web RoomMe.id/Google Sign In/Button Berikutnya'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Google Sign In/Textfield Password'), 0)

WebUI.setEncryptedText(findTestObject('Web RoomMe.id/Google Sign In/Textfield Password'), 'aWQtAdXqif4Z+35qHGW6CQ==')

WebUI.click(findTestObject('Web RoomMe.id/Google Sign In/Button Berikutnya (Password)'))

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Header/User Menu/User Profile Image'), 0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Header/User Menu/User Menu'), 0)

