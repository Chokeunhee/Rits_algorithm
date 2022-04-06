import java.util.HashMap;

public class MapTest {
	HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

	public static void main(String[] args) {
		MapTest mt = new MapTest();
		//mt.ex15();
		//mt.ex16();
		//mt.ex17();
	}
	
	public void ex15() {
		hashmap = getData();
		TableMap tm = new TableMap(hashmap);
		tm.showMap();
	}
	
	public void ex16() {
		hashmap = getData();
		TableMap tm = new TableMap(hashmap);
		System.out.println("the size is "  + tm.len());
		tm.showMap();
		tm.set("A", 7);
		tm.showMap();
		tm.set("K", 5);
		tm.showMap();
	}
	
	public void ex17() {
		hashmap = getData();
		TableMap tm = new TableMap(hashmap);
		tm.showMap();
		System.out.println("the value associated with key U is " + tm.get("U"));
		tm.showMap();
		System.out.println("the value poped with key U is " + tm.pop("U"));
		tm.showMap();
	}
	
	public HashMap<String, Integer> getData(){
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		hashmap.put("K", 2);
		hashmap.put("B", 4);
		hashmap.put("U", 3);
		hashmap.put("V", 8);
		return hashmap;
	}
}
