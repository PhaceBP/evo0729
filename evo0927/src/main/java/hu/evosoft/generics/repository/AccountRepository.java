package hu.evosoft.generics.repository;


public interface AccountRepository extends CrudRepository<Long,Account> {
	
	Account findByAccountName(String accountName);
}
