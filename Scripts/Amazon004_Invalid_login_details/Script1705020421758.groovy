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

WebUI.navigateToUrl('https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcss%2Fhomepage.html%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0')

WebUI.setText(findTestObject('Object Repository/Amazon_Login/Page_Amazon Sign-In/Page_Amazon Sign-In/Page_Amazon Sign-In/input_email'), 
    '8297290427')

WebUI.click(findTestObject('Object Repository/Amazon_Login/Page_Amazon Sign-In/Page_Amazon Sign-In/Page_Amazon Sign-In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_Login/Page_Amazon Sign-In/Page_Amazon Sign-In/Page_Amazon Sign-In/input_password'), 
    '33+6PrbCkxg=')

WebUI.click(findTestObject('Object Repository/Amazon_Login/Page_Amazon Sign-In/Page_Amazon Sign-In/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon_Login/Page_Amazon Sign-In/Page_Amazon Sign-In/Page_Amazon Sign-In/h4_There was a problem'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/Amazon_Login/Page_Amazon Sign-In/Page_Amazon Sign-In/Page_Amazon Sign-In/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/Amazon_Login/Page_Amazon Sign-In/Page_Amazon Sign-In/Page_Amazon Sign-In/div_There was a problem                    _cf3a1b'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Amazon_Login/Page_Amazon Sign-In/Page_Amazon Sign-In/Page_Amazon Sign-In/inputcontinue'), 
    0)

WebUI.closeBrowser()

