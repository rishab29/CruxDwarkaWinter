package Lecture21;

public class TriesClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries trie = new Tries();

		trie.add("art");
		trie.add("arts");
		trie.add("bug");
		trie.add("boy");
		trie.add("sea");
		trie.add("see");
		trie.add("seen");

		trie.display();
		
		System.out.println(trie.search("arts"));
		System.out.println(trie.search("art"));
		
		trie.remove("art");
		System.out.println("****************");
		System.out.println(trie.search("arts"));
		System.out.println(trie.search("art"));
		
		trie.remove("arts");
		System.out.println("****************");
		System.out.println(trie.search("arts"));
		System.out.println(trie.search("art"));
			
	}

}
