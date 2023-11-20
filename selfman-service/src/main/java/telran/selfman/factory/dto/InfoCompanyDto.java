package telran.selfman.factory.dto;

import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter

@NoArgsConstructor
public class InfoCompanyDto {
	Set<String> industry;
	Set<String> product;
	Set<String> keyWords;
}
