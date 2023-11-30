package telran.selfman.customer.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import telran.selfman.customer.model.Customer;


public interface CustomerRepository extends MongoRepository<Customer, String>{
	
	 Optional<Customer> findByEmail(String email);

}
