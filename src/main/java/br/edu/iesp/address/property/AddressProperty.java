package br.edu.iesp.address.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("address")
@RefreshScope
@Data
public class AddressProperty {

	public String messageNotFound;

	public String getMessageNotFound() {
		return messageNotFound;
	}

	public void setMessageNotFound(String messageNotFound) {
		this.messageNotFound = messageNotFound;
	}
	
}
