package com.web.roomme.generalfunction
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat
import java.time.Duration
import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.FluentWait
import org.openqa.selenium.support.ui.Wait

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.web.roomme.object.HomePageObject

class GeneralFunction {

	/**
	 *  Open initial browser
	 */
	@Keyword
	def openBrowser(String linkEnvironment) {
		WebUI.openBrowser(linkEnvironment)
		WebUI.maximizeWindow()
	}

	/**
	 *  Set Waiting time for webdriver
	 */
	@Keyword
	def setWaitTime(WebDriver driver, def paramSecond) {
		driver.manage().timeouts().implicitlyWait(paramSecond, TimeUnit.SECONDS)
	}

	/**
	 *  Get Element Exist with wait time 1 seconnd
	 */
	@Keyword
	def getElementExistWithSize(WebDriver driver, def paramXpath, def timeoutSec) {
		setWaitTime(driver, timeoutSec)
		def isExist = driver.findElements(By.xpath(paramXpath)).size()
		setWaitTime(driver, 60)
		return isExist
	}

	@Keyword
	def clickUsingJS(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = ((driver) as JavascriptExecutor)
		executor.executeScript('arguments[0].click()', element)
	}

	/**
	 * Search kost by location, first index of autocomplete
	 */
	@Keyword
	def SearchKostByLocation(String location, WebDriver driver) {
		WebUI.clearText(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Textfield Input Location'))

		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Textfield Input Location'), location)

		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Textfield Input Location'), ' ')

		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/AutocompleteNo1'))

		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Datepicker Check-in'))

		ClickTommorowsDateBooking(driver)

		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Button Search'))
	}



	/**
	 * Get Tommorow's Date
	 */
	@Keyword
	def ClickTommorowsDateBooking(WebDriver paramWebDriver) {
		SimpleDateFormat sdf = new SimpleDateFormat('yyyy-MM-dd');
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 1);
		String tommorowsDate = sdf.format(cal.getTime());

		paramWebDriver.findElement(By.xpath(('//*[@title="' + tommorowsDate) + '"]')).click()
	}




	/**
	 * Wait loading saat page search result muncul
	 */
	def waitForLoadingIcon(WebDriver paramWebDriver){
		paramWebDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS)

		GeneralObject generalObj = new GeneralObject()
		Integer countTimeout =0
		Integer maxRetryTimeout=20

		Wait wait = new FluentWait(paramWebDriver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(50))
				.ignoring(Exception.class);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(generalObj.getXpathNewLoadingIcon())))

		paramWebDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS)
	}

	/**
	 * doLogin
	 */
	@Keyword
	def doLogin(def paramUser , def paramPass){

		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id Header/Button Sign In'))

		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/Sign In Menu/Textfield Email'), paramUser)

		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/Sign In Menu/Textfield Password'), paramPass)

		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Sign In Menu/Button Sign In'))
	}



	//	/**
	//	 * Refresh browser
	//	 */
	//	@Keyword
	//	def refreshBrowser() {
	//		KeywordUtil.logInfo("Refreshing")
	//		WebDriver webDriver = DriverFactory.getWebDriver()
	//		webDriver.navigate().refresh()
	//		KeywordUtil.markPassed("Refresh successfully")
	//	}

	//	/**
	//	 * Click element
	//	 * @param to Katalon test object
	//	 */
	//	@Keyword
	//	def clickElement(TestObject to) {
	//		try {
	//			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
	//			KeywordUtil.logInfo("Clicking element")
	//			element.click()
	//			KeywordUtil.markPassed("Element has been clicked")
	//		} catch (WebElementNotFoundException e) {
	//			KeywordUtil.markFailed("Element not found")
	//		} catch (Exception e) {
	//			KeywordUtil.markFailed("Fail to click on element")
	//		}
	//	}

	//	/**
	//	 * Get all rows of HTML table
	//	 * @param table Katalon test object represent for HTML table
	//	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	//	 * @return All rows inside HTML table
	//	 */
	//		@Keyword
	//		def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
	//			WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
	//			List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
	//			return selectedRows
	//		}
}