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

Mobile.startExistingApplication('com.roomme.tenant.dev')

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 1/Image Splash 1'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 1/Button Next'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 1/Text Find Destination'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 1/Text Start with find RoomMe around you or other locations might you like'), 
    0)

Mobile.tap(findTestObject('Android RoomMe.id/Splash 1/Button Next'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 2/Button Back'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 2/Button Next'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 2/Image Splash 2'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 2/Text Arrange easily your stay period to follow what your needs'), 
    0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 2/Text Select The Date'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Splash 2/Button Back'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Splash 1/Button Next'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Splash 2/Button Next'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 3/Button Back'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 3/Button Find Room'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 3/Image Splash 3'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 3/Text Enjoy Your Room'), 0)

Mobile.waitForElementPresent(findTestObject('Android RoomMe.id/Splash 3/Text Looking for a comfy with the best room facilities never been so simple Lets start'), 
    0)

Mobile.tap(findTestObject('Android RoomMe.id/Splash 3/Button Back'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Splash 2/Button Next'), 0)

Mobile.tap(findTestObject('Android RoomMe.id/Splash 3/Button Find Room'), 0)

