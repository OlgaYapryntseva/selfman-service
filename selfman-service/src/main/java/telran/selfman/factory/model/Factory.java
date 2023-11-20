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
	String factoryId;
	@Setter
	InfoFactory infoFactory;
	@Setter
	Address address;
	@Setter
	Contact contact;
	@Setter
	Tags tags;
	@Setter
	Rating rating;
	Set<String> roles;
	@Setter
	LocalDate postingDate = LocalDate.now();
	
	public Factory() {
		roles = new HashSet<>();
	}
	
	public Factory(String factoryId,InfoFactory infoFactory, Address address, Contact contact, Tags tags) {
		this();
		this.factoryId = factoryId;
		this.infoFactory = infoFactory;
		this.address = address;
		this.contact = contact;
		this.tags = tags;

	}

	public boolean addRole(String role) {
		return roles.add(role);
	}

	public boolean removeRole(String role) {
		return roles.remove(role);
	}
}