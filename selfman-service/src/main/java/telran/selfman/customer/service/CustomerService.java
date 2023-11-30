package telran.selfman.customer.service;

import telran.selfman.customer.dto.CustomerDto;
import telran.selfman.customer.dto.CustomerRegisterDto;
import telran.selfman.customer.dto.CustomerRemoveDto;
import telran.selfman.customer.dto.RolesCustomerDto;
import telran.selfman.customer.dto.CustomerExtendedDto;

public interface CustomerService {
	CustomerDto registerCustomer(CustomerRegisterDto customerRegisterDto);
	
	CustomerExtendedDto getCustomer(String email);

	CustomerRemoveDto removeCustomer(String email);

	CustomerExtendedDto updateCustomer(String email, CustomerExtendedDto customerExtendedDto);
	
	RolesCustomerDto changeRolesListCustomer(String email, String role, boolean isAddRole);

	void changePasswordCustomer(String email, String newPassword);

}
