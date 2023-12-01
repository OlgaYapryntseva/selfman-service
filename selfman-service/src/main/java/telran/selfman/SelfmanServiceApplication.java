package telran.selfman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
(exclude = {DataSourceAutoConfiguration.class })
//(exclude = { SecurityAutoConfiguration.class })
public class SelfmanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelfmanServiceApplication.class, args);
	}

}
