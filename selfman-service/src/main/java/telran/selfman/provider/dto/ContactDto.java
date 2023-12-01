package telran.selfman.provider.dto;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class ContactDto {
    String webSite;
    List<String> telefon;
    List<String> email;
    String facebook;
    String twitter;
    String linkedin;
}
