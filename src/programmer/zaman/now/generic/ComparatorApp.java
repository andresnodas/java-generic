package programmer.zaman.now.generic;

import java.util.Arrays;
import java.util.Comparator;

import programmer.zaman.now.generic.data.Person;

public class ComparatorApp {

	public static void main(String[] args) {
		
		Person[] people = {
				new Person("Andres", "Medan"),
				new Person("Nodas", "Subang"),
				new Person("Joko", "Jakarta")
			};
		
		Comparator<Person> comparator = new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAddress().compareTo(o2.getAddress());
			};
			
		};
		
		Arrays.sort(people, comparator);
		
		System.out.println(Arrays.toString(people));
		//[Person [name=Joko, address=Jakarta], Person [name=Andres, address=Medan], Person [name=Nodas, address=Subang]]

	}
	
}
