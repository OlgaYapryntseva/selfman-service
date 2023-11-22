package telran.selfman.accounting.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import telran.selfman.accounting.model.UserAccount;

public interface UserAccountRepository extends MongoRepository<UserAccount, String>{

}
