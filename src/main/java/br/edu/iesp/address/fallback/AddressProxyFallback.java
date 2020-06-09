package br.edu.iesp.address.fallback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.iesp.address.entity.Address;
import br.edu.iesp.address.property.AddressProperty;
import br.edu.iesp.address.proxy.AddressProxy;

@Component
public class AddressProxyFallback implements AddressProxy {

	@Autowired
	private AddressProperty addressProperty;

	@Override
	public Address getAddressByCode(String code) {
		return new Address(addressProperty.getMessageNotFound());
	}
}
