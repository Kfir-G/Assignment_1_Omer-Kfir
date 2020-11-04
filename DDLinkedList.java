public class DDLinkedList
{
	private ListElement head, tail;
	
	/**
	* Add an element to the head of the doubly-linked-list
	* @param val the integer value to be added to the head of the list
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
	
	/**
	* Add an element to the tail of the doubly-linked-list
	* @param val the integer value to be added to the tail of the list
	*/
	protected void addToTail(int val)
	{
		ListElement newElm = new ListElement(val, tail);
		
		
	}
}
}
 class ListElement
{
	private int val;
	private ListElement next;
	private ListElement prev;
	
	/**
	* ListElement no-arugment constructor, initializes val data to 0 and 
	* "next" "prev" references to null
	*/
	public ListElement ()
	{
		this ( 0, null, null); // invokes constructor with 3 arguments
	}
	
	/**
	* ListElement constructor 
	* @param val the value of to be held by the ListElement
	*/
	public ListElement (int val)
	{
		this(val, null, null) // invokes constructor with 3 arguments
	}
	
	/**
	* ListElement constructor 
	* @param val the value of to be held by the ListElement
	* @param next the reference to the element next ListElement
	* @param prev the reference to the element prev ListElement
	*/
	public ListElement (int val, ListElement next, ListElement prev)
	{
		this(val,next,prev); // invokes constructor with 3 arguments
	}
}