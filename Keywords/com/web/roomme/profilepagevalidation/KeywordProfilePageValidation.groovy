package com.web.roomme.profilepagevalidation

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class KeywordProfilePageValidation {

	/**
	 *  direct to profile page
	 */
	@Keyword
	def directToEditProfile() {
		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id Header/User Menu/User Menu'))
		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/menu_My Profile'))
		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/btn_editProfile'))
	}


	/**
	 *  list of validation
	 */
	@Keyword
	def doListValidation() {
		validationEmptyFullName()
		validationFullNameContainSpecialChar()
		validationEmptyPhoneNumber()
		validationInvalidPhoneNumber()
		validationEmptyDob()
		emptyAddress()
	}



	/**
	 *  Validation empty full name
	 */
	def validationEmptyFullName() {
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Full Name'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Full Name'), Keys.chord(Keys.BACK_SPACE))

		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/warning_Full Name is required'), 2)==true) {
			KeywordUtil.logInfo('Validation Warning text Full Name is required - success')
		}else{
			KeywordUtil.markWarning('Validation Warning text - Full Name is required - not shown')
		}
	}

	/**
	 *  Validation full name Containt Number
	 */
	def validationFullNameContainSpecialChar() {

		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Full Name'), '12345%^&')

		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/warning_Your name seems to contain incorrect characters'), 2)==true) {
			KeywordUtil.logInfo('Validation Your name seems to contain incorrect characters - success')
		}else{
			KeywordUtil.markWarning('Validation Warning - Your name seems to contain incorrect characters - not shown')
		}

		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Full Name'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Full Name'), Keys.chord(Keys.BACK_SPACE))
	}

	/**
	 *  Validation empty phone number
	 */
	def validationEmptyPhoneNumber() {

		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Mobile Number'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Mobile Number'), Keys.chord(Keys.BACK_SPACE))


		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/warning_Mobile Number is required'), 2)==true) {
			KeywordUtil.logInfo('Validation Warning dialog Mobile Number is required - success')
		}else{
			KeywordUtil.markWarning('Validation Warning - Mobile Number is required - not shown')
		}
	}

	/**
	 *  Validation invalid phone number
	 */
	def validationInvalidPhoneNumber() {
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Mobile Number'), '1234567890123')


		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/warning_Phone Number contains an invalid number'), 2)==true) {
			KeywordUtil.logInfo('Validation Warning dialog Mobile Number is invalid - success')
		}else{
			KeywordUtil.markWarning('Validation Warning - Mobile Number is invalid - not shown')
		}
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Mobile Number'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Mobile Number'), Keys.chord(Keys.BACK_SPACE))
	}

	/**
	 *  Validation empty DOB
	 */
	def validationEmptyDob() {
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/BirthDate Element/btn_clearCalendar'), 2,FailureHandling.OPTIONAL)==true) {

			WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/BirthDate Element/btn_clearCalendar'))

			if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/warning_Birthdate is required'), 2)==true) {
				KeywordUtil.logInfo('Validation Warning dialog Birthdate is required - success')
			}else{
				KeywordUtil.markWarning('Validation Warning - Birthdate is required - not shown')
			}
		}
	}

	/**
	 *  empty address (No validation)
	 */
	def emptyAddress() {
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Address'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Address'), Keys.chord(Keys.BACK_SPACE))
	}


	/**
	 *  List of Set input
	 */
	@Keyword
	def doInputProfile(def fullName, def phoneNumber,def address) {
		setFullName(   fullName)
		setPhoneNumber(   phoneNumber)
		setDob( )
		setAddress(  address)
	}

	/**
	 *  set full name
	 */
	def setFullName(String fullName) {
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Full Name'), fullName)
	}

	/**
	 *  set phone number
	 */
	def setPhoneNumber(def phoneNumber) {
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Mobile Number'), phoneNumber)
	}

	/**
	 *  set dob
	 */
	def setDob() {

		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Birthdate'))

		for(int i=0;i<17;i++){
			WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/BirthDate Element/btn_prevYear'))
		}
		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/BirthDate Element/date_staticBirthDate'))
	}

	/**
	 *  set address
	 */
	def setAddress(String address) {
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Address'), address)
	}

	/**
	 *  Click button update profile
	 */
	@Keyword
	def clickButtonUpdateProfile() {
		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/button_UpdateProfile'))
	}

	/**
	 *  Close dialog success update profile
	 */
	@Keyword
	def closeDialogUpdateProfile() {

		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/popup_Your User Profil has been updated'), 2)==true) {
			WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/button_closeDialogSuccess'))
			KeywordUtil.logInfo('Success Update Profile')
		}else{
			KeywordUtil.markError('Failed update profile, dialog success not found / changed')
		}
	}

	/**
	 *  Close dialog success update profile
	 */
	@Keyword
	def doValidationAfterUpdate(def paramFullName, def paramPhoneNumber,def paramAddress) {
		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/btn_editProfile'))

		def fullNameGetText = WebUI.getAttribute(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Full Name'), 'value')
		if(fullNameGetText.equals(paramFullName)){
			KeywordUtil.logInfo('Validation Full Name - Match')
		}else{
			KeywordUtil.markWarning('Full Name - Input for update : '+paramFullName)
			KeywordUtil.markWarning('Full Name - Result After update :'+fullNameGetText)
			KeywordUtil.markError('Validation Full Name - Not Match')
		}

		def phoneNumberGetText = WebUI.getAttribute(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Mobile Number'), 'value')
		if(phoneNumberGetText.equals(paramPhoneNumber)){
			KeywordUtil.logInfo('Validation Phone Number - Match')
		}else{
			KeywordUtil.markWarning('Phone Number - Input for update : '+paramPhoneNumber)
			KeywordUtil.markWarning('Phone Number - Result After update :'+phoneNumberGetText)
			KeywordUtil.markError('Validation Phone Number - Not Match')
		}

		def addressGetText =  WebUI.getAttribute(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_Profile/input_Address'), 'value')
		if(addressGetText.equals(paramAddress)){
			KeywordUtil.logInfo('Validation Address - Match')
		}else{
			KeywordUtil.markWarning('Address - Input for update : '+paramAddress)
			KeywordUtil.markWarning('Address - Result After update :'+addressGetText)
			KeywordUtil.markError('Validation Address - Not Match')
		}
	}
}
