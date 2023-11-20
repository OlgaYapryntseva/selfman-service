package telran.selfman.service;

import telran.selfman.factory.dto.FactoryDto;

public interface FactoryService {
    Boolean creatFactory(FactoryDto factoryCreateDto);
    
    Iterable<FactoryDto> findByFactoryCountry(String country);
    
    Iterable<FactoryDto> findByFactoryCity(String city);

	FactoryDto deleteCompany(String factoryId);
}
