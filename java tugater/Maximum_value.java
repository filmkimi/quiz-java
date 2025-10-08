import java.util.Scanner;
public class Maximum_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int max = Integer.MAX_VALUE;
        while (count <= 5) {
            System.out.print("กรอกตัวเลขที่" + count + ":");
            int value = sc.nextInt();
            if (value > max) {
            max = value;
        }
        count++;
        }
        System.out.println("ค่ามากที่สุดคือ:"+ max);
        sc.close();
    }
}
