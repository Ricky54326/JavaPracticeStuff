package DataStructures;

public class ListNode<T> {
	private T data;
	private ListNode<T> next;
	
	public ListNode(T data){
		this.data = data;
	}
	
	public void setNext(ListNode<T> n){
		this.next = n;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public ListNode<T> getNext(){
		return this.next;
	}
	
	public T getData(){
		return this.data;
	}
	
}
