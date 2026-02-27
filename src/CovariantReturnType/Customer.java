package CovariantReturnType;

public class Customer extends Client {

	@Override
	public Employee getResource() {
		
		return new Manager();
		
	}
	
}
