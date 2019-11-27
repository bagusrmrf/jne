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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jne.terralogiq.net/jne-frontend/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/save as/Page_JNE APPS admin panel/input_USERNAMEEMAIL_username'), 'bagusrmrf')

WebUI.setEncryptedText(findTestObject('Object Repository/save as/Page_JNE APPS admin panel/input_PASSWORD_password'), 'W9yTj0WHyJ2K2Kk20V8Rjg==')

WebUI.click(findTestObject('Object Repository/save as/Page_JNE APPS admin panel/button_Login'))

WebUI.click(findTestObject('Object Repository/Setting Radius/Page_JNE APPS admin panel/img_Mei 2019_m-auto'))

WebUI.click(findTestObject('Object Repository/save as/Page_JNE APPS admin panel/li_Competitor'))

WebUI.click(findTestObject('Object Repository/save as/Page_JNE APPS admin panel/li_Competitor'))

WebUI.click(findTestObject('Object Repository/save as/Page_JNE APPS admin panel/button_Save as Excel'))

WebUI.click(findTestObject('Object Repository/save as/Page_JNE APPS admin panel/button_Save as CSV'))

WebUI.setText(findTestObject('Object Repository/save as/Page_JNE APPS admin panel/input_Setting Radius_radius'), '5000')

WebUI.click(findTestObject('Object Repository/save as/Page_JNE APPS admin panel/button_meter_btn btn-danger btn-update roun_9ce5ee'))

WebUI.click(findTestObject('Object Repository/save as/Page_JNE APPS admin panel/button_OK'))

WebUI.closeBrowser()

