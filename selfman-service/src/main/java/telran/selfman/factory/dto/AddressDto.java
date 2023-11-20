package telran.selfman.factory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
//@EqualsAndHashCode(of = "country")
public class AddressDto {
     String country;
     String state;
     String city;
     String street;
}
