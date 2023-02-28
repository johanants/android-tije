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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\johan\\Downloads\\Tije_5.4.2_apkcombo.com.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lanjutkan'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lanjutkan'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Mulai'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Masukkan nomormu sekarang'), '82282269650', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lanjutkan (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Oke'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Masukkan password kamu sekarang'), 'Qwerty123', 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Lanjutkan (2)'), 0)

WebUI.delay(10)

Mobile.takeScreenshot('C:\\Users\\johan\\AppData\\Local\\Temp\\screenshot1904215524193560589.png')

