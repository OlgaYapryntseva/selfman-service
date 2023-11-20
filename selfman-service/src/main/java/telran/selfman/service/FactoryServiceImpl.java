package telran.selfman.service;

import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import telran.selfman.factory.dao.FactoryRepository;
import telran.selfman.factory.dto.FactoryDto;
import telran.selfman.factory.dto.exceptions.FactoryNotFoundException;
import telran.selfman.factory.model.Factory;



@Service
@RequiredArgsConstructor
public class FactoryServiceImpl implements FactoryService{
    
	
	final ModelMapper modelMapper;
	final FactoryRepository factoryRepository;
	
	
	@Override
	public Boolean creatFactory(FactoryDto factoryDto) {
		if (factoryRepository.existsById(factoryDto.getFactoryId())) {
			return false;
		}
		Factory factory = modelMapper.map(factoryDto, Factory.class);
		factoryRepository.save(factory);
		return true;
	}

	@Override
	public Iterable<FactoryDto> findByFactoryCountry(String country) {
		return factoryRepository.findCompanyByAddressCountry(country).stream()
				.map(v -> modelMapper.map(v, FactoryDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public Iterable<FactoryDto> findByFactoryCity(String city) {
		return factoryRepository.findCompanyByAddressCity(city).stream()
				.map(v -> modelMapper.map(v, FactoryDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public FactoryDto deleteCompany(String companyId) {
		Factory factory = factoryRepository.findById(companyId).orElseThrow(FactoryNotFoundException::new);
		factoryRepository.delete(factory);
		return modelMapper.map(factory, FactoryDto.class);
	}

}
