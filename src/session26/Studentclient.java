package session26;

public class Studentclient {
	public static void main(String[] args) throws Exception{
//		Student s1 = new Student();
//		s1.name = "lalit";
//		s1.age = 18;
//		s1.rollno = 99;
//		// System.out.println(s1.name);
//		s1.introduce();
//		// Student s2 = new Student("ramu", 10, 9);
//		// s2.introduce();
//
//		Student s2 = new Student();
//		Student s3 = new Student();
//		s2.name = "kunal";
//		s2.age = 28;
//		s3.name = "Hardik";
//		s3.age = 26;
//		System.out.println(s2.name + " " + s2.age);
//		System.out.println(s3.name + " " + s3.age);
//		System.out.println(".....................");
//		Test2(s2, s3);
//		System.out.println(s2.name + " " + s2.age);
//		System.out.println(s3.name + " " + s3.age);
		Student s1 = new Student();
		s1.setName("ramu");
		s1.setAge(-10);
		System.out.println(s1.getName());
		s1.introduce();
	}
	public static void Test2(Student s2, Student s3) {
		s2 = new Student();
		int tempa = s2.age;
		s2.age = s3.age;
		s3.age = tempa;
		s3 = new Student();
		String tempn = s2.name;
		s2.name = s3.name;
		s3.name = tempn;
	}

	public static void Test1(Student s2, Student s3) {
		Student t = s2;
		s2 = s3;
		s3 = t;
		System.out.println("i am inside test1" + s2.name);
	}
}
