public class Queue extends DDLinkedList
{
	//---------methods---------
	/**
	* enqueue an element to the back of the Queue.
	* @param val an integer value of the element that added to the queue
	*/
	public void enqueue(int val)
	{
		addToTail(val);
	}
	
	/**
	* dequeue an element from the Front of the Queue
	* @return the value of the last element in the queue, if the queue is empty return -1 
	*/
	public int dequeue()
	{
		if(isEmpty() == true){
			System.out.println("Dequeue: queue is empty");
			return -1;
		}
		
		return removeFromHead();
	}
}