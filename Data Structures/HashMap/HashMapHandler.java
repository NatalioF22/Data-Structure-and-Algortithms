import java.util.HashMap;
import java.util.Scanner;

public class HashMapHandler {
    private HashMap map;
    Scanner user_input;

    public HashMapHandler() {
        map = new HashMap<String,Integer>();
        user_input = new Scanner(System.in);
    }

    //Menu 1
    public String addToHashMap(String value, int key) {

            map.put(value, key);
            System.out.println("Added Successfully to the HashMap!!!");
            user_input.nextLine();
            return "Added to the HashMap successfully";
        }

    //Menu 2

    public String containsKey(String value) {

        if (map.containsKey(value) == true) {
            return "The Hashmap contains the Value: " + value+"\n";
        } else {
            return "The Hashmap does not contains the Value: " + value+"\n";
        }
    }

    //Menu 3
    public String containsValue(int key) {

            if (map.containsValue(key) == true) {
                return "The Hashmap contains the Value: " + key + "\n";
            } else {
                return "The Hashmap does not contains the Value: " + key + "\n";
            }
        }


    //Menu 4
    public void getKey(String value) {
        if (map.containsKey(value) == true) {
            System.out.println("Value "+map.get(value)+"\n");
        } else {
            System.out.println("The following value '" + value + "' was not found in the HashMap\n");
        }
    }

    //Menu 5
    public void getAllValues() {
        if (map.size() == 0) {
            System.out.println("The HashMap is Empty!");
        } else {
            System.out.println("Here are all the values in the Hashmap: ");
            for (Object i : map.keySet()) {
                System.out.println(i.toString());
            }

        }
        System.out.println();
    }

    //Menu 6
    public void getAllKeys() {
        if (map.size() == 0) {
            System.out.println("The HashMap is Empty!");
        } else {
            for (Object i : map.values()) {
                System.out.println("List of Keys:");
                System.out.println(i.toString());
            }
        }
        System.out.println();
    }

    //Menu 7
    public void removeFromHashMap(String value) {
        if (map.containsKey(value) == true) {
            map.remove(value);
            System.out.println("Value Removed\n");
        } else {
            System.out.println("The following value " + value + " was not found in the HashMap\n");
        }
    }

    public void run_Program() {
        System.out.println("Welcome to the Assignment 4: HashMap");

        while(true){

        System.out.println("Please choose from the following Menu options.");
        System.out.print("""
                Menu:                
                1 - Add a new a value and a Key
                2 - Contains Key
                3 - Contains Value
                4 - Get Key
                5 - The list of all Values
                6 - The list of all Keys
                7 - Remove a specif value
                8 - Exit Program
                Answer: """);

        String choice = user_input.nextLine();
        if (choice.equals("1")) {
            System.out.print("Enter the Value: ");
            String val = user_input.nextLine();

            System.out.print("Enter the Key: ");
            int key = user_input.nextInt();
           System.out.println(addToHashMap(val, key));

        }
        else if (choice.equals("2")) {
            System.out.print("Enter the Value and it will return if it is on the HashMap: ");
            String value = user_input.nextLine();
            System.out.println(containsKey(value));
        }
        else if (choice.equals("3")) {
            System.out.print("Enter the Key and if it is assigned to a value in the system it will return its Value: ");
            int key = user_input.nextInt();
            user_input.nextLine();
            System.out.println(containsValue(key));
        }
        else if (choice.equals("4")) {
            System.out.print("Enter the Value and if it is in the system it will return its key: ");
            String value = user_input.nextLine();
            getKey(value);
        }
        else if (choice.equals("5")) {
            getAllValues();
        }
        else if (choice.equals("6")) {
           getAllKeys();

        }
        else if (choice.equals("7")) {
            System.out.print("Enter the Value which will be removed from the HashMap if found: ");
            String value = user_input.nextLine();
            removeFromHashMap(value);
        }
        else if (choice.equals("8")) {
            break;
        }
        else{
            System.out.println("Invalid Option!");
        }
            }

        }

}






