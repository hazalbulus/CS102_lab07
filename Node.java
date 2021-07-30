/**
 * Lab07 part B Node class
 * @author Hazal Buluş
 * @version 29.07.2021
 */
public class Node{
    //properties
    String data;
    Node next;

    //constructors
    public Node(String data){
        this.data=data;
        next = null;
    }
    public Node(String data, Node next){
        this.next= next;
        this.data = data;
    }
    /**
     * Returns a node's data
     * @return data
     */
    public String getData(){
        return data;
    }
 
}