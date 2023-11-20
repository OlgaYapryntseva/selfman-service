package telran.selfman.factory.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
//@EqualsAndHashCode(of = "nameCompany")
public class InfoFactoryDto {
	String logo;
	String nameFactory;
	Integer founded;
	String info;
}
