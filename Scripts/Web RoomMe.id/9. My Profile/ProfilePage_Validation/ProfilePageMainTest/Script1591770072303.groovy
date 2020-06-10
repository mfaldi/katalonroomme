import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.web.roomme.generalfunction.GeneralFunction.openBrowser'(GlobalVariable.linkDevelopment)

def fullName = 'WESLY AUTOMATED TESTING'

def phoneNumber = '08345678901'

def address = 'jalan baru LAGI'

CustomKeywords.'com.web.roomme.generalfunction.GeneralFunction.doLogin'('wesly.testing2@gmail.com', '1234567')

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordProfilePageValidation.directToEditProfile'()

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordProfilePageValidation.doListValidation'()

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordProfilePageValidation.doInputProfile'(fullName, phoneNumber, 
    address)

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordProfilePageValidation.clickButtonUpdateProfile'()

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordProfilePageValidation.closeDialogUpdateProfile'()

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordProfilePageValidation.doValidationAfterUpdate'(fullName, 
    phoneNumber, address)


WebUI.closeBrowser()