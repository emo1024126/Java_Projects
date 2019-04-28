//package com.example.kafka;
//
//import org.junit.Test;
//import org.junit.Rule;
//import org.junit.runner.RunWith;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.rule.OutputCapture;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(properties = "spring.kafka.bootstrap-servers=${spring.embedded.kafka.brokers}")
//public class KafkaApplicationTests {
//
//	private static Logger logger = LoggerFactory.getLogger(KafkaApplicationTests.class);
//
//	@Rule
//	public OutputCapture outputCapture = new OutputCapture();
//
//	@Test
//	public void testVanillaExchange() throws Exception {
//		long end = System.currentTimeMillis() + 10000;
//		while (!this.outputCapture.toString().contains("A simple test message")
//				&& System.currentTimeMillis() < end) {
//			Thread.sleep(250);
//		}
//		assertThat(this.outputCapture.toString()).contains("A simple test message");
//	}
//
//}
