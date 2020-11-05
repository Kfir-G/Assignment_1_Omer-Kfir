public class DDLinkedList
{
	//---------data fields----------
	private ListElement head, tail;
	
	//----------methods----------
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
		ListElement newElm = new ListElement(val);  //OMER! I'm not sure!
		
		if(head != null)
			tail.setPrev(newElm);
		else
			//if the list was empty before addition
			tail = newElm;
		
		tail = newElm;
	} 
	
	/**
	* Removes an element from the head of the list 
	* @return the value of the element removed, or -1 if the list is empty
	*/
	protected int removeFromHead()
	{
		if(head == null)
			return -1;
		
		int ret = head.getVal();
		head = head.getNext();
		
		if(head == null)
			tail = head;
		else
			head.setPrev(null);
		
		return ret;
	}
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
	//Gets:
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
	
	/**
	* get method for the prev ListElement reference
	* @return an <code> ListElement </code> of the prev
	*/
	public ListElement getPrev()
	{
		return prev;
	}
		//
	
	//Sets:
	/**
	* set method for the next ListElement reference
	* @param next ListElement
	*/
	public void setNext(ListElement next)
	{
		this.next = next;
	}
	
	/**
	* set method for the prev ListElement reference
	* @param prev ListElement
	*/
	public void setPrev(ListElement prev)
	{
		this.prev = prev;
	}
		//
	/**
	* 
	*/
	public String toString()
	{
		return ""+val+"";
	}
}