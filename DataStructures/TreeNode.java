package DataStructures;

public class TreeNode<T> {
	private T data;
	private TreeNode<T> left;
	private TreeNode<T> right;
	
	public TreeNode(T data){
		this.data = data;
	}
	
	public void setLeft(TreeNode<T> n){
		this.left = n;
	}
	
	public void setRight(TreeNode<T> n){
		this.right = n;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public TreeNode<T> getLeft(){
		return this.left;
	}
	
	public TreeNode<T> getRight(){
		return this.right;
	}
	
	public T getData(){
		return this.data;
	}
	
}
