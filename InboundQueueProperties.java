package com.excelacom.activation.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("inboundservice")
@Configuration
@Getter
@Setter
public class InboundQueueProperties {

	private String rabbitListenerContainer;

	private String newconnectqueueQueue;

	private String newconnectqueueExchange;

	private Resource keyStore;
	
	private String keyStorePassword;
	
	private String keyPairAlias;
	
	private int connectionTimeOut;
	
	private long receiveTimeOut;
	
	private String whlactivateServiceQueue;

	private String whlactivateServiceExchange;
	

}
