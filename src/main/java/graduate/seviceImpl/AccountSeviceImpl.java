package graduate.seviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import graduate.dao.AccountDao;
import graduate.domain.Account;
import graduate.sevice.AccountSevice;
@Service
public class AccountSeviceImpl implements AccountSevice {
	@Autowired
	AccountDao dao;

	public Account save(Account entity) {
		return dao.save(entity);
	}

	public List<Account> saveAll(List<Account> entities) {
		return  (List<Account>)dao.saveAll(entities);
	}

	public Optional<Account> findById(String id) {
		return dao.findById(id);
	}

	public boolean existsById(String id) {
		return dao.existsById(id);
	}

	public List<Account> findAll() {
		return (List<Account>) dao.findAll();
	}

	public List<Account> findAllById(List<String> ids) {
		return (List<Account>) dao.findAllById(ids);
	}

	public long count() {
		return dao.count();
	}

	public void deleteById(String id) {
		dao.deleteById(id);
	}

	public void delete(Account entity) {
		dao.delete(entity);
	}

	public void deleteAllById(Iterable<? extends String> ids) {
		dao.deleteAllById(ids);
	}

	public void deleteAll(Iterable<? extends Account> entities) {
		dao.deleteAll(entities);
	}

	public void deleteAll() {
		dao.deleteAll();
	}

	
	

}
