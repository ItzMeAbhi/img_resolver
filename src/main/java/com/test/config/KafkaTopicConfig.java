package com.test.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {
	
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
//    @Bean
//    public NewTopic createfruitTopicc() {
//		
//		return new NewTopic(fruitTopic,3,(short)1);
//	} 
//    @Bean
//    public NewTopic createUserDetailsTopic() {
//    	
//    	return new NewTopic(userDetailTopic,3,(short)1);
//    }
//
//    @Bean
//    public NewTopic createOnePartitionTopic() {
//		
//		return new NewTopic(onePartitionTopic,1,(short)1);
//	}
//    @Bean
//    public NewTopic createThreePartitionTopic() {
//		
//		return new NewTopic(threePartitionTopic,3,(short)1);
//	}
}
