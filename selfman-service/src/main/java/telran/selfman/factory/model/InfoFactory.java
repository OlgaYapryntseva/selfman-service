package telran.selfman.factory.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@EqualsAndHashCode(of = "nameCompany")
public class InfoFactory {
	String logo;
	String nameFactory;
	Integer founded;
	String info;
}
