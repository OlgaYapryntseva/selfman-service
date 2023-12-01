package telran.selfman.provider.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Contact {
	String webSite;
	List<String> telefon;
	List<String> email;
	String facebook;
	String twitter;
	String linkedin;

	public void addTelefon(String number) {
		telefon.add(number);
	}

	public void addEmail(String mail) {
		email.add(mail);
	}

	public void removeTelefon(String number) {
		telefon.remove(number);
	}

	public void removeEmail(String mail) {
		email.remove(mail);
	}

}
