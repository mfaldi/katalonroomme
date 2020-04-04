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

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Footer/Button FAQ'))

WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/2. Verify Header RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button FAQs'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Terms  Conditions'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Terms of Use'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Disclaimer'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Privacy Policy'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Booking'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Payment'), 60)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Payment'))

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q1'), 'What method of payments does RoomMe offer ?')

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A1'), findTestData('RoomMe.id Text Data/RoomMe.id FAQ Text Data').getValue(
        1, 2))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q2'), 60)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q2'))

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q2'), 'Can I survey the place prior to making payments ?')

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A2'), 'No, we provide rental and payment terms in a 1-month, 3-months, 6-months or 12-months contract.')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q3'), 60)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q3'))

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q3'), 'Do I have to pay a deposit upfront ?')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A3'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A3'), findTestData('RoomMe.id Text Data/RoomMe.id FAQ Text Data').getValue(
        1, 3))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q4'), 60)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q4'))

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q4'), 'Will the payments be addressed to RoomMe or kost owners ?')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A4'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A4'), findTestData('RoomMe.id Text Data/RoomMe.id FAQ Text Data').getValue(
        1, 5))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q5'), 60)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q5'))

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q5'), 'Do you have installment programs ?')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A5'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A5'), 'Unfortunately, we do not have any installment programs at the moment')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q6'), 60)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q6'))

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q6'), 'How do I make payments for my kost ?')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A6'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A6'), findTestData('RoomMe.id Text Data/RoomMe.id FAQ Text Data').getValue(
        1, 5))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q7'), 60)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q7'))

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Button Q7'), 'Are there any fines imposed on me while staying with RoomMe ?')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A7'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/RoomMe FAQ Payment/Text A7'), findTestData('RoomMe.id Text Data/RoomMe.id FAQ Text Data').getValue(
        1, 4))

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/7. Verify Footer RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

