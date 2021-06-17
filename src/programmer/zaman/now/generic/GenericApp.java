package programmer.zaman.now.generic;

import programmer.zaman.now.generic.data.MyData;

public class GenericApp {

	public static void main(String[] args) {
		
		MyData<String> dataString = new MyData<String>("Andres");
		MyData<Integer> dataInteger = new MyData<Integer>(100);
		
		String isiDataString = dataString.getData();
		Integer isiDataInteger = dataInteger.getData();
		
		System.out.println(isiDataString);
		System.out.println(isiDataInteger);
		
	}
	
}
