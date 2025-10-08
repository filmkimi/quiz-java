import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("weight :");
        int weight = sc.nextInt();

        System.out.print("length :");
        int length = sc.nextInt();

        int rectangle = weight * length;
        System.out.print("rectangle :"+ rectangle);
        sc.close();
    }
}