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

WebUI.setText(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/input_USERNAMEEMAIL_username'), 
    'salesretail1')

WebUI.setEncryptedText(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/input_PASSWORD_password'), 
    'W9yTj0WHyJ2K2Kk20V8Rjg==')

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/button_Login'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/a_Komentar dari Pusat'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/strong_Kirim ke semua sales counter'))

WebUI.setText(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/textarea_Informasi_comment'), 
    'Kirim Semua Sales Counter sebagai Jenis Himbauan')

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/a_KIRIM KOMENTAR'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/button_OK'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/select_-- Pilih Regional -- BodetabekcilDKI_251f07'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/select_-- Pilih Cabang --JAKARTA'), 
    '58', true)

WebUI.setText(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/textarea_Informasi_comment'), 
    'Kirim Komentar Sampai Cabang Jenis Komentar Informasi')

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/input_INFORMASI_typeComment'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/a_KIRIM KOMENTAR'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/button_OK'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/select_-- Pilih Regional -- BodetabekcilDKI_251f07'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/select_-- Pilih Regional -- BodetabekcilDKI_251f07'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/select_-- Pilih Cabang --BANDA ACEHBANDAR L_03627d'), 
    '53', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/select_-- Pilih Sales Counter --POPOPOVAMES_295b3a'), 
    '19', true)

WebUI.setText(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/textarea_Informasi_comment'), 
    'Koemntar Sampai Sales Counter Jenis Komentar')

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/input_INFORMASI_typeComment'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/a_KIRIM KOMENTAR'))

WebUI.click(findTestObject('Object Repository/Imported from Selenium IDE Scripts/CMS Sales Counter/Kirim Komentar Pusat/Page_JNE APPS admin panel/button_OK'))

WebUI.closeBrowser()

