package programmer.zaman.now.generic;

import programmer.zaman.now.generic.data.MyData;

public class WildcardApp {

	public static void main(String[] args) {
		
		printLength(new MyData<>(100));
		printLength(new MyData<>("Andres"));
		printLength(new MyData<>(true));
		
	}
	
	public static void printLength(MyData<?> data) {
		System.out.println(data.getData());
	}
	
}
