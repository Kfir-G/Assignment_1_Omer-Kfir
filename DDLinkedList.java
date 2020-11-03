public class DDLinkedList
{
	private ListElement head, tail;
	
	/**
	* Add an element to the head of the doubly-linked-list.
	* @param val the integer value to be added to the head of the list.
	*/
	protected void addToHead(int val)
	{
		ListElement newElm = new ListElement(val, head);
		
		if(head != null)
			head.setPrev(newElm);
		else
			//if the list was empty before addition
			tail = newElm;
			
		head = newElm;
	}
}
}
public class ListElement
{
}