package com.web.roomme.buildingdetailbysearchsuggestion

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.By
import java.io.PrintWriter

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.web.roomme.generalfunction.GeneralFunction
import com.web.roomme.object.SearchResultObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable

public class KeywordBuildingDetailBySearchSuggestion {

	GeneralFunction genFunct = new GeneralFunction()
	SearchResultObject searchResObj = new SearchResultObject()
	def flag = 0
	/**
	 * Search kost by name, first index of autocomplete
	 */
	@Keyword
	def SearchKostBySuggestionName(String buildingName, WebDriver driver,PrintWriter logOutput) {
		//		WebUI.clearText(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/input_Search Location'))
		//		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/input_Search Location'), buildingName)

		driver.findElement(By.xpath('//input[@type = "text" and @placeholder = "Cari Lokasi Kost"]')).clear()

		String[] splitedName = buildingName.split("\\s+");

		for (def words : splitedName) {
			driver.findElement(By.xpath('//input[@type = "text" and @placeholder = "Cari Lokasi Kost"]')).sendKeys(words)
			driver.findElement(By.xpath('//input[@type = "text" and @placeholder = "Cari Lokasi Kost"]')).sendKeys(' ')
		}


		def suggestionCount = genFunct.getElementExistWithSize(driver, '//*[@class="absolute"]/div',3)
		KeywordUtil.logInfo( 'Autocomplete suggestionCount : '+suggestionCount)

		flag=0
		if(suggestionCount>0){
			for(def loop : (1..suggestionCount)){
				def suggestionText = driver.findElement(By.xpath('//*[@class="absolute"]/div['+loop+']')).getText()

				KeywordUtil.logInfo( 'ini suggestionText lower case  ke '+loop+'  : '+suggestionText.toLowerCase())
				KeywordUtil.logInfo( 'ini buildingName lower case: ' + buildingName.toLowerCase())

				if(suggestionText.toLowerCase().contains(buildingName.toLowerCase())){

					driver.findElement(By.xpath('//*[@class="absolute"]/div['+loop+']')).click()

					WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/input_Check-In_date'))

					genFunct.ClickTommorowsDateBooking(driver)

					WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Button Search'))

					validationDetailBySuggestion(driver,buildingName,logOutput)

					flag=1
					break
				}
			}
		}
		if(flag== 0 ){
			KeywordUtil.markWarning('Search Autocomplete : ' +buildingName + ' - doesn\'t exist')
			logOutput.println('Search Autocomplete : ' +buildingName + ' - doesn\'t exist')
			WebUI.click(findTestObject('Object Repository/Web RoomMe.id/Search Kost Menu/Button Search'))

		}
	}

	/**
	 * Validating detail by Suggestion
	 */
	def validationDetailBySuggestion(WebDriver driver, def paramBuildingName,PrintWriter logOutput) {

		def buildingTitle = driver.findElement(By.xpath('//*[@id="__layout"]/div/div[2]/div/div[3]/nav/ol/li[5]/span')).getText()
		KeywordUtil.logInfo( 'ini value nama buildingnya : '+buildingTitle)
		KeywordUtil.logInfo( 'paramBuildingName : '+ paramBuildingName)

		if(paramBuildingName.toString().equalsIgnoreCase(buildingTitle)){
			KeywordUtil.markPassed('This Building name : ' +paramBuildingName + ' - match')
		}else{
			KeywordUtil.markWarning('This Building name : ' +paramBuildingName + ' - not match')
			logOutput.println('This Building name : ' +paramBuildingName + ' - not match')
		}
	}
}
