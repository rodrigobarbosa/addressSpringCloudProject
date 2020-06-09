package br.edu.iesp.address.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iesp.address.entity.Address;
import br.edu.iesp.address.service.AddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = {"address"})
@RestController
@RequestMapping("query")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@ApiOperation(value = "Show viacep address by code", response = Iterable.class)
    @GetMapping(path = "{code}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Address getDefaultAddress(@PathVariable(value = "code") String code){
		return addressService.getAddress(code);
    }
}
