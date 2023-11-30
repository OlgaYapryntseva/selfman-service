package telran.selfman.customer.controller;

import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.selfman.customer.dto.CustomerDto;
import telran.selfman.customer.dto.CustomerRegisterDto;
import telran.selfman.customer.dto.CustomerRemoveDto;
import telran.selfman.customer.dto.RolesCustomerDto;
import telran.selfman.customer.dto.CustomerExtendedDto;
import telran.selfman.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
	final CustomerService customerService;

	@PostMapping("/register")
	public CustomerDto registerCustomer(@RequestBody CustomerRegisterDto customerRegisterDto) {
		return customerService.registerCustomer(customerRegisterDto);
	}

	@PostMapping("/login")
	public boolean login(Principal principal) {
		return !principal.getName().isEmpty();
	}
	
	@DeleteMapping("/user/{email}")
	public CustomerRemoveDto removeCustomer(@PathVariable String email) {
		return customerService.removeCustomer(email);
	}

	@PutMapping("/user/{email}")
	public CustomerExtendedDto updateCustomer(@PathVariable String email, @RequestBody CustomerExtendedDto customerExtendedDto) {
		return customerService.updateCustomer(email, customerExtendedDto);
	}

	@PutMapping("/user/{email}/role/{role}")
	public RolesCustomerDto addRoleCustomer(@PathVariable String email, @PathVariable String role) {
		return customerService.changeRolesListCustomer(email, role, true);
	}
	
	@DeleteMapping("/user/{email}/role/{role}")
	public RolesCustomerDto deleteRoleCustomer(@PathVariable String email, @PathVariable String role) {
		return customerService.changeRolesListCustomer(email, role, false);
	}
	
	@PutMapping("/password")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void changePasswordCustomer(Principal principal, @RequestHeader("X-Password") String newPassword) {
		customerService.changePasswordCustomer(principal.getName(), newPassword);
	}
	
	@GetMapping("/user/{email}")
	public CustomerExtendedDto getCustomer(@PathVariable String email) {
		return customerService.getCustomer(email);
	}

}
