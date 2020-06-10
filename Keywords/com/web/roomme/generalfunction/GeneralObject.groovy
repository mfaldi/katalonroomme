package com.web.roomme.generalfunction

import com.kms.katalon.core.annotation.Keyword

public class GeneralObject {

	/**
	 *  Xpath loading icon saat pertama kali load page
	 */
	@Keyword
	def getXpathNewLoadingIcon() {
		return '//img[@alt="Roomme loadmore logo"]'
	}
}
