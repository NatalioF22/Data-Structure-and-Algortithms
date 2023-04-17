import javax.swing.text.StyledEditorKit.BoldAction;

public class problem_8{
    String name;
    int age;
    boolean hasCar;
    //default constructor
    public problem_8(String name,int age,boolean hasCar){
        this.name = name;
        this.age = age;
        this.hasCar = hasCar;
    }
    public problem_8(){
        this.name = "Natalio";
        this.age = 20;
        this.hasCar = false;
    }

    public void AgeStatus(){
        if (this.age<25){
            System.out.println("Your are getting old");
        }
        else{
            System.out.println("You are still young");
        }
    }
    public void Naming(){
        if(this.name.length()>5){
            System.out.println("You have a short first name");
        }else{
            System.out.println("You have a long first name");
        }
    }

}