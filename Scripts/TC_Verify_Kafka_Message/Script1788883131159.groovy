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

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil

// 1. Definisikan parameter koneksi Kafka
String bootstrapServer = "localhost:9092"
String topicName = "tes-topik"
String groupId = "katalon-test-group"

// 2. panggil Custom Keyword untuk membaca pesan dari Kafka
String receivedMessage = CustomKeywords.'kafka.KafkaConsumerHelper.consumeLatestMessage'(bootstrapServer, topicName, groupId)

// 3. Log pesan yang berhasil ditangkap
KeywordUtil.logInfo("Pesan yang diterima dari Kafka: " + receivedMessage)

// 4. Lakukan Validasi (Assertion)
assert receivedMessage.contains("Hello Kafka!") : "Pesan dari tidak Kafka sesuai!"
