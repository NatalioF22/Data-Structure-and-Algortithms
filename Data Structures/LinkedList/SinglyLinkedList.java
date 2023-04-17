public class SinglyLinkedList {
    int size;
    Node head;
    Node tail;
    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public void printList(){
        if(this.size==0){
            System.out.printf("This list is empty");
            return;
        }else{
            Node current = head;
            while(current!=null){
                System.out.printf(current.data+ " -> ");
                current  = current.next;
            }
            System.out.printf("end");
        }
    }
    public void AddFirst(int data){
        if(this.size==0){
            Node newNode = new Node(data,null);
            this.head   = newNode;
            this.tail = newNode;
            size++;
    }else{
            Node newNode = new Node(data,this.head);
            this.head = newNode;
            size++;
        }
    }

    public void AddLast(int data){
        if(this.size==0){
            Node newNode = new Node(data,null);
            this.head   = newNode;
            this.tail = newNode;
            size++;
        }else{
            Node newNode = new Node(data,null);
            tail.next = newNode;
            this.tail = newNode;
            size++;
        }
    }
    public void isEmpty(){
        if(this.size==0){
            System.out.printf("True");
        }else{
            System.out.printf("False");
        }
    }
    public void getFirst(){
        if(this.size==0){
            System.out.printf("The list is Empty");
        }else{
            Node current = head;
            System.out.print(current.data);


        }
    }
    public void getLast(){
        if(this.size==0){
            System.out.printf("The list is Empty");
        }else{
            Node current = tail;
            System.out.print(current.data);


        }
    }
}