/**
 * Lab07 test class
 * @author Hazal Buluş
 * @version 29.07.2021
 */
public class Test { 
    public static void main(String[] args) {
        //properties
        SimpleLinkedList linkedList;
        SimpleQueue queue;
        SimpleStackWithQueue stack;

        stack = new SimpleStackWithQueue();
        queue = new SimpleQueue();
        linkedList = new SimpleLinkedList();

        //Adding nodes to linkedlist
        linkedList.addToTail("1");
        linkedList.addToTail("2");
        linkedList.addToTail("3");
        linkedList.addToTail("4");
        linkedList.addToTail("5");

        System.out.println("=================Trial of the LinkedList class===================");
        System.out.println(linkedList);
        System.out.println("Data of the removed node: " +linkedList.removeFromHead());
        System.out.println(linkedList);
        System.out.println( "Data of the removed node: " +linkedList.removeFromHead());
        System.out.println(linkedList);
        System.out.println("Data of the removed node: " +linkedList.removeFromHead());
        System.out.println(linkedList);
        System.out.println();

        System.out.println("===============Trial of the Queue class=====================");
        //adding and removing nodes to queue
        queue.enqueue("one");
        System.out.println(queue + "\n");
        queue.enqueue("two");
        System.out.println(queue+ "\n");
        queue.enqueue("three");
        System.out.println(queue+ "\n");
        queue.enqueue("four");
        System.out.println(queue + "\n");
        
        System.out.println("Data of the removed node: " +queue.dequeue() + "\n");
        System.out.println(queue + "\n");
        System.out.println("Data of the removed node: " +queue.dequeue() + "\n");
        System.out.println(queue + "\n");
        System.out.println();

        System.out.println("===============Trial of the Stack class=====================\n");
        //adding and removing nodes to stack
        stack.push("15");
        System.out.println(stack + "\n");
        stack.push("14");
        System.out.println(stack+ "\n");
        stack.push("13");
        System.out.println(stack+ "\n");
        stack.push("12");
        System.out.println(stack+ "\n");
        stack.push("11");

        System.out.println(stack+ "\n");
        System.out.println("Data of the removed node: " +stack.pop()+ "\n");
        System.out.println(stack+ "\n");
        System.out.println("Data of the removed node: " +stack.pop()+ "\n");
        System.out.println( stack+ "\n");
        System.out.println("Data of the removed node: " +stack.pop()+ "\n");
        System.out.println(stack + "\n");
        
        //end of the code.
    }
    
}
