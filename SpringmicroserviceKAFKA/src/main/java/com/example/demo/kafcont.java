package com.example.demo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kafcont 
{

	private String topic="demodata";
	
	private KafkaTemplate<String,Object> temp; //topicformat,messageformat
		
	@GetMapping("/publish/{msg}")
	public String publish(@PathVariable String msg)
	{
		 temp.send(topic,msg);
		return "Data published";
	}
	@GetMapping("/json")
	public String publishjson()
	{
		User u=new User();
		temp.send(topic,u);
		return "json";
	}
}
