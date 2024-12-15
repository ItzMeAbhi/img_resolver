package com.test.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.test.dto.UserDetailsDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MsgProducerService {

//	private final KafkaTemplate<String, Object> kafkaTemplate;
//	
//	@Value("${app.topic.name.fruits}")
//	private String fruitTopic;
//	
//	@Value("${app.topic.name.user-details}")
//	private String userDetailTopic;
//	
//	@Value("${app.topic.name.topic-partition-1}")
//	private String onePartitionTopic;
//	
//	@Value("${app.topic.name.topic-partition-3}")
//	private String threePartitionTopic;
//
//
//	public MsgProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
//		this.kafkaTemplate = kafkaTemplate;
//	}
//
//	
//	public boolean pushMsg(String msg) {
//
//		kafkaTemplate.send(fruitTopic, msg).whenComplete((resp, ex) -> {
//
//			if (ex == null) {
//				log.info("msg produced successfully msg: {}", msg);
//			} else {
//				log.error("failed to send msg due to Exception : {}", ex);
//
//			}
//		});
//		return true;
//	}
//
//	
//	public boolean pushUserDetails(UserDetailsDto data) {
//		String jsonData = new Gson().toJson(data);
//		kafkaTemplate.send(userDetailTopic, jsonData).whenComplete((resp, ex) -> {
//
//			if (ex == null) {
//				log.info("msg produced successfully msg: {}", jsonData);
//			} else {
//				log.error("failed to send msg due to Exception : {}", ex);
//
//			}
//		});
//		return true;
//	}
//
//
//	public void pushInSinglePartition(String msg) {
//		kafkaTemplate.send(onePartitionTopic, msg).whenComplete((resp, ex) -> {
//
//			if (ex == null) {
//				log.info("msg produced successfully msg: {}", msg);
//			} else {
//				log.error("failed to send msg due to Exception : {}", ex);
//
//			}
//		});
//	}
//
//
//	public void pushInMultiplePartition(String msg) {
//		kafkaTemplate.send(threePartitionTopic, msg).whenComplete((resp, ex) -> {
//			if (ex == null) {
//				log.info("msg produced successfully msg: {}", msg);
//			} else {
//				log.error("failed to send msg due to Exception : {}", ex);
//
//			}
//		});
//	}
//
//
//	public void porduceBottmLineTest(String data) {
//		kafkaTemplate.send("UK_CASA_BTLINE", data).whenComplete((resp, ex) -> {
//			if (ex == null) {
//				log.info("msg produced successfully msg: {}", data);
//			} else {
//				log.error("failed to send msg due to Exception : {}", ex);
//
//			}
//		});
//		
//	}
}
