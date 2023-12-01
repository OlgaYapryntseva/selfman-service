package telran.selfman.provider.dto;


import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
//@EqualsAndHashCode(of = "nameCompany")
public class InfoProviderDto {
	String logo;
	String nameProvider;
	Set<String> typeProvider;
	Integer founded;
	Set<String> language;
	String info;
}
