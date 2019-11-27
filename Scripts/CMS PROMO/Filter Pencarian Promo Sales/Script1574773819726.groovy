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

WebUI.setText(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/input_USERNAMEEMAIL_username'), 
    'marketing1')

WebUI.setEncryptedText(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/input_PASSWORD_password'), 
    'W9yTj0WHyJ2K2Kk20V8Rjg==')

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/button_Login'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/a_List Promo Sales'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/a_Pencarian'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/select_SemuaPusatBodetabekcilDKI JAKARTAJaw_0a5a40'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/img_Cari_mr-2'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/button_Reset'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/select_Semua Disetujui Menunggu Ditolak'), 
    'Ditolak', true)

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/button_Cari'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/button_Reset'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/button_Cari'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/button_Cari'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS PROMO/Filter Promo Sales/Page_JNE APPS admin panel/button_Reset'))

WebUI.closeBrowser()

