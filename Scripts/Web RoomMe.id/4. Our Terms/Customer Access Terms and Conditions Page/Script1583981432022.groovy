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

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Footer/Button Terms Conditions'))

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/2. Verify Header RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/7. Verify Footer RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button FAQs'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Terms  Conditions'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Terms of Use'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Disclaimer'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Privacy Policy'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Image Terms and Conditions'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text Global Content of Terms  Conditions for Web and Apps'), 
    60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q1'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q1'), 'Welcome to RoomMe')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A1'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A1'), findTestData('RoomMe.id Text Data/RoomMe.id Terms and Conditions Text Data').getValue(
        1, 1))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q2'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q2'), 'Copyright')

WebUI.click(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q2'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A2'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A2'), findTestData('RoomMe.id Text Data/RoomMe.id Terms and Conditions Text Data').getValue(
        1, 2))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q3'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q3'), 'Cookies')

WebUI.click(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q3'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A3'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A3'), findTestData('RoomMe.id Text Data/RoomMe.id Terms and Conditions Text Data').getValue(
        1, 3))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q4'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q4'), 'License and Site Access')

WebUI.click(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q4'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A4'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A4'), findTestData('RoomMe.id Text Data/RoomMe.id Terms and Conditions Text Data').getValue(
        1, 4))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q5'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q5'), 'Comments, Reviews, and Emails')

WebUI.click(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q5'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A5'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A5'), findTestData('RoomMe.id Text Data/RoomMe.id Terms and Conditions Text Data').getValue(
        1, 5))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q6'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q6'), 'Content Liability')

WebUI.click(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q6'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A6'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A6'), findTestData('RoomMe.id Text Data/RoomMe.id Terms and Conditions Text Data').getValue(
        1, 6))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q7'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q7'), 'User Account')

WebUI.click(findTestObject('Web RoomMe.id/Terms and Conditions Page/Button Q7'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A7'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Terms and Conditions Page/Text A7'), findTestData('RoomMe.id Text Data/RoomMe.id Terms and Conditions Text Data').getValue(
        1, 7))

