public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ourlist = new SinglyLinkedList();
        ourlist.AddFirst(1);
        ourlist.AddFirst(2);
        ourlist.AddFirst(3);
        ourlist.AddLast(4);
        ourlist.printList();
        ourlist.isEmpty();
        ourlist.getFirst();
        ourlist.getLast();
    }
}