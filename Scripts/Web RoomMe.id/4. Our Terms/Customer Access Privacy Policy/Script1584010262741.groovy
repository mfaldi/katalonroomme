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

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Footer/Button Privacy Policy'))

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/2. Verify Header RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/7. Verify Footer RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button FAQs'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Terms  Conditions'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Terms of Use'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Disclaimer'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id FAQ Page/Button Privacy Policy'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Image Privacy Policy'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text Privacy Policy'), 60)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text Privacy Policy Content'), 60)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text Privacy Policy Content'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 1))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q1'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q1'), 'Definitions')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A1'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A1'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 2))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q2'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q2'), 'Information Collection and Use')

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q2'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A2'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A2'), 'We collect several different types of information for various purposes to provide and improve our Service to you.')

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q3'), 'Personal Data')

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q3'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A3'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A3'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 4))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q4'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q4'), 'Use of Data')

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q4'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A4'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A4'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 5))

not_run: WebUI.executeJavaScript('document.body.style.zoom=\'50%\'', null)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q5'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q5'), 'Transfer of Data')

WebUI.scrollToElement(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q4'), 0)

WebUI.verifyElementInViewport(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q5'), 0)

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q5'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A5'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A5'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 6))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q6'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q6'), 'Disclosure of Data')

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q6'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A6'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A6'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 7))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q7'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q7'), 'Security of Data')

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q7'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A7'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A7'), 'The security of your data is important to us but remember that no method of transmission over the Internet or method of electronic storage is 100% secure. While we strive to use commercially acceptable means to protect your Personal Data, we cannot guarantee its absolute security.')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q8'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q8'), 'Service Providers')

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q8'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A8'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A8'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 9))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q9'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q9'), 'Links to Other Sites')

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q9'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A9'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A9'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 10))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q10'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q10'), 'Children\'s Privacy')

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q10'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A10'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A10'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 11))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q11'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q11'), 'Changes to This Privacy Policy')

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q11'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A11'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A11'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 12))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q12'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q12'), 'Contact Us')

WebUI.click(findTestObject('Web RoomMe.id/Privacy Policy Page/Button Q12'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A12'), 0)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/Privacy Policy Page/Text A12'), findTestData('RoomMe.id Text Data/RoomMe.id Privacy Policy Text Data').getValue(
        1, 13))

