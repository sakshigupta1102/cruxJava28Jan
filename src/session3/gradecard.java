package session3;
import java.util.*;
public class gradecard {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int marks = scan.nextInt();
		if(marks <= 100 && marks >= 90)   System.out.println("A+");
		else if(marks < 90 && marks >= 80) System.out.println("A");
		else if(marks < 80 && marks >= 70) System.out.println("B+");
		else if(marks < 70 && marks >= 60) System.out.println("B");
		else if(marks < 60 && marks >= 50) System.out.println("C+");
		else if(marks < 50 && marks >= 40) System.out.println("C");
		else if(marks < 40 && marks >= 0)  System.out.println("fail");
		else System.out.println("wrong input");
	}

}
