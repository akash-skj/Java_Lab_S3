import java.util.Scanner;
class parent{
    void dispP(){
        System.out.println("This is parent class");
    }
}
class child extends parent{
    void dispC(){
        System.out.println("This is child class");
    }
}
public class Inherit {
  
    public static void main(String[] args) {
        //display parent method using obj of parent class
        parent objParent = new parent();
        objParent.dispP();

        //display child method using obj of child class
        child objChild = new child();
        objChild.dispC();

        //display parent method using obj of child class
        objChild.dispP();
    }
    
}
