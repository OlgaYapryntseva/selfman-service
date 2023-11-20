package telran.selfman.factory.model;

import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class InfoCompany {
	Set<String> industry;
	Set<String> product;
	Set<String> keyWords;

	public void addIndustry(String ind) {
		industry.add(ind);
	}

	public void addProduct(String pro) {
		product.add(pro);
	}

	public void addKeyWords(String key) {
		keyWords.add(key);
	}
	
	public void removeIndustry(String ind) {
		industry.remove(ind);
	}

	public void removeProduct(String pro) {
		product.remove(pro);
	}

	public void removeKeyWords(String key) {
		keyWords.remove(key);
	}
}
