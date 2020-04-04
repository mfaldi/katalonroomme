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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://web.roomme.id/')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Image Logo Header'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Button  Community'))

not_run: WebUI.verifyElementVisible(findTestObject('null'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Button List Your Unit Here'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Button Sign In'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Button Sign Up'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Image Thumbnail Promo'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Field Search Box'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Field Amenities'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Field Connect to Instagram'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Field Reccomended Kost'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Field Footer'))

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Homepage/Image Logo Footer'))

not_run: WebUI.closeBrowser()

