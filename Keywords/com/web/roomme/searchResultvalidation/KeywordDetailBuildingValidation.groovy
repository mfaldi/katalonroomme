package com.web.roomme.searchResultvalidation

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.web.roomme.generalfunction.GeneralFunction
import com.web.roomme.generalfunction.GeneralObject
import com.web.roomme.object.SearchResultObject

import internal.GlobalVariable

public class KeywordDetailBuildingValidation {
	GeneralObject generalObj = new GeneralObject()
	SearchResultObject searchResultObj= new SearchResultObject()
	GeneralFunction generalFunct = new GeneralFunction()

	/**
	 * Scroll To Bottom
	 */
	@Keyword
	def scrollToBottomSearchResult(WebDriver paramWebDriver) {
		generalFunct.waitForLoadingIcon(paramWebDriver)

		Integer countBeforeScroll = generalFunct.getElementExistWithSize(paramWebDriver, searchResultObj.getXpathBuildingForSearch(),1)
		Integer countAferScroll


		while( true ) {
			WebUI.scrollToPosition(0, 9999999)

			generalFunct.waitForLoadingIcon(paramWebDriver)
			countAferScroll = 	generalFunct.getElementExistWithSize(paramWebDriver, searchResultObj.getXpathBuildingForSearch(),1)


			if( countBeforeScroll==countAferScroll ) {
				//	println 'SUDAHHH sama'
				break
			}else{
				//	println 'masih belum sama'
				countBeforeScroll = countAferScroll
			}
		}
		KeywordUtil.logInfo('Total Count :'+countAferScroll)
		return countAferScroll
	}

	/**
	 *  Open new tab for every building on result page
	 */
	@Keyword
	def OpenBuildingAsNewTab(WebDriver driver , Actions actions, Integer indexBuilding) {
		def buildingsName = driver.findElement(By.xpath(searchResultObj.getXpathSearchResultImage(indexBuilding))).getAttribute('alt')

		actions.keyDown(Keys.LEFT_CONTROL).click(driver.findElement(By.xpath(searchResultObj.getXpathSearchResultImage(indexBuilding)))).keyUp(Keys.LEFT_CONTROL).build().perform()

		WebUI.switchToWindowIndex(1)

		return buildingsName
	}

	/**
	 *  validasi primary image apakah exist
	 */
	@Keyword
	def validatePrimaryRoomImage(def driver, def buildingsNameParam, Actions actions, PrintWriter logOutput) {
		def primaryRoomImageExist = 	generalFunct.getElementExistWithSize(driver, searchResultObj.getXpathPrimaryRoomImage(),1)

		if (primaryRoomImageExist > 0) {
			KeywordUtil.logInfo(buildingsNameParam + ' - Detail - 1. Primary Image Available')

			driver.findElement(By.xpath(searchResultObj.getXpathPrimaryRoomImage())).click()

			validateDuplicatePrimaryRoomImageAmenities(driver, buildingsNameParam,logOutput)

			actions.sendKeys(Keys.ESCAPE).perform()
		} else {
			KeywordUtil.markWarning(buildingsNameParam + ' ----- Detail - Primary Image Not Available')

			logOutput.println(buildingsNameParam + ' - Primary Image Not Available')
		}
	}

	/**
	 *  validasi duplikasi amenities pada primary image
	 */
	def validateDuplicatePrimaryRoomImageAmenities(def driver, def buildingsNameParam,PrintWriter logOutput) {
		def countPrimaryImageAmenities = generalFunct.getElementExistWithSize(driver, searchResultObj.getXpathPrimaryImageAmenities(),1)

		if (countPrimaryImageAmenities > 0) {
			ArrayList<String> listPrimaryImageAmenities = new ArrayList<String>()

			for (def counter : (1..countPrimaryImageAmenities)) {
				def amenitiesName = driver.findElement(By.xpath(searchResultObj.getXpathPrimaryImageAmenitiesByIndex(counter))).getText()

				if (listPrimaryImageAmenities.contains(amenitiesName)) {
					KeywordUtil.markWarning(((buildingsNameParam + ' ----- Primary Image - Amenities ') + amenitiesName) + ' - Duplicate')

					logOutput.println(((buildingsNameParam + ' - Primary Image Amenities ') + amenitiesName) + ' Duplicate')

					break
				} else {
					listPrimaryImageAmenities.add(amenitiesName)
				}
			}
			KeywordUtil.markPassed('listPrimaryImageAmenities  : ' +listPrimaryImageAmenities.toString())
		} else {
			KeywordUtil.markWarning(buildingsNameParam + ' ----- Primary Image - Amenities Doesnt Exist')

			logOutput.println(buildingsNameParam + ' - Primary Image Amenities Doesnt Exist')
		}
	}

	/**
	 *  validasi fasilitas gedung exist
	 */
	@Keyword
	def validateBuildingAmenitiesExist(def driver, def buildingsNameParam, PrintWriter logOutput) {
		def buildingAmenitiesExist = generalFunct.getElementExistWithSize(driver, searchResultObj.getXpathBuildingAmenities(),1)

		if (buildingAmenitiesExist > 0) {
			KeywordUtil.logInfo(buildingsNameParam + ' - Detail - 2. Building Amenities Available')
		} else {
			KeywordUtil.markWarning(buildingsNameParam + ' ----- Detail - Building Amenities Not Available')

			logOutput.println(buildingsNameParam + ' - Building Amenities Not Available')
		}
	}

