import java.util.Scanner;
public class preson {
    String name;
    int age;
    
    preson(String name, int age){
        this.name = name;
        this.age = age;
                
    }
    preson(){
        
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        preson [] p = new preson[3];
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Input your name " + i + " : ");
            String n = sc.next();
            System.out.print("Input your age " + i + " : ");
            int a = sc.nextInt();
            
            p[i - 1] = new preson(n, a);
        }
        System.out.println("---------Reselt-----------");
        for (preson people : p) {
            System.out.println("Name : " + people.name + "and" + "Age : " + people.age);
        }
    }
}
       