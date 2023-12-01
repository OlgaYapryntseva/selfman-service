package telran.selfman.configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProviderConfiguration {

    @Bean
    public ModelMapper getModelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration()
		             .setFieldMatchingEnabled(false)
		             .setFieldAccessLevel(AccessLevel.PRIVATE)
		             .setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}
}
