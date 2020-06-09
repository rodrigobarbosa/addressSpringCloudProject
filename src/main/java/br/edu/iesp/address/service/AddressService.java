package br.edu.iesp.address.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iesp.address.entity.Address;
import br.edu.iesp.address.proxy.AddressProxy;

@Service
public class AddressService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AddressService.class);
	private static int counter = 0;
	
	@Autowired
	private AddressProxy addressProxy;
	
	public static synchronized void requestCounter() {
		++counter;
	}
	
	public Address getAddress(String code) {
		requestCounter();
		LOGGER.info("{} GET request received", counter);
		return addressProxy.getAddressByCode(code);
	}
}
