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
}
catch (Exception e) {
    Mobile.startExistingApplication('id.co.bri.brispotnew')
} 

Mobile.tap(findTestObject('text', [('text') : 'Prakarsa']), 0)

//Mobile.tap(findTestObject('text', [('text') : 'OKE']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/etSearch']), 'PPND Katalon', 0)

Mobile.tap(findTestObject('text', [('text') : '1000200030004001']), 0)

//Mobile.tap(findTestObject('text', [('text') : 'Menu Toolbar'']), 0)
//
//Mobile.tap(findTestObject('text', [('text') : 'Info Prakarsa']), 0)
//
//Mobile.tap(findTestObject('text', [('text') : 'Menu Prakarsa']), 0)
//
//Mobile.tap(findTestObject('text', [('text') : 'Aktivitas Kunjungan']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Detail Data Pribadi']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/nama_alias']), 'PPND Ktln', 0)

Mobile.scrollToText('Jenis Pekerjaan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/pekerjaan_ktp']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Komputer']), 0)

Mobile.scrollToText('Bidang Usaha', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/agama']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Islam']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/pekerjaan_cif']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Komputer-Analis/Progrmr/intrnt/MIS/Engi']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/status_gelar']), 0)

Mobile.tap(findTestObject('text', [('text') : 'S-1']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tanggungan']), '0', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/nama_ibu']), 'ISMIYATI', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/fixed_line']), '0213456789', 0)

Mobile.scrollToText('Debitur 4', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.scrollToText('Alamat sesuai KTP', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/lama_menetap']), '5', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/cbdom_sesuai']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/nama_usaha']), 'KOST DUMMY', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/tgl_mulai_usaha']), '2021-08-18', 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/jabatan']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Pemilik, Direktur Utama/Presiden Dir.']), 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/npwp']), '123456789012345', 0)

Mobile.setText(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/jml_tenaga']), '5', 0)

Mobile.scrollToText('Alamat sesuai KTP', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/cbdom_sesuai']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/segmentasi_kredit']), 0)

Mobile.tap(findTestObject('text', [('text') : 'OK']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Ritel Komersial/Kecil']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/radio_button_tidak_postfin']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/pisah_ya']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Pilih Status Kepemilikan']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Milik Sendiri']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Pilih Penghasilan per bulan']), 0)

Mobile.tap(findTestObject('text', [('text') : '> 50 Juta s.d. 100 Juta']), 0)

Mobile.scrollToText('Keterangan Buka Rekening', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/nama_bank']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Bank Mandiri']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Pilih Tujuan Buka Rekening']), 0)

Mobile.tap(findTestObject('text', [('text') : 'Transaksi']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_next']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/btn_kirim']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/action_Yes']), 0)

Mobile.tap(findTestObject('id', [('id') : 'id.co.bri.brispotnew:id/progress_finish']), 0)

