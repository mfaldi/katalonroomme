import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Actions actions = new Actions(DriverFactory.getWebDriver())

for (def indexBuilding : (1..countResult)) {
    /* open new tab for building by index*/
    def buildingsName = CustomKeywords.'com.web.roomme.searchResultvalidation.KeywordDetailBuildingValidation.OpenBuildingAsNewTab'(
        driver, actions, indexBuilding)

    KeywordUtil.logInfo('Buildings No : ' + indexBuilding)

    KeywordUtil.logInfo('Buildings Name : ' + buildingsName)

    /* ========= Pengecekan Gambar utama kost & fasilitasnya =========*/
    CustomKeywords.'com.web.roomme.searchResultvalidation.KeywordDetailBuildingValidation.validatePrimaryRoomImage'(driver, 
        buildingsName, actions, logOutput)
	
	/* ========= Pengecekan Fasilitas Gedung Exist =========*/
	CustomKeywords.'com.web.roomme.searchResultvalidation.KeywordDetailBuildingValidation.validateBuildingAmenitiesExist'(driver,buildingsName,logOutput)

    /* ========= Pengecekan Gambar Room Type & fasilitasnya =========*/
    CustomKeywords.'com.web.roomme.searchResultvalidation.KeywordDetailBuildingValidation.validateRoomTypeImageAndAmenities'(
          driver, buildingsName, actions, logOutput)

    WebUI.closeWindowIndex(1)

    WebUI.switchToWindowIndex(0)
}