//For Homework rename this to doubly linked list.

public class DoubleLinkedList {
    //data - fields
    Node head; //Here we define the head
    Node tail; //We add the tail 

    //action - methods
    //AddFirst
    public void AddFirst(int someValue) //O(1) constant time
    {
        //step 1 create a new node
        Node newNode = new Node(someValue); //don't forget the 'new'
        if(IsEmpty()) 
        {
            head = tail = newNode; //can be written in two lines
        }
        else {
        //step 2 link this node to the head (the beginning of the existing list)
        newNode.next = head; 

        //step 3 move the head to point to new node
        head = newNode;
        //we almost always need these three steps
        }


    }
    
    //Print Method - traversal
    public void Print() //void, becuase we are just gonna print. No returns. if empty O(1)? otherwise, O(n)
    {
        if(IsEmpty())
        {
            System.out.println("Empty list...");
        }
        else
        {
        //put the finger on the head
         Node finger = head; //'finger' is a Node type

        //repeat as long as finger does not point to null
        while(finger != null)
        {
            //display the value
            System.out.print(finger.value + " -> ");
            //move your finger to the next node
            finger = finger.next;
        }
    System.out.println();
    System.out.println();
        }
    }

    //AddLast
    public void AddLast(int someValue) //O(n) because of the while loop
    {
        if(IsEmpty()) //we updated this from our empty method
        {
            AddFirst(someValue);
        }
        //Create a new node
        Node newNode = new Node(someValue);

        //link in the new node - make the last node point to the newnode
        tail.next = newNode;
        //moved tail
        tail = newNode;
    }
    

    //IsEmpty - optional
    public boolean IsEmpty() //O(1) because all we do is compare ... if its empty
    {
        // if(head == null)
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }
        return head == null; //we can write the above if-else in one line
    }

    //deletes...
    //O(1) because we just shift the head from first value to the next
    public void DeleteFirst() throws Exception //must declare any throws in the method
    {
        if(IsEmpty())
        {
            throw new Exception(" You cannot delete from an empty list");
        }
        else if(head.next ==null) //we only have one node can also be written as"head != null && head == tail"
        {
            head = tail = null;
        }
        else //we have at least two nodes
        {
        //move the head????
        head = head.next; //we made the assumption there will be a next
        }

    }

    public void DeleteLast() throws Exception //O(n) because we must traverse the array
    {
         if(IsEmpty())
        {
            throw new Exception(" You cannot delete from an empty list");
        }
        else if (head.next == null) //we only have one node in the list
        {
            DeleteFirst(); //if tail == head, this will also delete the head.
        }
        else { //there was an error here, add this to singlelinked list as well.
        //find the next to last node
        Node finger = head;

        while(finger.next.next != null)
        {
            finger = finger.next;
        }
        //breaks the link between the last and next to last node
        finger.next = null;
        //move the tail
        tail = finger;
        }
    }

    public void clear() //O(1) because we only need to make the head point to null
    {
        head = tail = null; // with the head gone, everything else gets cleared
    }
    //init
}


//Notes
//When every instance has its own value, its not static
//When every instance shares the same value we say its static.