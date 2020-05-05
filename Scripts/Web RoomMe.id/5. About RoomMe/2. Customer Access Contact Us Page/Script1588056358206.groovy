import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/1. Customer Access RoomMe Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Web RoomMe.id/RoomMe.id Footer/Button Contact Us'))

WebUI.click(findTestObject('Web RoomMe.id/RoomMe.id Footer/Button Contact Us'))

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/2. Verify Header RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web RoomMe.id/5. About RoomMe/Verify Contact Us Page'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Web RoomMe.id/1. Homepage/7. Verify Footer RoomMe.id'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id Contact Us Page/Text Get In Touch with Us'), 'Get In Touch with Us')

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id Contact Us Page/Text Head Office'), 'Head Office')

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id Contact Us Page/Text Get In Touch Content'), 'If you have any questions, please get in touch with our friendly and knowledgable customer support team by filling out the form below.')

WebUI.verifyElementText(findTestObject('Web RoomMe.id/RoomMe.id Contact Us Page/Text RoomMe Location Content'), 'Jl. Tiang Bendera IV no 34 I-J, RT.7/RW.3, Roa Malaka, Kec. Tambora, Indonesia, DKI Jakarta 11230')

