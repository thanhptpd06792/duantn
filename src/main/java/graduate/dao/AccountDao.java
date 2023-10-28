package graduate.dao;

import org.springframework.data.repository.CrudRepository;

import graduate.domain.Account;

public interface AccountDao extends CrudRepository<Account, String> {

}
