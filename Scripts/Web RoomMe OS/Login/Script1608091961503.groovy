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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://os-stg.roomme.id/sign-in')

WebUI.waitForElementVisible(findTestObject('Web RoomMe OS/Login Page/Page_RoomMe OS - Sign In/input_Email Address_signin_email'), 
    0)

WebUI.setText(findTestObject('Object Repository/Web RoomMe OS/Login Page/Page_RoomMe OS - Sign In/input_Email Address_signin_email'), 
    'ownertest3@getnada.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Web RoomMe OS/Login Page/Page_RoomMe OS - Sign In/input_Password_signin_password'), 
    'R2GnBZXYIh8PgItJ5/guow==')

WebUI.click(findTestObject('Object Repository/Web RoomMe OS/Login Page/Page_RoomMe OS - Sign In/button_Sign In'))

WebUI.closeBrowser()

