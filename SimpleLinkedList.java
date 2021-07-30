/**
 * Lab07 part C - Linkedlist class consists of nodes created in part a
 * @author Hazal Buluş
 * @version 29.07.2021
 */
public class SimpleLinkedList {
    //properties
    Node head;

    //constructor
    public SimpleLinkedList(){
        head = null;
    }

    /**
     * Add a node with given data at the end of the list
     * @param data
     */
    public void addToTail(String data){

        Node lastNode = new Node(data);
        Node temp = head;

        if(head == null){
            head = lastNode;
        }
        else{
            while(temp.next != null)
                temp = temp.next;

            temp.next = lastNode;
        }
    }

    /**
     * remove first node of the list
     */
    public String removeFromHead(){
        Node temp;
        String data = head.getData();
        if(head == null){
            return "";
        }
        else{
            temp = head.next;
            head.next = null;
            head = temp;
        }
        return data ;
    }

    /**
     * checks is list empty or not
     * @return boolean
     */
    public boolean isEmpty(){
        return head == null;
    }
    /**
     * Returns note having given data
     * @param data
     * @return Node
     */
    public Node get(String data){
        Node temp = head;

        if(temp.getData().equals(data))
            return head;
        else{
            while(!temp.getData().equals(data))
                temp=temp.next;
            return temp;    
        }
    }
    
    public String toString(){
        Node temp = head;
        String result = "";
        while(temp != null){
            result += temp.getData() + " --> " ;
            temp=temp.next;
        }
        return result;
    }
}
