package telran.selfman.provider.dto;

import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class TagsDto {
	Set<String> industry;
	Set<String> product;
	Set<String> keyWords;
}
