import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your temperature : ");
        double temperature = sc.nextDouble();
        if (temperature > 35) {
            System.out.println("very hot");
        }
        else if (temperature > 25 && temperature < 35){
            System.out.println("Normal weather");
        }
        else {
            System.out.println("cool");
        }
        sc.close();
    }
}
