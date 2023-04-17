import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> intqueue = new LinkedList<>();
        Stack<Double> doubleStack = new Stack<>();
        Scanner user_input = new Scanner(System.in);
        while(true){
            System.out.print("""
                    1 – Add a random int to the queue. The random int should be in the range of 12 to 32.
                    2 – Add an int of the user’s choice to the queue.
                    3 – Remove the next int from the queue. If it’s empty, print “The queue is empty!”
                    4 – Print everything in the queue.
                    5 – Push a random double to the stack. The random double should be in the range of 25.0 to 100.0.
                    6 – Push a double of the user’s choice to the stack.
                    7 – Pop the next double from the stack. If it’s empty, print “The stack is empty!”
                    8 – Print everything in the stack.
                    9 – Exit the program.
                    A: 
                    """);
            try{
            int user_choice = user_input.nextInt();

            if(user_choice == 1){
                addRandomNumberToQueue(intqueue);}
            else if(user_choice == 2){
                addchosennumbertoqueue(intqueue);}
            else if(user_choice == 3){removenextint(intqueue);}
            else if(user_choice == 4){printQueue(intqueue);}
            else if(user_choice == 5){randomToStack(doubleStack);}
            else if(user_choice == 6){userRandomToStack(doubleStack);}
            else if(user_choice == 7){popNextDouble(doubleStack);}
            else if(user_choice == 8){printStack(doubleStack);}
            else if(user_choice == 9){break;}
            else{System.out.print("Invalid Choice. Please choose from 1 to 9.\nA:");}
            }
             catch (Exception e){
                System.out.println("Only Integers permitted. Try Again:");
                break;
            }
        }
        }

    /**
     * Problem 1
     * add a random number to the queue
     */

    public static void addRandomNumberToQueue(Queue queue){
        Random randomInt = new Random();
        int number = randomInt.nextInt(12,32);
        queue.add(number);
    }
    /**
     * Problem 2
     * add a chosen number to the queue
     */
    public static void addchosennumbertoqueue(Queue queue){
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your chosen number: ");
        int number = user_input.nextInt();
        queue.add(number);
    }
    /**
     * Problem 3
     * removes the first elements of the list, therefore it fallows the FIFO order
     */
    public static void removenextint(Queue queue){
       if(queue.isEmpty()){
           System.out.println("The queue is empty!");
       }else{
           queue.remove();
       }

    }
    /**
     * Problem 4
     * Prints all elements of the queue
     */
    public static void printQueue(Queue queue){
        if(queue.isEmpty()){
            System.out.println("The queue is empty!");
        }else{
            for(Object i:queue)
                System.out.println(i);

        }

    }
    /**
     * Problem 5
     * Add a random element into the stack
     */
    public static void randomToStack(Stack stack){
        Random randomDouble = new Random();
        Double number = randomDouble.nextDouble(25,100);
        stack.add(number);
        }

    /**
     * Problem 6
     * Add chosen Double number to stack
     */
    public static void userRandomToStack(Stack stack){
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your chosen number of Double datatype: ");
        Double number = user_input.nextDouble();
        stack.add(number);
    }

    /**
     * Problem 7
     * Remove the last element added to the stack, therefore follows the LIFO order
     */
    public static void popNextDouble(Stack stack) {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty!");
        } else {
            stack.pop();
        }
    }
    /**
     * Problem 8
     * prints everything from the stack as long as it is not empty
     */
    public static void printStack(Stack stack){
        if(stack.isEmpty()){
            System.out.println("The queue is empty!");
        } else{
            for(Object i:stack)
                System.out.println(i);

    }

    }
    }
