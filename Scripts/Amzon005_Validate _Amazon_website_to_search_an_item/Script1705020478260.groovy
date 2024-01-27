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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/input_a-button-input'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 'apple ma')

WebUI.click(findTestObject('Object Repository/Page_Amazon.com. Spend less. Smile more/span_cbook air'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Amazon.com  apple macbook air/span_apple macbook air'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Amazon.com  apple macbook air/span_Apple 2023 MacBook Air Laptop with M2 _b3df5a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Amazon.com Apple 2023 MacBook Air Lapt_3c613d/span_Apple 2023 MacBook Air Laptop with M2 _b3df5a'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Apple 2023 MacBook Air Lapt_3c613d/a_Visit the Apple Store'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Apple/a_Overlay__overlay__LloCU EditorialTile__ov_b1d8ad'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Amazon.com Apple Mac laptops/a_Overlay__overlay__LloCU EditorialTile__ov_b1d8ad'), 
    0)

WebUI.closeBrowser()

