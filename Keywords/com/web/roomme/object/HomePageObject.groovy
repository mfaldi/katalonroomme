package com.web.roomme.object

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

import internal.GlobalVariable

public class HomePageObject {

	/**
	 *  Xpath Signin Button
	 */
	@Keyword
	def getXpathButtonSignInNavBar() {
		return '//*[@id="dropdown-auth__BV_toggle_"]'
	}

	/**
	 *  Xpath input email
	 */
	@Keyword
	def getXpathInputEmail() {
		return '//*[@id="dropdown-form-email-signin"]'
	}

	/**
	 *  Xpath input password
	 */
	@Keyword
	def getXpathInputPassword() {
		return '//*[@id="dropdown-form-password-signin"]'
	}

	/**
	 *  Xpath input password
	 */
	@Keyword
	def getXpathBtnSignIn() {
		return '//*[@id="btSignIn"]'
	}

	/**
	 *  Xpath profile di nav bar
	 */
	@Keyword
	def getXpathProfileNavBar() {
		return '//a[@id="dropdown-profile"]/span'
	}
}
