package programmer.zaman.now.generic;

import programmer.zaman.now.generic.utils.ArrayHelper;

public class MethodGenericApp {

	public static void main(String[] args) {
		
		String[] names = {"Andres", "Nodas"};
		Integer[] values = {1,2,3,4,5};
		
		System.out.println(ArrayHelper.<String>count(names));
		System.out.println(ArrayHelper.count(values));
		
	}
	
}
