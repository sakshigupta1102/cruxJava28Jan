package session42;
public class Client {
public static void main(String[] args) {
	Trie trie = new Trie();
	trie.insert("RAM");
	trie.insert("RAJ");
	trie.insert("RAJESH");
	System.out.println(trie.startsWith("RA"));
	System.out.println(trie.contains("RAM"));
	System.out.println(trie.contains("RA"));
	System.out.println(trie.startsWith("RAM"));
}
}
