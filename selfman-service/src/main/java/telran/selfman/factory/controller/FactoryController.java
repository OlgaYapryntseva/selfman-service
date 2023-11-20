package telran.selfman.factory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import telran.selfman.factory.dto.FactoryDto;
import telran.selfman.service.FactoryService;


@RestController
@RequiredArgsConstructor
public class FactoryController {
	
	@Autowired
	final FactoryService factoryService;

	    @PostMapping("/factory")
		public Boolean creatFactory(@RequestBody FactoryDto factoryDto) {
	    	System.out.println(factoryDto.getCompany());
	    	return factoryService.creatFactory(factoryDto);
		}

		@GetMapping("/factory/{country}")
		public Iterable<FactoryDto> findByFactoryCountry(@PathVariable String country) {
			return factoryService.findByFactoryCountry(country);
		}

		@GetMapping("/factory/city/{city}")
		public Iterable<FactoryDto> findByFactoryCity(@PathVariable String city) {
			return factoryService.findByFactoryCity(city);
		}
		
		@DeleteMapping("/factory/{companyId}")
		public FactoryDto deleteCompany(@PathVariable String companyId) {
			return factoryService.deleteCompany(companyId);
		}
	
}
