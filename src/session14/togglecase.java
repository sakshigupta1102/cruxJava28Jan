package session14;

public class togglecase {

	public static void main(String[] args) {
		System.out.println(togglecase("CoDinG"));
	}
	public static String togglecase(String str){
		StringBuilder sb= new StringBuilder(str);
		for(int i=0;i<sb.length();i++){
			char ch = sb.charAt(i);
			if(Character.isUpperCase(ch)){
				sb.setCharAt(i, Character.toLowerCase(ch));
			}else{
				sb.setCharAt(i, Character.toUpperCase(ch));
			}
		}
		return sb.toString();
	}
	

}
