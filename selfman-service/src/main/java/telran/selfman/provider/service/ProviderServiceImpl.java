package telran.selfman.provider.service;

import org.modelmapper.ModelMapper;
import lombok.RequiredArgsConstructor;
import telran.selfman.provider.dao.ProviderRepository;
import telran.selfman.provider.dto.ProviderDto;
import telran.selfman.provider.dto.exceptions.ProviderNotFoundException;
import telran.selfman.provider.model.Provider;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public abstract class ProviderServiceImpl implements ProviderService{
    

	final ModelMapper modelMapper;
	final ProviderRepository providerRepository;
	
	
	@Override
	public Boolean creatProvider(ProviderDto providerDto) {
		if (providerRepository.existsById(providerDto.getProviderId())) {
			return false;
		}
		Provider provider = modelMapper.map(providerDto, Provider.class);
		providerRepository.save(provider);
		return true;
	}

	@Override
	public Iterable<ProviderDto> findByProviderCountry(String country) {
//		return providerRepository.findProviderByAddressCountry(country).stream()
//				.map(v -> modelMapper.map(v, ProviderDto.class))
//				.collect(Collectors.toList());
		return null;
	}

	@Override
	public Iterable<ProviderDto> findByProviderCity(String city) {
//		return providerRepository.findProviderByAddressCity(city).stream()
//				.map(v -> modelMapper.map(v, ProviderDto.class))
//				.collect(Collectors.toList());
		return null;
	}

	@Override
	public ProviderDto deleteProvider(String providerId) {
		Provider provider = providerRepository.findById(providerId).orElseThrow(ProviderNotFoundException::new);
		providerRepository.delete(provider);
		return modelMapper.map(provider, ProviderDto.class);
	}

}
