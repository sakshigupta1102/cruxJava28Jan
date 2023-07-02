package session41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Animal dog = new Animal(10, "dog", 10000);
		Animal cat = new Animal(3, "cat", 10000);
		Animal rabbit = new Animal(2, "rabbit", 10000);
		Animal elephant = new Animal(30, "elephant", 10000);
		ArrayList<Animal> list = new ArrayList();
		list.add(elephant);
		list.add(cat);
		list.add(rabbit);
		list.add(dog);
		Collections.sort(list, new Animalcomp());
		System.out.println(list);
		
	}

}

class Animal {
	int age;
	String name;
	int num;

	public Animal(int age, String name, int num) {
		this.age = age;
		this.name = name;
		this.num = num;
	}

	@Override
	public String toString() {
		return ""+name;
	}
	

}

class Animalcomp implements Comparator<Animal> {
	@Override
	public int compare(Animal o1, Animal o2) {
		if (o1.age > o2.age)
			return 1;
		return -1;
	}

}
