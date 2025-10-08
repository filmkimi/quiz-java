import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 1;
    int sum = 0;
    while (count <= 5) {
        System.out.print("กรอกตัวเลขที่" + count + ":");
        int num = sc.nextInt();
        sum += num;
        count++; 
    }    
    System.out.println("Sum : " + sum);   

    sc.close();
    }
    
}
