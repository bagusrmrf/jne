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
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium as KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable as Callable
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jne.terralogiq.net/jne-frontend/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/Login-CMS-UI/forgotpass-test/Page_JNE APPS admin panel/a_Forgot Password'))

WebUI.setText(findTestObject('Object Repository/Imported from Selenium IDE Scripts/Login-CMS-UI/forgotpass-test/Page_JNE APPS admin panel/input_EMAIL_username'), 
    'fahlevi@terralogiq.com')

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/Login-CMS-UI/forgotpass-test/Page_JNE APPS admin panel/button_Reset Password'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/Login-CMS-UI/forgotpass-test/Page_JNE APPS admin panel/a_Kembali'))

WebUI.closeBrowser()

