
class Linkedlist2
{
	Node head;//starting point of list
	
	static class  Node{
		int data;//data value
		Node next;//link for node
		
		Node(int d)//constructor for default values
		{
			data = d;
			next = null;
		}

	}
	//traversing a linked list
	public void display()
	{
		Node n=head;
		
		while(n != null)
		{
		System.out.print(n.data+"----> ");
		n=n.next;// traversing next node
		}
		
	}
	public void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void insertAfter(Node prev_node, int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
	}

public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)//condition to check list is empty.
		{
			head =new Node(new_data);
			return;	
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null)
			last=last.next;
		last.next = new_node;
		return;
	}
	
	public static void main(String args[])
	{
		Linkedlist2 l1 = new Linkedlist2();
		
		l1.head = new  Node(11);// linkedlist with first node is created
		Node first = new Node(22);
		Node second = new Node(33);
		
		l1.head.next = first;// next node 22 is connected
		first.next = second;//next node 33 is connect
		
		l1.display();
		System.out.println(" ");
		l1.insert(5);
		l1.display();
		
		System.out.println(" ");
		l1.insert(2);
		l1.display();
		
		System.out.println(" ");
		l1.insertAfter(l1.head,4);
		l1.display();
		
		System.out.println(" ");
		l1.insertAfter(l1.head.next.next,7);
		l1.display();
		
		System.out.println(" ");
		l1.append(100);
		l1.display();
		
		
	}
}