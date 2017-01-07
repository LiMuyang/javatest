class Link{
	private Node root;
	private int count = 0;
	private class Node{
		private String data;
		private Node next;
		public Node(String data){
			this.data = data;
		}
	}
	public int size(){
		return this.count;
	}
	public boolean isEmpty(){
		return count==0;
	}
	public boolean contains(String data){
		if(this.root==null){
			return false;
		} else 
	}
	public boolean contains(String data,Node currentNode){
		
	}
	public void add(String data){
		Node newNode = new Node(data);
		this.count++;
		if(root==null){
			root = newNode;
		} else {
			addNode(newNode,this.root);
		}
	}
	public void addNode(Node newNode,Node currentNode){
		if(currentNode.next==null){
			currentNode.next = newNode;
		} else {
			addNode(newNode,currentNode.next);
		}
	}
	public void print(){
		if(this.root==null){
			System.out.println("no root no link");
		} else {
			print(this.root);
		}
	}
	public void print(Node currentNode){
		System.out.println(currentNode.data);
		if(currentNode.next!=null){
			print(currentNode.next);
		}
	}
}

public class LinkDemo{
	public static void main(String[] args){
		Link link = new Link();
		System.out.println(link.size());
		System.out.println(link.isEmpty());
		link.add("Hello");
		link.add("world");
		link.print();
		System.out.println(link.size());
		System.out.println(link.isEmpty());
	}
}