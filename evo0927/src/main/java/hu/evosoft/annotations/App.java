package hu.evosoft.annotations;

import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<Service> serviceClazz = Service.class;

		Method[] methods = serviceClazz.getDeclaredMethods();

		for (Method m : methods) {

			System.out.println("Method name: " + m.getName());

			Secured secured = m.getAnnotation(Secured.class);

			if (secured != null) {

				System.out.println("Secured annotation found> " + secured.roles());
			}
		}
	}

}
