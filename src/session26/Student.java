package session26;

public class Student  {
	String name;
	int age;
	int rollno;

	public void introduce() {
		int age = 90;
		System.out.println("hello my name is" + this.name + "  age is "
				+ this.age + " roll no is " + this.rollno);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public Student() {
		this.name = null;
		this.age = 0;
		this.rollno = 0;
	}

//	public void setAge(int age) {
//		try {
//			if (age < 0) {
//				throw new Exception("age can't be negative");
//			}
//			this.age = age;
//		}
//
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		finally{
//			System.out.println("i am inside finally");
//		}
//		
//	}
	public void setAge(int age) throws Exception {
		if(age < 0){
			throw new Exception("age can't be negative");
		}
		this.age = age;
	}

	public Student(String name, int age, int rollno) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}

}
