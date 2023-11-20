package telran.selfman.factory.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@EqualsAndHashCode(of = "nameCompany")
public class Company {
	String logo;
	String nameCompany;
	Integer founded;
	String info;
}
