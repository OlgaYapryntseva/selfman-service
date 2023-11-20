package telran.selfman.factory.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@AllArgsConstructor
public class Factory {
	@Id
	String companyId;
	@Setter
	Company company;
	@Setter
	Address address;
	@Setter
	Contact contact;
	@Setter
	InfoCompany info;
	@Setter
	Rating rating;
	Set<String> roles;
	@Setter
	LocalDate postingDate = LocalDate.now();
	
	public Factory() {
		roles = new HashSet<>();
	}
	
	public Factory(String companyId, Company company, Address address, Contact contact, InfoCompany info) {
		this();
		this.company = company;
		this.address = address;
		this.contact = contact;
		this.info = info;

	}

	public boolean addRole(String role) {
		return roles.add(role);
	}

	public boolean removeRole(String role) {
		return roles.remove(role);
	}
}