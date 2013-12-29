/*
 * Data Structures test stuff in Java - I've mainly used C/C++ for 
 * data structures, so I figured I would make some stuff in Java to
 * practice for interviews and for my upcoming courses.
 * 
 * @author Riccardo Mutschlechner riccardo@cs.wisc.edu
 * @version 1.0 12/23/2013
 */

import DataStructures.LinkedList;
import DataStructures.ListNode;
import test.Person;

public class Main {

	public static void main(String[] args){
		integerTestCase(); //My test case for Integers
		stringTestCase(); //My test case for Strings
		personTestCase(); //My test case for Person - a custom class
	}
	
	public static void integerTestCase(){
		/* Begin Integer test for generic LinkedList */
		System.out.println("Begin Integer test:");
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		ListNode<Integer> n1 = new ListNode<Integer>(5);
		ListNode<Integer> n2 = new ListNode<Integer>(7);
		ListNode<Integer> n3 = new ListNode<Integer>(9);

		l1.add(n1);
		l1.add(n2);
		l1.add(n3);
		
		l1.printList();
		
		System.out.println("End Integer test\n");
		/* End Integer test for generic LinkedList */
	}
	
	public static void stringTestCase(){
		/* Begin String test for generic LinkedList */
		System.out.println("Begin String test:");
		
		LinkedList<String> l1 = new LinkedList<String>();
		ListNode<String> n1 = new ListNode<String>("First");
		ListNode<String> n2 = new ListNode<String>("Second");
		ListNode<String> n3 = new ListNode<String>("Third");

		l1.add(n1);
		l1.add(n2);
		l1.add(n3);
		
		l1.printList();
		
		System.out.println("End String test\n");
		/* End String test for generic LinkedList */
	}
	
	public static void personTestCase(){
		/* Begin String test for generic LinkedList */
		System.out.println("Begin Person test:");
		
		LinkedList<Person> l1 = new LinkedList<Person>();
		
		//Create three Person objects to use.
		Person p1 = new Person("Ricky", 20, 1337);
		Person p2 = new Person("PI", 65, 3.14159);
		Person p3 = new Person("e", 13, 2.71828);
		
		//Insert the three Person objects into the list
		ListNode<Person> n1 = new ListNode<Person>(p1);
		ListNode<Person> n2 = new ListNode<Person>(p2);
		ListNode<Person> n3 = new ListNode<Person>(p3);

		l1.add(n1);
		l1.add(n2);
		l1.add(n3);
		
		l1.printList();
		
		System.out.println("End String test\n");
		/* End String test for generic LinkedList */
	}
}
