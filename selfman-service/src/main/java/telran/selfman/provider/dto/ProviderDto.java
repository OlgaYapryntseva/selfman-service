package telran.selfman.provider.dto;

import java.time.LocalDate;
import java.util.Set;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProviderDto {
	@Id
	String providerId;
	
	@Setter
	String login;
	
	@Setter
	String password;
	
	InfoProviderDto infoProvider;
	
	AddressDto address;
	
	ContactDto contact;
	
	TagsDto tags;
	
	RatingDto rating;
	
	Set<String> roles;
	
	LocalDate postingDate = LocalDate.now();
}
