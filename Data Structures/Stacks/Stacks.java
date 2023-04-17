import java.util.NoSuchElementException;

public class Stacks{
    int size;
    Node head;
    
    public Stacks(){
        this.size = 0;
        this.head = null;
        
    }
    public void clear(){
        this.size = 0;
        this.head = null;
        
    }
    public void printStack(){
        if(this.size==0){
            System.out.println("This stack is empty");
            return;
        }else{
            Node current= head;
            while(current!=null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
    public void push(int data){
        if(this.size==0){
            Node newNode = new Node(data,null);
            
            this.head =  newNode;
            size++;
        }else{
            Node newNode = new Node(data,head);
            this.head = newNode;
            size++;
        }
    }
    public void pop(){
        if(this.size==0){
            throw new NoSuchElementException("Empty list");
        }else{
            head = head.next;
            --size;
        }
    }
}