import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import java.util.concurrent.TimeUnit

import org.openqa.selenium.WebDriver as WebDriver

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
 

println 'hehew '+ GlobalVariable.linkProd
CustomKeywords.'com.web.roomme.generalfunction.GeneralFunction.openBrowser'(GlobalVariable.linkProd)

WebDriver driver = DriverFactory.getWebDriver()
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS)

FileWriter file = new FileWriter(RunConfiguration.getProjectDir()+'/ReportsDetail/ReportSearchResultMainTest.txt')

PrintWriter logOutput = new PrintWriter(file, true)

def myListLocation = ['Banten', 'Daerah Istimewa Yogyakarta', 'Jawa Barat', 'Jakarta']

for (def location : myListLocation) {
    KeywordUtil.logInfo('Location : ' + location)

    logOutput.println('Location : ' + location)

    CustomKeywords.'com.web.roomme.generalfunction.GeneralFunction.SearchKostByLocation'(location, driver)

    def countResult = CustomKeywords.'com.web.roomme.searchResultvalidation.KeywordDetailBuildingValidation.scrollToBottomSearchResult'(driver)

    // Call Test Case validate result Image
    WebUI.callTestCase(findTestCase('Test Cases/Web RoomMe.id/12. Search Result/SearchResult_Validation/SearchResultImageNotAvailable'), 
        [('countResult') : countResult, ('envi') : GlobalVariable.linkProd, ('driver') : driver, ('logOutput') : logOutput])

    // Call Test Case validate detail - room type image
    WebUI.callTestCase(findTestCase('Test Cases/Web RoomMe.id/12. Search Result/SearchResult_Validation/DetailBuildingsValidation'), [('countResult') : countResult
            , ('envi') : GlobalVariable.linkProd, ('driver') : driver, ('logOutput') : logOutput])

    logOutput.println('------------------------------')
} 

logOutput.close()

WebUI.closeBrowser()