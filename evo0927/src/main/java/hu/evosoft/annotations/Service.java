package hu.evosoft.annotations;

public class Service {

	
	
	@Secured(roles = Roles.ADMIN)
	public void secureTransaction() {
		System.out.println("Secure transaction...");
	}
}
