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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.delay(5)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Amazon_Footer Link _OR/Page_Amazon.com. Spend less. Smile more/span_Stream millionsof songs'))

WebUI.delay(3)

WebUI.back()

WebUI.click(findTestObject('Object Repository/Amazon_Footer Link _OR/Page_Amazon.com. Spend less. Smile more/span_Reach customerswherever theyspend their time'))

WebUI.delay(3)

WebUI.back()

WebUI.click(findTestObject('Object Repository/Amazon_Footer Link _OR/Page_Amazon.com. Spend less. Smile more/span_Ship OrdersInternationally'))

WebUI.delay(3)

WebUI.back()

WebUI.click(findTestObject('Object Repository/Amazon_Footer Link _OR/Page_Amazon.com. Spend less. Smile more/span_Experienced ProsHappiness Guarantee'))

WebUI.delay(3)

WebUI.back()

WebUI.click(findTestObject('Object Repository/Amazon_Footer Link _OR/Page_Amazon.com. Spend less. Smile more/span_Get Info EntertainmentProfessionals Need'))

WebUI.delay(3)

WebUI.back()

WebUI.click(findTestObject('Object Repository/Amazon_Footer Link _OR/Page_Amazon.com. Spend less. Smile more/span_Indie Digital  Print PublishingMade Easy'))

WebUI.delay(3)

WebUI.back()

WebUI.click(findTestObject('Object Repository/Amazon_Footer Link _OR/Page_Amazon.com. Spend less. Smile more/span_Scalable CloudComputing Services'))

WebUI.delay(3)

WebUI.back()

WebUI.click(findTestObject('Object Repository/Amazon_Footer Link _OR/Page_Amazon.com. Spend less. Smile more/a_Prime Video DirectVideo DistributionMade Easy'))

WebUI.delay(3)

WebUI.back()

WebUI.closeBrowser()