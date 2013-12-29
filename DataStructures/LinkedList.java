package DataStructures;

public class LinkedList<T> {
	ListNode<T> head;

	public LinkedList(){

	}

	public void add(ListNode<T> toAdd){
		ListNode<T> temp = this.head;
		
		if(this.head == null){
			this.head = toAdd;		
		}

		else{
			//Reach the end of the list
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
			//Add our node in at the end
			temp.setNext(toAdd);
		}
	}
	
	public void printList(){
		ListNode<T> temp = head;
		while(temp != null){
			System.out.println(temp.getData().toString());
			temp = temp.getNext();
		}
	}

	public String returnListAsPrinted(){
		String result = "";
		ListNode<T> temp = head;
		while(temp != null){
			result += temp.getData().toString() + "\n";
			temp = temp.getNext();
		}
		
		return result;
	}

}
