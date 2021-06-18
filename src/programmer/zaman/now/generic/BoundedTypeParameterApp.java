package programmer.zaman.now.generic;

import programmer.zaman.now.generic.data.NumberData;

public class BoundedTypeParameterApp {

	public static void main(String[] args) {
		
		NumberData<Integer> integerNumberData = new NumberData<Integer>(100);
		
//		NumberData<String> stringNumberData = new NumberData<String>("Eko"); //Error
		
	}
	
}
