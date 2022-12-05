package com.excelacom.activation.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("nslservice")
@Configuration
@Getter
@Setter
public class InboundProperties {

	private String authserver;

	private String schedulerserviceurl;

	private String routerserviceurl;

	private String authchecktoken;

	private String credentials;

	private String splitterurl;

	private String ruleurl;

	private String IntrernalServerURL;
	
	private String validateOauthServiceUrl;

	private String server;

	private String applicationName;
	
	private String activateserviceurl;

    private String resourceBaseServiceURL;
	
	private String whlactivatesubscriberurl;
	
	private String validateJsonSchemaURL;
	
	private String resourceServiceURL;
}