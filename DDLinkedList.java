public class DDLinkedList
{
	/*//here
	private ListElement head, tail;
	
	/**
	* Add an element to the head of the doubly-linked-list
	* @param val the integer value to be added to the head of the list
	*/                                          /* //here
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
	*/                                      /*//here
	protected void addToTail(int val)
	{
		ListElement newElm = new ListElement(val, tail);
		
		
	} 
	*/ //here
}
 class ListElement
{
	//---------data fields-----------------
	private int val;
	private ListElement next;
	private ListElement prev;
	
	//-------constructors---------------
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
	* "next" "prev" references to null
	*/
	public ListElement (int val)
	{
		this(val, null, null); // invokes constructor with 3 arguments
	}
	
	/**
	* ListElement constructor
	* @param val the value of to be held by the ListElement
	* @param next the reference to the element next ListElement
	* "prev" references to null
	*/
	public ListElement(int val, ListElement next)
	{
		this(val,next,null);
	}
	/**
	* ListElement constructor 
	* @param val the value of to be held by the ListElement
	* @param next the reference to the element next ListElement
	* @param prev the reference to the element prev ListElement
	*/
	public ListElement (int val, ListElement next, ListElement prev)
	{
		// invokes constructor with 3 arguments
		this.val = val;
		this.next = next;
		this.prev = prev;
	}
	
	//------------methods----------------
	/**
	* get method for the internal data value
	* @return an <code> integer </code> the value of the list element
	*/
	public int getVal()
	{
		return val;
	}
	
	/**
	* get method for the next ListElement reference
	* @return an <code> ListElement </code> of the next
	*/
	public ListElement getNext()
	{
		return next;
	}
	
}