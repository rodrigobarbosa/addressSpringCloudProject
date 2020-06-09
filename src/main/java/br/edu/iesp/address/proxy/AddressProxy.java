package br.edu.iesp.address.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.iesp.address.entity.Address;
import br.edu.iesp.address.fallback.AddressProxyFallback;

@FeignClient(name= "viacep", url= "http://viacep.com.br/ws", fallback= AddressProxyFallback.class)
public interface AddressProxy {

	@GetMapping("{code}/json")
	Address getAddressByCode(String code);
}
