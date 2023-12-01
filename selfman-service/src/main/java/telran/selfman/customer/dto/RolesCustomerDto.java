package telran.selfman.customer.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RolesCustomerDto {
	String email;
	@Singular
	Set<String> roles;
	
	
	
	public void addRole(String role) {
		roles.add(role);
	}
	
	public void removeRole(String role) {
		roles.remove(role);
	}

}
