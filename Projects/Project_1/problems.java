
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class problems {
   
    //problem 1
    public void problem_1() {
        for(int i = 0; i <= 100; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    //problem 2
    public void problem_2() {
        int total = 0;

        try{
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.print("Enter a positive number one at a time: ");
            int num = input.nextInt();
            if(num==-1){
                System.out.println(total);
                break;
            }
            else if(num<-1){
                System.out.print("Only enter positive numbers!");
            }
            else{
                total+=num;
                
            }
        }
    
}
    catch(Exception e){
        System.out.println("The problem "+ e + " won't let");
    }
    }

    //problem 3

    public int forLoopSum(int num_1,int num_2){
        int total = 0;
        for (int i =0;num_1<num_2+1;num_1++){
            total+=num_1;
        }
        return total;
    }

    //problem 5
    public void problem_5() {
       
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a number ");
        String num = user_input.nextLine();
        try{
            int number = Integer.parseInt(num);
            System.out.println(number);
        }
        catch(NumberFormatException ee){
            System.out.println("Please enter only numbers! ");
        }
        }

    //problem 6
    public void problem_6() {

        // pass the path to the file as a parameter
        try{
        File file = new File("names.txt");
        Scanner sc = new Scanner(file);
    
        while (sc.hasNextLine()){
        System.out.println(sc.nextLine());}}
        catch(Exception ee){
            System.out.println("There was a problem reading this file");
        }
    }

    //problem 7
    public void problem_7(){
        try {  
            File new_file = new File("new_names.txt");  
            if (new_file.createNewFile()) {  
            System.out.println("File created: " + new_file.getName());  
            FileWriter write_file = new FileWriter(new_file.getName());
            
            File file = new File("names.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String names = sc.nextLine();
                
                write_file.write(names.substring(0, 1).toUpperCase()+ names.substring(1)+System.lineSeparator());

               
            }
            write_file.close();
            System.out.println("Successfully wrote to the file.");

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());}
              
            } else {  
              System.out.println("File already exists.");  
            }  
          } catch (IOException e) {
            System.out.println("An error occurred.");
            
          }  
    }
   

    
}