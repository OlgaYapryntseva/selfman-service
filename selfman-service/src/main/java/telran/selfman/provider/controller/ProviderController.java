package telran.selfman.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import telran.selfman.provider.dto.ProviderDto;
import telran.selfman.provider.service.ProviderService;


@RestController
@RequiredArgsConstructor
public class ProviderController {
	

	final ProviderService providerService;

	    @PostMapping("/provider")
		public Boolean creatProvider(@RequestBody ProviderDto providerDto) {
	    	return providerService.creatProvider(providerDto);
		}
/*
		@GetMapping("/provider/country/{country}")
		public Iterable<ProviderDto> findByProviderCountry(@PathVariable String country) {
			return providerService.findByProviderCountry(country);
		}

		@GetMapping("/provider/city/{city}")
		public Iterable<ProviderDto> findByProviderCity(@PathVariable String city) {
			return providerService.findByProviderCity(city);
		}
		
		@DeleteMapping("/provider/{login}")
		public ProviderDto deleteProvider(@PathVariable String login) {
			return providerService.deleteProvider(login);
		}
*/
}
