import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.Keys
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

'----------------------------------------------------'
'This test case script is generated by Katalon Studio'
'Generated date: 06-Sep-2019 05:18:43 PM'
'File path: /home/fahlevi/Bagus Project/Automated-Testing-Katalon/Project/JNE/JNE-CMS/Login-CMS.html'
'Generated by: fahlevi@terralogiq.com'
'----------------------------------------------------'

String baseUrl = "http://jne.terralogiq.net/jne-frontend/login"

WebUI.openBrowser(baseUrl)

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"open | http://jne.terralogiq.net/jne-frontend/login | "
selenium.open("http://jne.terralogiq.net/jne-frontend/login")

"click | name=username | "
selenium.click("name=username")

"type | name=username | admin"
selenium.type("name=username", "admin")

"type | name=password | Admin1234"
selenium.type("name=password", "Admin1234")

"click | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Forgot Password'])[1]/following::button[1] | "
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Forgot Password'])[1]/following::button[1]")

WebUI.closeBrowser()