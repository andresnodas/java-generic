package programmer.zaman.now.generic;

import java.util.Arrays;

import programmer.zaman.now.generic.data.Person;

public class ComparableApp {

	public static void main(String[] args) {
		
		Person[] people = {
			new Person("Andres", "Bandung"),
			new Person("Nodas", "Subang"),
			new Person("Joko", "Jakarta")
		};
		
		Arrays.sort(people);
		
		System.out.println(Arrays.toString(people));
		//[Person [name=Andres, address=Bandung], Person [name=Joko, address=Jakarta], Person [name=Nodas, address=Subang]]

		
	}
	
}
