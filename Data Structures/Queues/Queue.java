import java.util.NoSuchElementException;

public class Queue {
    Node front;
    Node back;
    int size;

    /**
     * Creates an empty Queue.
     */
    public Queue() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    /**
     * Clears the contents of this queue.
     */
    public void clear() {
        front = null;
        back = null;
        size = 0;
    }

    /**
     * Adds a new Node to the back of this queue.
     * @param data a valid String that will be used to create the Node.
     */
    public void enqueue(int data) {
        if (size == 0) {
            Node newNode = new Node(data, null);
            front = newNode;
            back = newNode;
        } else {
            Node newNode = new Node(data, null);
            back.next = newNode;
            back = newNode;
        }
        ++size;
    }

    /**
     * Returns (but doesn't remove) the first Node of this queue.
     * @return The first Node of this queue.
     * @throws NoSuchElementException if this queue is empty.
     */
    public Node element() {
        if(size == 0) {
            throw new NoSuchElementException("This queue is empty!");
        } else {
            return front;
        }
    }

    /**
     * Returns (but doesn't remove) the first Node of this queue. Returns null if the queue is empty.
     * @return The first Node of this queue.
     */
    public Node peek() {
        if(size == 0) {
            return null;
        } else {
            return front;
        }
    }

    /**
     * Removes (but doesn't return) the first Node of this queue.
     * @throws NoSuchElementException if this queue is empty.
     */
    public Node dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("This queue is empty!");
        } else if (size == 1) {
            Node toReturn = front;
            clear();
            return toReturn;
        } else {
            Node toReturn = front;
            front = front.next;
            --size;
            return toReturn;
        }
    }

    /**
     * Removes (but doesn't return) the first Node of this queue. Returns null if the queue is empty.
     * @throws NoSuchElementException if this queue is empty.
     */
    public Node poll() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node toReturn = front;
            clear();
            return toReturn;
        } else {
            Node toReturn = front;
            front = front.next;
            --size;
            return toReturn;
        }
    }
}