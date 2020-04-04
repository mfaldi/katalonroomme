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
import java.lang.Integer as Integer

WebUI.callTestCase(findTestCase('Web RoomMe.id/12. Search Result/Customer Select Kost'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Button Continue to Book'))

not_run: WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Button Continue to Book'))

not_run: if (WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Button Selected Room'), FailureHandling.STOP_ON_FAILURE)) {
    String textroomprice = WebUI.getText(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/Text Room Price')).replaceAll(
        '[^0-9.]', '')

    String texttotalroomprice = WebUI.getText(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/p_Rp 1470001')).replaceAll(
        '[^0-9.]', '')

    String textadditionalday = WebUI.getText(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/p_Rp 70001')).replaceAll(
        '[^0-9.]', '')

    String textdeposit = WebUI.getText(findTestObject('Web RoomMe.id/RoomMe.id Kost Detail/p_Rp 500000')).replaceAll('[^0-9.]', 
        '')
}

