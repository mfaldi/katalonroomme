package com.web.roomme.object

import com.kms.katalon.core.annotation.Keyword

public class SearchResultObject {

	/**
	 *  Xpath untuk count building saat search
	 */
	@Keyword
	def getXpathBuildingForSearch() {
		return '//div[@class="search-results"]/div[1]/div[1]/div'
	}


	/**
	 *  Xpath untuk validasi image dari search result
	 */
	@Keyword
	def getXpathSearchResultImage(Integer loop) {
		return ('//div[@class="search-results"]/div/div/div[' + loop) + ']/div/div[1]/a/div/div[1]/img'
	}

	/**
	 *  Xpath Room Type for counting total room type
	 */
	@Keyword
	def getXpathRoomType() {
		return '//*[@class="search-results-detail"]/div/div[4]/div/div/div/div[1]/div/div'
	}

	/**
	 *  Xpath Primary Room Image (the big one)
	 */
	@Keyword
	def getXpathPrimaryRoomImage() {
		return '//*[@id="__layout"]/div/div[2]/div/div[3]/div/div/div[1]/div/div/div/div[1]/img'
	}


	/**
	 *  Xpath Amenities yang ada di primary image
	 */
	@Keyword
	def getXpathPrimaryImageAmenities() {
		return '//div[@id="modal-room___BV_modal_body_"]/div/div[2]/div/div/div/div[4]/div/div'
	}

	/**
	 *  Xpath primary image Amenities By Index
	 */
	@Keyword
	def getXpathPrimaryImageAmenitiesByIndex(Integer amenIndex) {
		return '//div[@id="modal-room___BV_modal_body_"]/div/div[2]/div/div/div/div[4]/div[1]/div['+ amenIndex +']'
	}


	/**
	 *  Xpath Room Type image by index
	 */
	@Keyword
	def getXpathRoomTypeByIndex(Integer roomTypeIndex) {
		return '//*[@class="search-results-detail"]/div/div[4]/div/div/div/div[1]/div/div[' +roomTypeIndex + ']/div/div/div[1]/div/div/img'
	}

	/**
	 *  Xpath Room Amenities by Room type index
	 */
	@Keyword
	def getXpathForCountRoomAmenities(Integer roomTypeIndex) {
		return '//*[@class="search-results-detail"]/div/div[4]/div/div/div/div[1]/div/div[' + roomTypeIndex + ']/div/div/div[2]/div/div[1]/div/div/div'
	}

	/**
	 *  Xpath Room Amenities by Room index and looping index
	 */
	@Keyword
	def getXpathRoomAmenitiesByRoomTypeIndexAndAmenIndex(Integer roomTypeIndex,Integer amenIndex) {
		return '//*[@class="search-results-detail"]/div/div[4]/div/div/div/div[1]/div/div['+ roomTypeIndex +']/div/div/div[2]/div/div[1]/div/div/div['+amenIndex+']'
	}


	/**
	 *  Xpath seemore by roomtype
	 */
	@Keyword
	def getXpathSeeMoreAmenitiesByRoomTypeIndex(Integer roomTypeIndex) {
		return '//*[@id="__layout"]/div/div[2]/div/div[3]/div/div/div[4]/div/div/div/div[1]/div/div['+ roomTypeIndex +']/div/div/div[2]/div/div[1]/a'
	}

	/**
	 *  count room amenities yang ada di see more 
	 */
	@Keyword
	def getXpathForCountRoomAmenitiesSeeMore(Integer roomTypeIndex) {
		return '//*[@id="__layout"]/div/div[2]/div/div[3]/div/div/div[4]/div/div/div/div[1]/div/div['+roomTypeIndex+']/div/div/div[2]/div/div[1]/div[3]/div/div'
	}

	/**
	 *  Xpath see more by room type dan amenities index
	 */
	@Keyword
	def getXpathSeeMoreRoomAmenitiesByRoomTypeIndexAndAmenIndex(Integer roomTypeIndex, Integer amenSeeMoreIndex) {
		return '//*[@id="__layout"]/div/div[2]/div/div[3]/div/div/div[4]/div/div/div/div[1]/div/div['+roomTypeIndex+']/div/div/div[2]/div/div[1]/div[3]/div/div['+amenSeeMoreIndex+']'
	}

	/**
	 *  Xpath building Amenities
	 */
	@Keyword
	def getXpathBuildingAmenities() {
		return '//*[@id="rooms"]/div/div/div[2]'
	}

	/**
	 *  Xpath building name
	 */
	@Keyword
	def getXpathBuildingName() {
		return '//*[@id="__layout"]/div/div[2]/div/div[3]/div/div/div[2]/div/div[1]/div/div[1]/div[1]/h1'
	}
}
