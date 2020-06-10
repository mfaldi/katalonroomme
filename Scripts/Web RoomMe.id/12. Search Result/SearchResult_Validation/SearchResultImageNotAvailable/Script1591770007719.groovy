import org.openqa.selenium.By as By
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger

import com.web.roomme.object.SearchResultObject

SearchResultObject searchResultObj= new SearchResultObject()
def image = null


for (def loop : (1..countResult)) {
    image = driver.findElement(By.xpath(searchResultObj.getXpathSearchResultImage(loop)))

    if (image.getAttribute('src').equals(GlobalVariable.imageNotAvailable)) {
        KeywordUtil.markWarning(('----' + image.getAttribute('alt')) + ' - Search Result Image Not Available')
		logOutput.println(image.getAttribute('alt') + ' - Search Result Image Not Available')
    } else {
        KeywordUtil.logInfo(image.getAttribute('alt') + ' - Search Result Image Available')
    }
}

WebUI.scrollToPosition(9999999, 0)