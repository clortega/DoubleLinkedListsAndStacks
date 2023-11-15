public class Node {
    //Three concerns when making a new class: data, actions and init
    //data - fields
    int value;
    Node next; //this will be a reference to another node. We define a node in terms of itself...
    //A single linked list only moves forward..


    //actions - methods
    //init = constructor(s), if we don't put one down, java gives a default constructor.
    public Node(int initialValue) {
        value = initialValue;
        //next = null; we don't write this out, because it happens by default
    }
}
