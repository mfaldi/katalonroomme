import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.web.roomme.generalfunction.GeneralFunction as GeneralFunction
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.web.roomme.generalfunction.GeneralFunction.openBrowser'(GlobalVariable.linkDevelopment)

def oldPass = '123456'

def newPass = '1234567'

def confirmPass = '1234567'


CustomKeywords.'com.web.roomme.generalfunction.GeneralFunction.doLogin'('wesly.testing2@gmail.com', '123456')

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordChangePasswordValidation.directToChangePassword'()

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordChangePasswordValidation.doListValidation'()

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordChangePasswordValidation.doInputPassword'(oldPass, newPass, confirmPass)

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordChangePasswordValidation.clickButtonUpdatePassword'()

CustomKeywords.'com.web.roomme.profilepagevalidation.KeywordChangePasswordValidation.closeDialogUpdatePassword'()


//WebUI.closeBrowser()