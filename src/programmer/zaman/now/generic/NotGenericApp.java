package programmer.zaman.now.generic;

import programmer.zaman.now.generic.data.Data;

public class NotGenericApp {

	public static void main(String[] args) {
		
		Data data = new Data("");
		data.setData("Andres");
		String value = (String) data.getData();
		
	}
	
}
