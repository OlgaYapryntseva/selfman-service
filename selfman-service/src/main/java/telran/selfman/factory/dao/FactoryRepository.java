package telran.selfman.factory.dao;


import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import telran.selfman.factory.dto.FactoryDto;
import telran.selfman.factory.model.Factory;


public interface FactoryRepository extends MongoRepository<Factory, String>{
	
	List<FactoryDto> findCompanyByAddressCountry(String country);

	List<FactoryDto> findCompanyByAddressCity(String city);
	
	

}
