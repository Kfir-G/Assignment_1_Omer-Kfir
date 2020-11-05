import java.util.*;

public class Manager
{
	//---------data fields---------
	private Stack st;
	private Queue q;
	
	private String [] menuOptions = {"1. Enqueue", "2. Dequeue",
		"3. Display queue", "4.Push", "5. Pop", "6. Display stack", "7. Exit"};	
	
	//---------constructors------------
	/**
	* Manager no-argument constructors, initializes a new Stack object
	* and a new Queue object
	*/
	public Manager()
	{
		st = new Stack();
		q = new Queue()
	}
	
	//-----------methods-----------------
	/**
	* Displays and handles the user choices interactively
	*/
	private void displayMenu()
	{
		
	}

	//--------------Main--------------------
	public static void main(String[]args)
	{
		
	}
}
