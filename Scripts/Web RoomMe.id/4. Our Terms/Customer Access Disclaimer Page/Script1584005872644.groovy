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

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Footer/Button Disclaimer'))

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/2. Verify Header RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/7. Verify Footer RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button FAQs'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Terms  Conditions'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Terms of Use'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Disclaimer'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Privacy Policy'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Disclaimer Page/Image Disclaimer'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Disclaimer Page/Text Global Disclaimer'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Disclaimer Page/Text Disclaimer Content'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Disclaimer Page/Text Disclaimer Content'), findTestData('RoomMe.id Text Data/RoomMe.id Disclaimer Text Data').getValue(
        1, 1))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Disclaimer Page/Button Q1'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Disclaimer Page/Button Q1'), 'Consent')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Disclaimer Page/Text A1'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Disclaimer Page/Text A1'), 'By using our website, you hereby consent to our disclaimer and agree to its terms.')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Disclaimer Page/Button Q2'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Disclaimer Page/Button Q2'), 'Update')

WebUI.click(findTestObject('Web RoomMe.id/Disclaimer Page/Button Q2'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Disclaimer Page/Text A2'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Disclaimer Page/Text A2'), 'Should we update, amend or make any changes to this document, those changes will be promptly posted here.')

