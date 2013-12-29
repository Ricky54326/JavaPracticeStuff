import static org.junit.Assert.*;
import DataStructures.LinkedList;
import DataStructures.ListNode;


public class TestLinkedList {

	@org.junit.Test
	public void testInteger() {
		//Integer test:
		String correctOutput = "5\n7\n9\n";
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		ListNode<Integer> n1 = new ListNode<Integer>(5);
		ListNode<Integer> n2 = new ListNode<Integer>(7);
		ListNode<Integer> n3 = new ListNode<Integer>(9);
		
		assertNotNull("Node1 should not be null.", n1);
		l1.add(n1);
		
		assertNotNull("Node2 should not be null.", n2);
		l1.add(n2);
		
		assertNotNull("Node3 should not be null.", n3);
		l1.add(n3);
		
		assertEquals("Your LinkedList is not outputting the correct values",
				correctOutput, l1.returnListAsPrinted());
		//End Integer test
	}

}
