import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

String dataFile = 'Data Files/Wesly_Data_Test/verifyThirdPartyData'

KeywordUtil.logInfo('total rows third party link excel : ' + findTestData(dataFile).getRowNumbers())

for (Integer row = 1; row <= findTestData(dataFile).getRowNumbers(); row++) {
    WebUI.click(findTestObject(findTestData(dataFile).getObjectValue('object', row)))

    WebUI.switchToWindowIndex(row)

    if (WebUI.verifyElementPresent(findTestObject(findTestData(dataFile).getObjectValue('object_validation', row)), 30, 
        FailureHandling.CONTINUE_ON_FAILURE)) {
        KeywordUtil.markPassed(findTestData(dataFile).getObjectValue('object', row) + ' - Berhasil')
    } else {
        KeywordUtil.markFailed(findTestData(dataFile).getObjectValue('object', row) + ' - GAGAL!!')
    }
    
    WebUI.switchToWindowIndex(0)
}