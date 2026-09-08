##Step to Run Kafka (Producer) and Katalon (Consumer)
1. brew services start kafka
2. kafka-topics --create --topic tes-topik --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
3. kafka-console-producer --topic tes-topik --bootstrap-server localhost:9092
4. Klik tombol Run pada Test Case Katalon
5. Kirim Pesan dari Terminal (Trigger) = Hello Kafka!
6. Pindah kembali ke jendela Katalon Studio dan amati panel Log Viewer : Test Case selesai dengan status PASSED

##StepTestCase
1. [ Terminal ] Producer Siap -> 
2. [ Katalon ] Run Test (Consumer Listening) -> 
3. [ Terminal ] Kirim Pesan -> 
4. [ Katalon ] Pass/Fail Log