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

//try {
//	Mobile.startExistingApplication('id.co.bri.brispotnew')
//}catch(Exception e) {
//	Mobile.startExistingApplication('id.co.bri.brispotnew')
//}

Mobile.tap(findTestObject('text', [('text') : 'Pemasaran']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_tambah_data_cpp']), 0)

Mobile.tap(findTestObject('text', [('text') : 'SME']), 0)

Mobile.tap(findTestObject('text', [('text') : 'PRIBADI']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_cam']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tvItem1']), 0)

Mobile.tap(findTestObject('id', [('id') : 'android:id/button1']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Shutter']), 0)

Mobile.tap(findTestObject('id', [('id') : 'com.sec.android.app.camera:id/okay']), 0)

Mobile.scrollToText('UBAH LOKASI', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/change_loc']), 0)

Mobile.tap(findTestObject('text', [('text') : 'OK']), 0)

Mobile.tap(findTestObject('text', [('text') : 'OK']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/buttonSet']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/nik_cpp']), '1000200030004001', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/nama_cpp']), 'PPND Katalon', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/radio_pria']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/radio_single']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tmp_lahir']), 'Jakarta', 0)

Mobile.scrollToText('Bidang Usaha', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tgl_lahir']), '1980-08-16', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/hp']), '081234567890', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/email']), 'dummy@gmail.com', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/bidang_usaha']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/desc2_text']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/alamat']), 'jalan dummy', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/rt']), '1', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/rw']), '1', 0)

Mobile.scrollToText('Kelurahan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/kode_pos']), 0)

Mobile.tap(findTestObject('text', [('text') : '15550006']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/ratas_penjualan']), '100000000', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/txtLabaPerbulan']), '80000000', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/txtPotensiTopUp']), '30000000', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/txtProdukBRI']), 'BRITAMA', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tambah_bri']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/nama_bank']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Bank Mandiri']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/norek']), '9192939495969798', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/mutasi_debit']), '100000000', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/mutasi_kredit']), '10000000', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_simpan']), 0)

Mobile.scrollToText('Bank Mandiri', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btnTambahRekening']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/txtNomorRekening']), '020601000001500', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btnCekRekening']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btnSimpanRekening']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/chipBrimo']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/chipKartuKredit']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_simpan_data']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/amount']), '2000000000', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/periode']), '60', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/ket']), 'Modal usaha', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_ok']), 0)


Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/etSearch']), 'PPND Katalon', 0)

Mobile.tap(findTestObject('text', [('text') : '1000200030004001']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/fab_expand_menu_button']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Lanjut']), 0)

for (int i=0; i<5; i++) {
	Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)
}

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_lanjut_prakarsa']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_ok']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/progress_finish']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_back']), 0)



























