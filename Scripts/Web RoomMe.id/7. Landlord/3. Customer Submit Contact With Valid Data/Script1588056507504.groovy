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
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Web RoomMe.id/7. Landlord/1. Customer Access Landlord Page From Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), 0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Name'), 'Faldi AT')

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Phone Number'), 0)

WebUI.sendKeys(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Textfield Phone Number'), '08123456789')

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Button Submit'))

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Success Message/Image Toast Success'), 
    0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Landlord Page/Success Message/Text We will contact you through phone call'), 
    0)

