package telran.selfman.provider.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@AllArgsConstructor
public class Provider {
	
	@Id
	String providerId;
	
	@Setter
	String login;
	
	@Setter
	String password;
	
	@Setter
	InfoProvider infoProvider;
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
	
	public Provider() {
		roles = new HashSet<String>();
		roles.add("Provider");
	}
	
	
	public Provider(String login, String password,InfoProvider infoProvider, Address address, Contact contact, Tags tags) {
		this();
		this.login = login;
		this.password = password;
		this.infoProvider = infoProvider;
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