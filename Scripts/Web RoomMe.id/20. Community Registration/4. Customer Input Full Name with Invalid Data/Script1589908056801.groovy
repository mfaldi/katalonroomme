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

WebUI.callTestCase(findTestCase('Web RoomMe.id/6. Community/Customer Access Community Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Welcome Video/Button Continue on the Form Registration'), 
    0)

WebUI.click(findTestObject('Web RoomMe.id/Community Page/Welcome Video/Button Continue on the Form Registration'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), 0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), 'ab')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text At least input 3 characters long'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), '123')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Your name seems to contain incorrect characters'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), '!@#$')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Your name seems to contain incorrect characters'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), 'abcde12345abcde12345abcde12345abcde12345abcde12345as')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/Community Page/Community Registration/Error Message/Text Name input characters is 50'), 
    0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/Community Page/Community Registration/Textfield Full Name'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

