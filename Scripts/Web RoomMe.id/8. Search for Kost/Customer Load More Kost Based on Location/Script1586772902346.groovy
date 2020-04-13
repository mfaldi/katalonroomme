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

WebUI.callTestCase(findTestCase('Web RoomMe.id/8. Search for Kost/1. Customer Search For Kost 1 Month 0 Day'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Web RoomMe.id/RoomMe.id Footer/Button FAQ'), 0)

//for (int i = 0; i <= 3; i++) {
//    WebUI.scrollToElement(findTestObject('Web RoomMe.id/RoomMe.id Footer/Button FAQ'), 0 )
//  WebUI.verifyElementNotVisible(findTestObject('Web RoomMe.id/Search Result Menu/Image Loading Search Result'), FailureHandling.STOP_ON_FAILURE)
//}
while (true) {
    if (WebUI.verifyElementVisibleInViewport(findTestObject('Web RoomMe.id/Search Result Menu/Image Loading Search Result'), 
        0, FailureHandling.STOP_ON_FAILURE)) {
        WebUI.waitForPageLoad(0)

        WebUI.scrollToElement(findTestObject('Web RoomMe.id/RoomMe.id Footer/Button FAQ'), 0)
    } else {
        println('Loaded Successfully')
    }
}

