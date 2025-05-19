package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.deser.std.StringDeserializer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
@Configuration
public class Consumer 
{
	
	
		//what format key value must be sent
		public ConsumerFactory<String,Object> consumer()
		{
			Map<String,Object> config=new HashMap<String,Object>();
			config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
			config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
			config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
			config.put(ConsumerConfig.GROUP_ID_CONFIG,"grp1");
			return new DefaultKafkaConsumerFactory<>(config);
		}
		
		public ConcurrentKafkaListenerContainerFactory<String,String> listen(){
			ConcurrentKafkaListenerContainerFactory<String,String> factory=new ConcurrentKafkaListenerContainerFactory<>();
			factory.setConsumerFactory(consumer());
			return factory;
			
		}
		
		
		
}


