import java.util.Scanner;

public class Calculate_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your buy : ");
        double elite = sc.nextDouble();

        if (elite >= 1000) {
            double discount = elite * 0.9; 
            System.out.println("Total after discount : "+ discount + "bath");
        }
       sc.close();
    }
}
