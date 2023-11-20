package telran.selfman.factory.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class FactoryNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -3318544202226116122L;

   
}
