package telran.selfman.provider.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@EqualsAndHashCode(of = "country")
public class Address {
     String country;
     String state;
     String city;
     String street;
}
