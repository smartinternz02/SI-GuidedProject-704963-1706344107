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

WebUI.click(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com. Spend less. Smile more/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon Sign-In/input_email'), 
    'mangalisai433@gmail.com')

WebUI.click(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon Sign-In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon Sign-In/input_password'), 
    '5PYKeXS5yY3DUATn3smwSw==')

WebUI.verifyElementPresent(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon Sign-In/inputsignInSubmit'), 
    0)

WebUI.click(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com. Spend less. Smile more/a_us'), 
    '.us')

WebUI.verifyElementPresent(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com. Spend less. Smile more/span_EN'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com. Spend less. Smile more/span_Hello, lakshman'), 
    'Hello, lakshman')

WebUI.verifyElementPresent(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com. Spend less. Smile more/span_nav-cart-icon nav-sprite'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com. Spend less. Smile more/div_All              Select the department _9f1b78'), 
    0)

WebUI.setText(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'iphone 15 pro')

WebUI.click(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.verifyElementText(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com  iphone 15 pro/span_iphone 15 pro'), 
    '"iphone 15 pro"')

WebUI.verifyElementText(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com  iphone 15 pro/button_Add to Cart'), 
    'Add to Cart')

WebUI.click(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com  iphone 15 pro/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com  iphone 15 pro/span_nav-cart-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com Shopping Cart/span_Apple iPhone15Pro Silicone Case with M_a0aec2'))

WebUI.switchToWindowTitle('Amazon.com: Apple iPhone 15 Pro Silicone Case with MagSafe ')

WebUI.click(findTestObject('Object Repository/button verification/Buttons Validation/Page_Amazon.com Apple iPhone15Pro Silicone _e7324c/input_submit.buy-now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/button verification/Buttons Validation/Page_Select a delivery address/h1_Checkout                 (1 item)       _9603be'), 
    0)

WebUI.click(findTestObject('Object Repository/button verification/Buttons Validation/Page_Select a delivery address/h3_2        Payment method'))

WebUI.verifyElementPresent(findTestObject('Object Repository/button verification/Buttons Validation/Page_Select a delivery address/h3_2        Payment method'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/button verification/Buttons Validation/Page_Select a delivery address/h3_3        Items and shipping'), 
    '3\n Items and shipping')

WebUI.closeBrowser()

