package lists;

public class SinglyLinkedList<T> implements Listable<T>{

	private Node head;
	
	private class Node
	{
		T data;
		Node next;
	}
	
	@Override
	public void add(T data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if (head == null)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			while (temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
	}
	
	@Override
	public void printAll() {
		System.out.println(this.getClass().getSimpleName());
		Node temp = head;
		while (temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	@Override
	public int insertAt(int index, T data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		return (head == null);
	}

	@Override
	public void clear() {
		head = null;
		
	}

	@Override
	public int getSize() {
		Node temp = head;
		int i = 0;
		while(temp != null)
		{
			i++;
			temp = temp.next;
		}
		return i;
	}


	@Override
	public T get(int index) {
		if(index >= this.getSize() || index < 0)
			return null;
		Node temp = head;
	
		for(int i = 0; i < index; i++)
		{
			temp = temp.next;
		}
		return temp.data;
	}

}
