package Lecture18;

public class HashTableClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashTable<String, Integer> map = new HashTable<>(4);

		map.put("India", 300);
		map.put("USA", 200);
		map.put("UK", 175);
		map.display();
		map.put("Nepal", 50);
//		map.put("Aus", 150);
//		map.put("SL", 120);
//		map.display();
	//	map.put("Pak", 135);
		map.display();

//		map.display();
//		map.put("India", 350);
//		map.put("China", 400);
//		map.display();
//
//		System.out.println(map.get("India"));
//		map.remove("China");
//		map.display();
//		System.out.println(map.get("China"));
	}

}
