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

try {
	Mobile.startExistingApplication('id.co.bri.brispotnew')
}catch(Exception e) {
	Mobile.startExistingApplication('id.co.bri.brispotnew')
}

WebUI.callTestCase(findTestCase('Test Cases/Create User Tester'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tv_username']), '00251612', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tv_password']), 'P@ssw0rd', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_login']), 0)

for ( int i=1; i<=6; i++) {
	Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/edt' + i]), '8', 0)
}

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/cBox']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_yes']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Pemasaran']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_tambah_data_cpp']), 0)

Mobile.tap(findTestObject('text', [('text') : 'SME']), 0)

Mobile.tap(findTestObject('text', [('text') : 'PRIBADI']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_cam']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tvItem1']), 0)

Mobile.tap(findTestObject('id', [('id') : 'android:id/button1']), 0)

//Mobile.tap(findTestObject('id', [('id') : 'android:id/button1']), 5,failureHandling.OPTIONAL)

Mobile.tap(findTestObject('text', [('text') : 'Shutter']), 0)

Mobile.tap(findTestObject('id', [('id') : 'com.sec.android.app.camera:id/okay']), 0)

Mobile.scrollToText('UBAH LOKASI')

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/change_loc']), 0)

Mobile.tap(findTestObject('text', [('text') : 'OK']), 0)

Mobile.tap(findTestObject('text', [('text') : 'OK']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/buttonSet']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/nik_cpp']), '1234123412341234', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/nama_cpp']), 'Automation PPND', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/radio_pria']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/radio_single']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tmp_lahir']), 'Jakarta', 0)

Mobile.scrollToText('Bidang Usaha')

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tgl_lahir']), '1980-08-16', 0)
//
//Mobile.setText(findTestObject('id', [('id') : 'android:id/button1']), 0)
//
//Mobile.setText(findTestObject('id', [('id') : 'android:id/button1']), 0)
//
//Mobile.tap(findTestObject('id', [('id') : 'android:id/button1']), 0)
//
//Mobile.tap(findTestObject('id', [('id') : 'android:id/button1']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/hp']), '081234567890', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/email']), 'dummy@gmail.com', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/bidang_usaha']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/desc2_text']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/alamat']), 'jalan dummy', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/rt']), '1', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/rw']), '1', 0)

Mobile.scrollToText('Kelurahan')

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/kode_pos']), 0)

Mobile.tap(findTestObject('text', [('text') : '15550006']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)















