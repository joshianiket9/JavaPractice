package CovariantReturnType;

import java.lang.reflect.InvocationTargetException;

public class Client {

	public Employee getResource() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Developer dev = (Developer) Class.forName("CovariantReturnType.Developer").getDeclaredConstructor().newInstance();
		
		return new Employee();
	}
	
}
