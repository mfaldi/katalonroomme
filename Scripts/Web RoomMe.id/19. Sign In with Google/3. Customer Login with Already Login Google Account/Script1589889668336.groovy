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

WebUI.callTestCase(findTestCase('Web RoomMe.id/19. Sign In with Google/1. Customer Login with Registered Gmail'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Header/User Menu/Button User Menu'), 0)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Header/User Menu/Button User Menu'))

WebUI.click(findTestObject('Web RoomMe.id/User Menu/Button Sign Out'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Header/Button Sign In'), 0)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Header/Button Sign In'))

WebUI.click(findTestObject('Web RoomMe.id/Sign In Menu/Button Sign In with Google'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Header/User Menu/User Profile Image'), 0)

WebUI.waitForElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Header/User Menu/User Menu'), 0)

