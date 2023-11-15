public class MyStack {
    //field - data
    DoubleLinkedList values = new DoubleLinkedList();


    //methods - actions
    //Push (adding in stacks)
    public void Push(int someValue)
    {
        values.AddFirst(someValue);
    }
    //Peek
    public int Peek()
    {
        return values.head.value; //returns value of the head of the list
    }

    //Pop - removes the top element
    public int Pop() throws Exception
    {
        int tmp = values.head.value;
        values.DeleteFirst();
        return tmp;
    }
    //IsEmpty
    public boolean IsEmpty()
    {
        return values.IsEmpty(); //because this is based off of a list
    }
    //Print
    public void Print()
    {
        values.Print();
    }

    //constructor(s)- init(ializers)
}
