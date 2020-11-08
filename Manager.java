import java.util.*;

public class Manager
{
	//---------data fields---------
	private Stack st;
	private Queue q;
	
	private String [] menuOptions = {"1. Enqueue", "2. Dequeue",
		"3. Display queue", "4. Push", "5. Pop", "6. Display stack", "7. Exit"};
	
	//---------constructors------------
	/**
	* Manager no-argument constructors, initializes a new Stack object
	* and a new Queue object
	*/
	public Manager()
	{
		st = new Stack();
		q = new Queue();
	}
	
	//-----------methods-----------------
	/**
	* Displays and handles the user choices interactively
	*/
	private void displayMenu() {
		Scanner myScanner = new Scanner(System.in);

		while (true) {
			for (String str:menuOptions) {
				System.out.println(str);
			}
			switch (myScanner.nextInt()) {
				case 1:
					System.out.println("Enter a number to enqueue.");
					q.enqueue(myScanner.nextInt());
					break;
				case 2:
					System.out.println("number dequeued: " + q.dequeue());
					break;
				case 3:
					System.out.printf("Queue: ");
					q.display();
					break;
				case 4:
					System.out.println("Enter a number to push.");
					st.push(myScanner.nextInt());
					break;
				case 5:
					System.out.println("pop item : " + st.pop());
					break;
				case 6:
					System.out.printf("Stack: ");
					st.display();
					break;
				case 7:
					System.exit(0);
			}
		}
	}

	//--------------Main--------------------
	public static void main(String[] args){
		Manager mangr = new Manager();
		mangr.displayMenu();
	}
}
