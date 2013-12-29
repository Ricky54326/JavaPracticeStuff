package test;

public class Person {
	private String name;
	private int age;
	private double id;
	
	public Person(String name, int age, double id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public double getId(){
		return this.id;
	}
	
	public String toString(){
		return "Name: " + this.name + " Age: " + this.age + " ID: " + this.id;
	}
}
