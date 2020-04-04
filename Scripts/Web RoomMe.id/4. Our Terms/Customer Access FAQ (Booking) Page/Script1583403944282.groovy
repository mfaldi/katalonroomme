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

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Footer/Button FAQ'))

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/2. Verify Header RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button FAQs'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Terms  Conditions'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Terms of Use'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Disclaimer'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Privacy Policy'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Booking'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Payment'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q1'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q1'), 'Can I make a room booking at kost RoomMe ?')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A1'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A1'), 'Yes, you can browse through ourlisting for available rooms.')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q2'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q2'), 'Can I survey the place prior to making payments ?')

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q2'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A2'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A2'), 'Yes you may and we encourage you to do so! Our survey sessions are held every Monday-Sunday, from 8AM-10PM')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q3'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q3'), 'What consist of the standard facilities provided by RoomMe ?')

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q3'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A3'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A3'), findTestData('RoomMe.id Text Data/RoomMe.id FAQ Text Data').getValue(
        1, 1))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q4'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q4'), 'What if I want to move out of my kost before my stay period is over ?')

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q4'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A4'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A4'), 'We have a “No Cancellation Policy” where customers cannot cancel bookings that they have made.')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q5'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q5'), 'Can I invite relative/friends to occasionally stay at the kost ?')

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q5'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A5'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A5'), 'Our kost facilities are intended only forregistered and registered tenants. If the tenant wishes to host guests, then a rate of Rp. 250,000 per person per night is required. There is a maximum of 2 people perroom, and if the guest(s) stays for more than 1 day, he/she must provide government-approved identification (PERSONAL IDENTIFICATION CARD [KTP] / DRIVER’S LICENSE [SIM] / PASSPORT).')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q6'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q6'), 'To whom and where do I report to if there is damage in my room ?')

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Q6'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A6'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Text A6'), 'For reports, please call or WhatsApp our customer service at 0821-7666-6300')

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/7. Verify Footer RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

