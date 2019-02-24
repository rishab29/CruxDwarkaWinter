package Lecture18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 300);
		map.put("USA", 200);
		map.put("UK", 175);
		map.put("Nepal", 50);

		System.out.println(map);
		map.put("India", 350);
		map.put("China", 400);
		System.out.println(map);

//		System.out.println(map.get("India"));
//		System.out.println(map.get("RSA"));

//		System.out.println(map.remove("China"));
//		System.out.println(map.remove("RSA"));

		Set<Map.Entry<String, Integer>> entries = map.entrySet();

		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
		System.out.println("*********************");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		System.out.println("*********************");
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}

		System.out.println(map.containsKey("India"));

		String str = "aaabbccdaabbdcca";
		System.out.println(getMaxFreq(str));

	}

	public static Character getMaxFreq(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (map.containsKey(cc)) {
				int ov = map.get(cc);
				int nv = ov + 1;
				map.put(cc, nv);
			} else {
				map.put(cc, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		char maxchar = '\0';
		int maxfreq = Integer.MIN_VALUE;

		for (Map.Entry<Character, Integer> entry : entries) {
			if (entry.getValue() > maxfreq) {
				maxchar = entry.getKey();
				maxfreq = entry.getValue();
			}
		}
		return maxchar;
	}

}
