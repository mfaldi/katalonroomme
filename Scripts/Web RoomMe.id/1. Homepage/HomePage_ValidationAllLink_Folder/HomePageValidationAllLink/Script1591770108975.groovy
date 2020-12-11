import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String dataFile = 'Data Files/Wesly_Data_Test/verifyData'

WebUI.openBrowser(GlobalVariable.linkDevelopment)

WebUI.maximizeWindow()

KeywordUtil.logInfo('total rows Homepage link excel : ' + findTestData(dataFile).getRowNumbers())

// Notes : perulangan untuk validasi setiap link di Homepage, setelah diklik, lalu back
for (Integer row = 1; row <= findTestData(dataFile).getRowNumbers(); row++) {
    WebUI.click(findTestObject(findTestData(dataFile).getObjectValue('object', row)))

    if (WebUI.verifyElementPresent(findTestObject(findTestData(dataFile).getObjectValue('object_validation', row)), 30, 
        FailureHandling.CONTINUE_ON_FAILURE)) {
        KeywordUtil.markPassed(findTestData(dataFile).getObjectValue('object', row) + ' - Berhasil')
    } else {
        KeywordUtil.markFailed(findTestData(dataFile).getObjectValue('object', row) + ' - GAGAL!!')
    }
    
    WebUI.back()
}

// Notes : pemanggilan testcase validasi untuk link pihak ke 3
WebUI.callTestCase(findTestCase('Wesly_Test_Case/HomePage_ValidationAllLink_Folder/HomePage_ValidationThirdPartyLink'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()