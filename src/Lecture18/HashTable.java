package Lecture18;

public class HashTable<K, V> {
	private class HTPair {
		K key;
		V value;

		HTPair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public boolean equals(Object other) {
			HTPair op = (HTPair) other;
			return this.key.equals(op.key);
		}

		public String toString() {
			return this.key + ":" + this.value;
		}
	}

	LinkedList<HTPair>[] bucketArray;
	int size;
	public static final int DEFAULT_CAPACITY = 10;

	public HashTable() {
		// TODO Auto-generated constructor stub
		this(DEFAULT_CAPACITY);
	}

	public HashTable(int capacity) {
		this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[capacity];
		this.size = 0;
	}

	public void put(K key, V value) throws Exception {
		int bi = this.hashFunction(key);// best index
		HTPair pta = new HTPair(key, value);
		LinkedList<HTPair> bucket = this.bucketArray[bi];
		if (bucket == null) {
			bucket = new LinkedList<>();
			bucket.addLast(pta);
			this.size++;
			this.bucketArray[bi] = bucket;
		} else {
			int findAt = bucket.find(pta);
			if (findAt == -1) {
				bucket.addLast(pta);
				this.size++;
			} else {
				HTPair pair = bucket.getAt(findAt);
				pair.value = value;
			}
		}
		
		double loadfactor=(this.size*1.0)/this.bucketArray.length;
		if(loadfactor>0.75) {
			this.rehash();
		}
	}

	private int hashFunction(K key) {
		int hc = key.hashCode();
		hc = Math.abs(hc);
		int bi = hc % this.bucketArray.length;
		return bi;
	}

	public void display() {
		for (LinkedList<HTPair> bucket : this.bucketArray) {
			if (bucket != null && !bucket.isEmpty()) {
				bucket.display();
			} else {
				System.out.println("NULL");
			}
			System.out.println("***********************");
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public V get(K key) throws Exception {
		int bi = this.hashFunction(key);// best index
		HTPair ptf = new HTPair(key, null);
		LinkedList<HTPair> bucket = this.bucketArray[bi];
		if (bucket == null) {
			return null;
		} else {
			int findAt = bucket.find(ptf);
			if (findAt == -1) {
				return null;
			} else {
				HTPair pair = bucket.getAt(findAt);
				return pair.value;
			}
		}
	}
	
	public V remove(K key) throws Exception {
		int bi = this.hashFunction(key);// best index
		HTPair ptf = new HTPair(key, null);
		LinkedList<HTPair> bucket = this.bucketArray[bi];
		if (bucket == null) {
			return null;
		} else {
			int findAt = bucket.find(ptf);
			if (findAt == -1) {
				return null;
			} else {
				HTPair pair = bucket.getAt(findAt);
				bucket.removeAt(findAt);
				this.size--;
				return pair.value;
			}
		}
	}
	
	private void rehash() throws Exception{
		LinkedList<HTPair>[] oba=this.bucketArray;
		this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[2*oba.length];;
		this.size = 0;
		
		for(LinkedList<HTPair> ob:oba) {
			while(ob!=null&&!ob.isEmpty()) {
				HTPair pair=ob.removeFirst();
				this.put(pair.key, pair.value);
			}
		}
		
		
	}
}
