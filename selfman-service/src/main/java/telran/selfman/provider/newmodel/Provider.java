package telran.selfman.provider.newmodel;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter
@AllArgsConstructor
public class Provider {
	
	@Id
	String providerId;
	
	@Setter
	String email;
	
	@Setter
	String password;
//	
//	@Setter
//	InfoProvider infoProvider;
//	@Setter
//	Address address;
//	@Setter
//	Contact contact;
//	@Setter
//	Tags tags;
//	@Setter
//	Rating rating;
	Set<String> roles;
	@Setter
	LocalDate postingDate = LocalDate.now();
	
	public Provider() {
		roles = new HashSet<String>();
		roles.add("Provider");
	}
	
	
	
}