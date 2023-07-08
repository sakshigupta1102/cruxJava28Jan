package session42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class groupanagrams {
	 public List<List<String>> groupAnagrams(String[] arr) {
	        HashMap<String,List<String>> map = new HashMap();
	        for(int i=0;i<arr.length;i++){
	            String str = arr[i];
	            String code = generateCode(str);
	            if(map.containsKey(code)){
	                List<String> currlist = map.get(code);
	                currlist.add(str);
	                map.put(code,currlist);
	            }
	            else{
	                List<String> currlist = new ArrayList();
	                currlist.add(str);
	                map.put(code, currlist);
	            }
	        }
	        List<List<String>> ans = new ArrayList();
	        for(String code : map.keySet()){
	            ans.add(map.get(code));
	        }
	        return ans;
	}
	public String generateCode(String str){
	    int[] arr = new int[26];
	    for(int i=0;i<str.length();i++)
	    {
	        char ch = str.charAt(i);
	        arr[ch-'a']++;
	    }
	    StringBuilder sb = new StringBuilder("");
	    for(int i=0;i<26;i++){
	        sb.append(arr[i]+",");
	    }
	    return sb.toString();
	}
}
