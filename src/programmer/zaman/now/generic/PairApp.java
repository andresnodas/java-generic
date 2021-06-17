package programmer.zaman.now.generic;

import programmer.zaman.now.generic.data.Pair;

public class PairApp {

	public static void main(String[] args) {
		
		Pair<String, Integer> pair = new Pair<String, Integer>("Andres", 100);
		
		System.out.println(pair.getFirst());
		
		System.out.println(pair.getSecond());
		
	}
	
}
