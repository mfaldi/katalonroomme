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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://web.roomme.id/')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Button List Your Unit Here'))

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Button List Your Unit Here'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id List Your Unit Here Page/Image Header'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id List Your Unit Here Page/Text Header'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id List Your Unit Here Page/Text List Your Unit'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id List Your Unit Here Page/Text Contacting and Visiting'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id List Your Unit Here Page/Text Contact Agreement'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id List Your Unit Here Page/Text Promoted'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/Roomme.id List Your Unit Here Page/Button Form List Your Unit Here'))

WebUI.closeBrowser()

