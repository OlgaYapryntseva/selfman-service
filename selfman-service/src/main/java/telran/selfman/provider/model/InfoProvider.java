package telran.selfman.provider.model;

import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@EqualsAndHashCode(of = "nameCompany")
public class InfoProvider {
	String logo;
	String nameProvider;
	Set<String> typeProvider;
	Integer founded;
	Set<String> language;
	String info;
	
}
