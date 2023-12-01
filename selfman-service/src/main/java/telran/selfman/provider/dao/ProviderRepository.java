package telran.selfman.provider.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import telran.selfman.provider.model.Provider;


public interface ProviderRepository extends MongoRepository<Provider, String>{
	
//	List<ProviderDto> findProviderByAddressCountry(String country);
//
//	List<ProviderDto> findProviderByAddressCity(String city);
	
	

}
