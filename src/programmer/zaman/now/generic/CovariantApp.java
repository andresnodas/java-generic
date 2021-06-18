package programmer.zaman.now.generic;

import programmer.zaman.now.generic.data.MyData;

public class CovariantApp {

	public static void main(String[] args) {
		
		MyData<String> stringMyData = new MyData<String>("Andres");
		process(stringMyData);
	}
	
	public static void process(MyData<? extends Object> myData) {
		System.out.println(myData.getData());
		
//		myData.setData(1); //Error
	}
	
}
