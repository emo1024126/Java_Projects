package com.example.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="send",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class KafkaMessageSendController {

	@Autowired
	private KafkaMessageSendService kafkaMessageSendService;

	@RequestMapping(value="/sendMessage",method=RequestMethod.POST)
	public String send(@RequestParam(required=true) String message){
		try {
			kafkaMessageSendService.send(message);
		} catch (Exception e) {
			return "send failed.";
		}
		return message;
	}
}