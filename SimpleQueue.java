/**
 * Lab07 part D - Simple queue class using linked list
 * @author Hazal Buluş
 * @version 29.07.2021
 */
public class SimpleQueue {
    //properties
    SimpleLinkedList linkedList;

    //constructor
    public SimpleQueue(){
        linkedList = new SimpleLinkedList();
    }

    /**
     * add a node to end of the linkedlist
     * @param data
     */
    public void enqueue(String data){
        linkedList.addToTail(data);
    }
    
    /**
     * remove the linkedlist's first node 
     * @return removed node's data
     */
    public String dequeue(){
        return linkedList.removeFromHead();
    }

    /**
     * checks is linkedlist empty or not
     * @return boolean
     */
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
    
    public String toString(){
        return linkedList.toString();
    }
}
