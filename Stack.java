public class Stack extends DDLinkedList
{
    /**
     * push an element to the top of the Stack.
     * @param val an integer value of the element that push to the Stack
     */
    public void push(int val){addToHead(val);}


    /**
     * pop an element from the top of the Stack.
     * @return Returns the value of the element popped from the top of the Stack. if Stack is empty returns -1
     *
     */
    public int pop(){
        if(removeFromHead() == -1){
            return -1;
        }
        else{
            return removeFromHead();
        }
    }
}