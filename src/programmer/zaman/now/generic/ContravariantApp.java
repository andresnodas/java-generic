package programmer.zaman.now.generic;

import programmer.zaman.now.generic.data.MyData;

public class ContravariantApp {

	public static void main(String[] args) {
		
		MyData<Object> objectMyData = new MyData<Object>("Eko");
		objectMyData.setData(1000);
		
		MyData<? super String> myData = objectMyData;
		process(objectMyData);
	}
	
	public static void process(MyData<? super String> myData) {
		String data = (String) myData.getData(); //Berbahaya
		System.out.println(data);
		
		myData.setData("Andres");
	}
	
}