	/**
	 *  validasi Room Type apakah exist & image exist & room amenities exist
	 */
	@Keyword
	def validateRoomTypeImageAndAmenities( def driver, def buildingsNameParam, Actions actions,PrintWriter logOutput) {
		def countRoomType = generalFunct.getElementExistWithSize(driver, searchResultObj.getXpathRoomType(),1)

		if (countRoomType > 0) {
			for (def roomTypeIndex : (1..countRoomType)) {
				def image = driver.findElement(By.xpath(searchResultObj.getXpathRoomTypeByIndex(roomTypeIndex)))

				if (image.getAttribute('src').equals(GlobalVariable.imageNotAvailable)) {
					KeywordUtil.markWarning(((buildingsNameParam + ' - ') + image.getAttribute('alt')) + ' ----- Room Type Image Not Available')

					logOutput.println(((buildingsNameParam + ' - ') + image.getAttribute('alt')) + ' Room Type Image Not Available')
				} else {
					KeywordUtil.logInfo(((buildingsNameParam + ' - ') + image.getAttribute('alt')) + ' - 3. Room Type Image Available')
				}

				def roomAmenitiesExist = generalFunct.getElementExistWithSize(driver, searchResultObj.getXpathForCountRoomAmenities(roomTypeIndex),1)
				if (roomAmenitiesExist > 0) {
					KeywordUtil.logInfo(((buildingsNameParam + ' - ') + image.getAttribute('alt')) + ' - 4. Amenities Available')

					validateDuplicateRoomTypeAmenities(driver, buildingsNameParam, roomTypeIndex, actions,logOutput)
				} else {
					KeywordUtil.markWarning(((buildingsNameParam + ' - ') + image.getAttribute('alt')) + ' ----- Amenities Not Available')

					logOutput.println(((buildingsNameParam + ' - ') + image.getAttribute('alt')) + ' Amenities Not Available')
				}
			}
		} else {
			KeywordUtil.markWarning(buildingsNameParam + ' ----- Room Doesnt Exist')

			logOutput.println(buildingsNameParam + ' - Room Doesnt Exist')
		}
	}

	/**
	 *  validasi tidak ada duplikasi pada amenities dalam setiap room type (beserta see more)
	 */
	def validateDuplicateRoomTypeAmenities(def driver, def buildingsNameParam, def roomTypeIndex, Actions actions,PrintWriter logOutput) {

		def totalRoomAmenities = generalFunct.getElementExistWithSize(driver, searchResultObj.getXpathForCountRoomAmenities(roomTypeIndex),1)

		ArrayList<String> listRoomAmenities = new ArrayList<String>()

		for (def loopAmen : (1..totalRoomAmenities)) {
			def amenitiesName = driver.findElement(By.xpath(searchResultObj.getXpathRoomAmenitiesByRoomTypeIndexAndAmenIndex(roomTypeIndex, loopAmen))).getText()

			if (listRoomAmenities.contains(amenitiesName)) {
				KeywordUtil.markWarning(((buildingsNameParam + ' ----- Room Type Amenities : ') + amenitiesName) + ' - Duplicate')

				logOutput.println(((buildingsNameParam + ' - Room Type Amenities ') + amenitiesName) + ' Duplicate')

				break
			} else {
				listRoomAmenities.add(amenitiesName)
			}
		}
		def xpathSeeMoreAmenities = searchResultObj.getXpathSeeMoreAmenitiesByRoomTypeIndex(roomTypeIndex)

		def seeMoreAmenitiesExist = generalFunct.getElementExistWithSize(driver, xpathSeeMoreAmenities,1)

		if (seeMoreAmenitiesExist > 0) {
			WebElement seeMoreEl = driver.findElement(By.xpath(xpathSeeMoreAmenities))

			generalFunct.clickUsingJS(driver, seeMoreEl)

			def totalRoomAmenitiesSeeMore = generalFunct.getElementExistWithSize(driver, searchResultObj.getXpathForCountRoomAmenitiesSeeMore(roomTypeIndex),1)


			for (def loopAmenSeeMore : (1..totalRoomAmenitiesSeeMore)) {
				def amenitiesNameSeeMore = driver.findElement(By.xpath(searchResultObj.getXpathSeeMoreRoomAmenitiesByRoomTypeIndexAndAmenIndex(roomTypeIndex, loopAmenSeeMore))).getText()

				if (listRoomAmenities.contains(amenitiesNameSeeMore)) {
					KeywordUtil.markWarning(((buildingsNameParam + ' ----- Room Type See More Amenities : ') + amenitiesNameSeeMore) +
							' - Duplicate')

					logOutput.println(((buildingsNameParam + ' - Room Type See More Amenities ') + amenitiesNameSeeMore) + ' Duplicate')

					break
				} else {
					listRoomAmenities.add(amenitiesNameSeeMore)
				}
			}
		}
		KeywordUtil.markPassed('listRoomAmenities room type + seemore : ' +listRoomAmenities.toString())
	}
}
