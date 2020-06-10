package com.web.roomme.profilepagevalidation

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class KeywordChangePasswordValidation {

	/**
	 *  direct to profile page
	 */
	@Keyword
	def directToChangePassword() {
		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id Header/User Menu/User Menu'))
		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/menu_My Profile'))
		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/btn_changePassword'))
	}

	/**
	 *  list of validation
	 */
	@Keyword
	def doListValidation() {
		validationOldPasswordUnderChar('ab12')
		validationLimitOldPasswordReached('12345678901234567')
		validationEmptyOldPassword()

		validationNewPasswordUnderChar('123')
		validationLimitNewPasswordReached('12345678901234567')
		validationEmptyNewPassword()

		validationConfirmPasswordUnderChar('ab12')
		validationLimitConfirmPasswordReached('12345678901234567')
		validationEmptyConfirmPassword()
		validationConfirmPasswordNotMatch('1234567890','123456')
	}

	/**
	 *  list of validation
	 */
	def validationOldPasswordUnderChar(def paramPass) {
		def warningTextPasswordUnderChar = 'Minimum Password Required is 6 Character'


		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Old Password'), paramPass)
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Old Password'), 2)==true) {
			if(warningTextPasswordUnderChar.equals(WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Old Password')))) {
				KeywordUtil.logInfo('Validation Warning text Minimum old Password Required is 6 Character - success')
			}else{
				println 'harusnya : '+warningTextPasswordUnderChar
				println 'tetapi : '+WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Old Password'))

				KeywordUtil.markWarning('Validation Warning text old Password show, but text is change , take a look')
			}
		}else{
			KeywordUtil.markWarning('Validation Warning text - Minimum old Password Required is 6 Character - not shown')
		}
	}




	/**
	 *  list of validation
	 */
	def validationLimitOldPasswordReached(def paramPass) {
		def warningTextPasswordUnderChar = 'Limit Password Character has Reached'


		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Old Password'), paramPass)
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Old Password'), 2)==true) {
			if(warningTextPasswordUnderChar.equals(WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Old Password')))) {
				KeywordUtil.logInfo('Validation Warning Limit Old Password Character has Reached - success')
			}else{
				println 'harusnya : '+warningTextPasswordUnderChar
				println 'tetapi : '+WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Old Password'))

				KeywordUtil.markWarning('Validation Warning text old Password show, but text is change , take a look')
			}
		}else{
			KeywordUtil.markWarning('Validation Warning text - Limit Password Character has Reached - not shown')
		}
	}

	/**
	 *  list of validation
	 */
	def validationEmptyOldPassword() {
		def warningTextEmptyPassword = 'Old password is required'


		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Old Password'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Old Password'), Keys.chord(Keys.BACK_SPACE))

		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Old Password'), 2)==true) {

			if(warningTextEmptyPassword.equals(WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Old Password')))) {
				KeywordUtil.logInfo('Validation Warning text Old password is required - success')
			}else{
				KeywordUtil.markWarning('Validation Warning text old Password show, but text is change , take a look')
				println 'harusnya : '+warningTextEmptyPassword
				println 'tetapi : '+WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Old Password'))
			}
		}else{
			KeywordUtil.markWarning('Validation Warning text - Old password is required - not shown')
		}
	}


	/**
	 *  list of validation
	 */
	def validationNewPasswordUnderChar(def paramPass) {
		def warningTextPasswordUnderChar = 'Minimum Password Required is 6 Character'


		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_New Password'), paramPass)
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_New password'), 2)==true) {
			if(warningTextPasswordUnderChar.equals(WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_New password')))) {
				KeywordUtil.logInfo('Validation Warning text Minimum New Password Required is 6 Character - success')
			}else{
				println 'harusnya : '+warningTextPasswordUnderChar
				println 'tetapi : '+WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_New password'))

				KeywordUtil.markWarning('Validation Warning text New Password show, but text is change , take a look')
			}
		}else{
			KeywordUtil.markWarning('Validation Warning text - Minimum New Password Required is 6 Character - not shown')
		}
	}


	/**
	 *  list of validation
	 */
	def validationLimitNewPasswordReached(def paramPass) {
		def warningTextPasswordUnderChar = 'Limit Password Character has Reached'


		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_New Password'), paramPass)
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_New password'), 2)==true) {
			if(warningTextPasswordUnderChar.equals(WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_New password')))) {
				KeywordUtil.logInfo('Validation Warning Limit New Password Character has Reached - success')
			}else{
				println 'harusnya : '+warningTextPasswordUnderChar
				println 'tetapi : '+WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_New password'))

				KeywordUtil.markWarning('Validation Warning text New Password show, but text is change , take a look')
			}
		}else{
			KeywordUtil.markWarning('Validation Warning text - Limit New Password Character has Reached - not shown')
		}
	}

	/**
	 *  list of validation
	 */
	def validationEmptyNewPassword() {
		def warningTextEmptyPassword = 'New password is required'


		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_New Password'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_New Password'), Keys.chord(Keys.BACK_SPACE))

		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_New password'), 2)==true) {

			if(warningTextEmptyPassword.equals(WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_New password')))) {
				KeywordUtil.logInfo('Validation Warning text New password is required - success')
			}else{
				KeywordUtil.markWarning('Validation Warning text New Password show, but text is change , take a look')
				println 'harusnya : '+warningTextEmptyPassword
				println 'tetapi : '+WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_New password'))
			}
		}else{
			KeywordUtil.markWarning('Validation Warning text - New password is required - not shown')
		}
	}


	/**
	 *  list of validation
	 */
	def validationConfirmPasswordUnderChar(def paramPass) {
		def warningTextPasswordUnderChar = 'Minimum Password Required is 6 Character'


		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Confirm New Password'), paramPass)
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password'), 2)==true) {
			if(warningTextPasswordUnderChar.equals(WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password')))) {
				KeywordUtil.logInfo('Validation Warning text Minimum Confirm Password Required is 6 Character - success')
			}else{
				println 'harusnya : '+warningTextPasswordUnderChar
				println 'tetapi : '+WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password'))

				KeywordUtil.markWarning('Validation Warning text Confirm Password show, but text is change , take a look')
			}
		}else{
			KeywordUtil.markWarning('Validation Warning text - Minimum Confirm Password Required is 6 Character - not shown')
		}
	}


	/**
	 *  list of validation
	 */
	def validationLimitConfirmPasswordReached(def paramPass) {
		def warningTextPasswordUnderChar = 'Limit Password Character has Reached'


		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Confirm New Password'), paramPass)
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password'), 2)==true) {
			if(warningTextPasswordUnderChar.equals(WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password')))) {
				KeywordUtil.logInfo('Validation Warning Limit Confirm Password Character has Reached - success')
			}else{
				println 'harusnya : '+warningTextPasswordUnderChar
				println 'tetapi : '+WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password'))

				KeywordUtil.markWarning('Validation Warning text Confirm Password show, but text is change , take a look')
			}
		}else{
			KeywordUtil.markWarning('Validation Warning text - Limit Confirm Password Character has Reached - not shown')
		}
	}

	/**
	 *  list of validation
	 */
	def validationEmptyConfirmPassword() {
		def warningTextEmptyPassword = 'Confirm new password is required'


		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Confirm New Password'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Confirm New Password'), Keys.chord(Keys.BACK_SPACE))

		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password'), 2)==true) {

			if(warningTextEmptyPassword.equals(WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password')))) {
				KeywordUtil.logInfo('Validation Warning text Confirm password is required - success')
			}else{
				KeywordUtil.markWarning('Validation Warning text Confirm Password show, but text is change , take a look')
				println 'harusnya : '+warningTextEmptyPassword
				println 'tetapi : '+WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_New password'))
			}
		}else{
			KeywordUtil.markWarning('Validation Warning text - Confirm password is required - not shown')
		}
	}

	/**
	 *  list of validation
	 */
	def validationConfirmPasswordNotMatch(paramPassNew, paramPassConfirm) {
		def warningTextEmptyPassword = 'The password and confirmation password don’t match'


		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_New Password'), paramPassNew)
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Confirm New Password'), paramPassConfirm)


		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password'), 2)==true) {

			if(warningTextEmptyPassword.equals(WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password')))) {
				KeywordUtil.logInfo('Validation Warning text The password and confirmation password don’t match - success')
			}else{
				KeywordUtil.markWarning('Validation Warning text Confirm Password show, but text is change , take a look')
				println 'harusnya : '+warningTextEmptyPassword
				println 'tetapi : '+WebUI.getText(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/warning_Confirm Password'))
			}
		}else{
			KeywordUtil.markWarning('Validation Warning text - Confirm password is required - not shown')
		}

		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Confirm New Password'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Confirm New Password'), Keys.chord(Keys.BACK_SPACE))

		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_New Password'), Keys.chord(Keys.CONTROL, 'a'))
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_New Password'), Keys.chord(Keys.BACK_SPACE))
	}


	/**
	 *  List of Set input
	 */
	@Keyword
	def doInputPassword(def oldPass, def newPass,def confirmPass) {
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Old Password'), oldPass)
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_New Password'), newPass)
		WebUI.sendKeys(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/input_Confirm New Password'), confirmPass)
	}
	
	/**
	 *  Click button update profile
	 */
	@Keyword
	def clickButtonUpdatePassword() {
		WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/btn_updatePassword'))
	}
	
	/**
	 *  Close dialog success change password
	 */
	@Keyword
	def closeDialogUpdatePassword() {

		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/popup_Password reset successful'), 2)==true) {
			WebUI.click(findTestObject('Object Repository/Web RoomMe.id/RoomMe.id My Profile Page/newProfile/NewPage_ChangePassword/button_closeDialogSuccess'))
			KeywordUtil.logInfo('Success Update password')
		}else{
			KeywordUtil.markError('Failed update password, dialog success not found / changed')
		}
	}
}
