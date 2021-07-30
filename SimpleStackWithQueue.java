/**
 * Lab07 part E - Simple stack class using two queue from part D 
 * @author Hazal Buluş
 * @version 29.07.2021
 */
public class SimpleStackWithQueue {
    //properties
    SimpleQueue q1,q2;

    //constructor
    public SimpleStackWithQueue(){
        q1 = new SimpleQueue();
        q2 = new SimpleQueue();
    }
    
    /**
     * add a node with given data to the stack
     * @param data
     */
    public void push(String data){

        q2.enqueue(data);
        //One by one dequeue everything from q1 and enqueue to q2.
        while(!q1.isEmpty()){
            String info = q1.dequeue();
            q2.enqueue(info);
        }
        //Swap the names of q1 and q2
        SimpleQueue temp = q2;
        q2=q1;
        q1 = temp;
    }

    /**
     * remove the stack's last added node
     * @return removed node's data
     */
    public String pop(){
        return q1.dequeue();
    }

    public String toString(){
        return q1.toString();
    }
}
