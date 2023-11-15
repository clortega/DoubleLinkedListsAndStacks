//Single Linked List - Monday 13 NOV 2023

public class Test {

    public static void main(String[] args) throws Exception { //entry point to the application, java looks for this no matter where it is located.
        //Note that we had to declare it in the method
        // Node n1 = new Node(10);
        // Node n2 = new Node(20);
        // Node n3 = new Node(30);

        // n1.next = n2; //this is how we chain the nodes
        // n2.next = n3; //we continue our chain, its not quite a linked list yet...

        // System.out.println(n1.value); //.value displays the value of n1
        
        // System.out.println(n2.value);
        // System.out.println(n1.next.value); //this is how we display n2, with n1 as the reference.

        // System.out.println(n3.value);
        // System.out.println(n1.next.next.value); //displays n3. In single linked list we can only move forward. Add a previous variable to Node.java
        DoubleLinkedList list = new DoubleLinkedList();
        // list.AddFirst(10);
        // list.AddFirst(20);
        // list.AddFirst(30);
        // list.Print();

        // list.AddLast(15);
        // list.Print();

        // list.AddLast(25);
        // list.Print();

        // list.AddLast(35);
        // list.Print();
        // list.DeleteFirst();
        // list.Print();
        // list.DeleteFirst();
        // list.DeleteFirst();
        // list.DeleteFirst();
        // list.DeleteFirst();

        // list.Print();        
  
        MyStack stack = new MyStack();
        stack.Push(10); //Push is the same as add, its what they call it for stacks.
        stack.Push(20);
        stack.Push(30);

        System.out.println(stack.Peek()); //should display 30
        System.out.println(stack.Peek()); //30 again
        
        stack.Pop(); //removes the top of the stack
        System.out.println(stack.Peek()); //20, we removed the 30 peek is now 20

        stack.Push(40);
        System.out.println(stack.Peek()); //40
        stack.Print();

    }
}
