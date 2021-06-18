package programmer.zaman.now.generic;

import programmer.zaman.now.generic.data.MyData;

public class TypeErasureApp {

	public static void main(String[] args) {
		
		MyData myData = new MyData("Eko");
		
		MyData<Integer> integerMyData = myData;
		integerMyData.setData(1000);
		
		Integer integer = integerMyData.getData();
		
	}
	
}
