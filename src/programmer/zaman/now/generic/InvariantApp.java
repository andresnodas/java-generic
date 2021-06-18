package programmer.zaman.now.generic;

import programmer.zaman.now.generic.data.MyData;

public class InvariantApp {

	public static void main(String[] args) {
		
		MyData<String> dataString = new MyData<String>("Andres");
//		MyData<Object> dataObject = dataString; //Error
		
		MyData<Object> data = new MyData<Object>(100);
//		MyData<Integer> dataInteger = data; //Error
		
	}
	
}
