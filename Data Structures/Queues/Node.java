public class Node {
    Node next;
    int data;
    Node Previous;
    public Node(int newData,Node newNext){
        this.next = newNext;
        this.data = newData;
    }
    public Node(int newData,Node newNext,Node newprevious){
        this.next = newNext;
        this.data = newData;
        this.Previous = newprevious;
    }
}
