package Java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// http://www.mkyong.com/java8/java-8-lambda-comparator-example/
class Developer {
	String name;
	BigDecimal salary;
	int age;

	Developer(String name, BigDecimal salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return this.name + " " + this.salary.toString() + " " + this.age;
	}
}

public class TestSorting {

	public static void main(String[] args) {
		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort::");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		// sort by age without using Lambda
//		Collections.sort(listDevs, new Comparator<Developer>() {
//			@Override
//			public int compare(Developer o1, Developer o2) {
//				return o1.getAge() - o2.getAge();
//			}
//		});
		
		//sort by age using the lambda expressions
		listDevs.sort(new Comparator<Developer>(){

			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
			
		});
		
		System.out.println("\nAfter Sort::");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("Kishor", new BigDecimal("70000"), 25));
		result.add(new Developer("Harsh", new BigDecimal("80000"), 24));
		result.add(new Developer("Mayur", new BigDecimal("100000"), 28));
		result.add(new Developer("Sharad", new BigDecimal("170000"), 30));
		result.add(new Developer("Harshad", new BigDecimal("170000"), 26));
		return result;
	}

}
