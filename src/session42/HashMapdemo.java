package session42;
import java.util.HashMap;
import java.util.Map;
public class HashMapdemo {
public static void main(String[] args) {
	HashMap<String , Integer> map = new HashMap();
	map.put("apple", 10);
	map.put("banana", 20);
	map.put("mango", 10);
	//int val =map.get("mango");
	//System.out.println(val);
   HashMap<Character, Integer> map2 = new  HashMap();
	String str = "abcdabbcd";
	for(int i=0;i<str.length();i++){
		char ch = str.charAt(i);
//		if(map2.containsKey(ch)){
//			int val = map2.get(ch);
//			map2.put(ch, val+1);
//		}
//		else{
//			map2.put(ch, 1);
//		}
		map2.put(ch, map2.getOrDefault(ch,0)+1);
	}
	System.out.println(map2);
	for(char ch : map2.keySet()){
		System.out.println(ch);
		System.out.println(map.get(ch));
	}
	for(int val :map2.values()){
		System.out.println(val);
	}
	for(Map.Entry<Character, Integer> entry:map2.entrySet()){
		System.out.println(entry.getKey() + " "+ entry.getValue());
	}
	
}
}


