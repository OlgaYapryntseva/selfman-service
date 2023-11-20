package telran.selfman.factory.dto;

import java.time.LocalDate;
import java.util.Set;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FactoryDto {
	@Id
	String factoryId;
	
	InfoFactoryDto infoFactory;
	
	AddressDto address;
	
	ContactDto contact;
	
	TagsDto tags;
	
	RatingDto rating;
	
	Set<String> roles;
	
	LocalDate postingDate = LocalDate.now();
}
