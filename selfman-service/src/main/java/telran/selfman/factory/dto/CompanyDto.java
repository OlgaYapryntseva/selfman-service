package telran.selfman.factory.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
//@EqualsAndHashCode(of = "nameCompany")
public class CompanyDto {
	String logo;
	String nameCompany;
	Integer founded;
	String info;
}
