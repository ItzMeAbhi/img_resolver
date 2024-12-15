package com.test.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.dto.UserDetailsDto;
import com.test.service.MsgProducerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("producer-api")
@Slf4j
public class MsgProducerController {
	
	private final MsgProducerService producerService;
	
	MsgProducerController(MsgProducerService producerService) {
		this.producerService=producerService;
	}
	
	@PostMapping("/produce")
	private ResponseEntity<Object> produceMsg(@RequestBody String msg){
		System.out.println(msg);
//		return new ResponseEntity("this is bad request",HttpStatusCode.valueOf(400));
		return ResponseEntity.ok("Msg Pushed To The kafka cluster successfully");
	}
	
//	@PostMapping("/produce")
//	private ResponseEntity<Object> produceMsg(@RequestBody String msg){
//		boolean pushMsg = producerService.pushMsg(msg);
//		return ResponseEntity.ok("Msg Pushed To The kafka cluster successfully");
//	}
//	
//	@PostMapping("/produce-user-details")
//	private ResponseEntity<Object> produceUserDetails(@RequestBody UserDetailsDto data){
//		 producerService.pushUserDetails(data);
//		return ResponseEntity.ok("Msg Pushed To The kafka cluster successfully");
//	}
//	
//	@PostMapping("/produce/partition1")
//	private ResponseEntity<Object> produceInSinglePartition(@RequestBody String data){
//		producerService.pushInSinglePartition(data);
//		return ResponseEntity.ok("Msg Pushed To The kafka cluster successfully");
//	}
//	@PostMapping("/produce/partition3")
//	private ResponseEntity<Object> produceInMultiplePartition(@RequestBody String data){
//		producerService.pushInMultiplePartition(data);
//		return ResponseEntity.ok("Msg Pushed To The kafka cluster successfully");
//	}
//	
//	@PostMapping("/produce/btline")
//	private ResponseEntity<Object> produceBottomline(@RequestBody String data){
//		producerService.porduceBottmLineTest(data);
//		return ResponseEntity.ok("Msg Pushed To The kafka cluster successfully");
//	}
//	
	
	

}
