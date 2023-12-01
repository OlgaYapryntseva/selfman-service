package telran.selfman.provider.service;

import telran.selfman.provider.dto.ProviderDto;

public interface ProviderService {
    Boolean creatProvider(ProviderDto providerCreateDto);
    
    Iterable<ProviderDto> findByProviderCountry(String country);
    
    Iterable<ProviderDto> findByProviderCity(String city);

	ProviderDto deleteProvider(String providerId);
}
