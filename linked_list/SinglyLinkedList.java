package linked_list;

public class SinglyLinkedList {
	Node head;
	Node tail;
	int size;
	
	class Node{
		int data;
		Node next;     //pointer
		Node(int data) {
			this.data = data;
		}	
	}
	
	public boolean isEmpty() {
		return head==null&&tail==null;
	}
	public int size() {
		return this.size;
	}
	public boolean append(int data) {
		Node node=new Node(data);
		if(isEmpty()) {
			head=node;
			tail=node;
		}else {
			tail.next=node;
			tail=node;
		}
		size++;
		return true;
	}
	public boolean prepend(int data) {
		Node node=new Node(data);
		if(isEmpty()) {
			head=node;
			tail=node;
		}else {
			node.next=head;
			head=node;
		}
		size++;
		return true;
	}
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			//or  System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println();
	}
	public boolean insert(int index,int data) {
		if(index<=0) return prepend(data);
		if(index>size)return append(data);
		Node temp=head;
		Node prev=null;
		int i=0;
		while(i!=index) {
			prev=temp;
			temp=temp.next;
			i++;
		}
		Node node=new Node(data);
		  if(i==index) {
				prev.next=node;
				node.next=temp;
				size++;
			}
		
		return true;
	}	
	public boolean deleteFirst() {
		if(isEmpty()) {
			head =null;
			tail=null;
		}else {
			head=head.next;
		}
		size--;
		return true;
	}
	public boolean deleteLast() {
		if(isEmpty()) {
			System.out.println("Linked list is empty ");
			return false;
		}
		if(size==1) {
			head =null;
			tail=null;
		}else {
		Node temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
		}
		size--;
		return true;
	}
	public boolean deleteIndex(int index) {
		if(index==0)return deleteFirst();
		if(index==size-1)return deleteLast();
		Node temp=head;
		Node prev=null;
		int i=0;
		while(i!=index) {
			prev=temp;
			temp=temp.next;
			i++;
		}
		prev.next=temp.next;
		size--;
		return true;
	}
	public boolean deleteAll() {
		head=null;
		tail=null;
		size=0;
		return true;
	}
	public static boolean link(SinglyLinkedList s1,SinglyLinkedList s2){
		Node temp=s1.head;
		while(temp!=null) {
			System.out.println(temp.data);
			//or  System.out.print(temp.data+", ");
			temp=temp.next;
		}
		temp=s2.head;
		return true;
	}
}
