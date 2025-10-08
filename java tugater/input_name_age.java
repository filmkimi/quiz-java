import java.util.Scanner;
public class input_name_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input your name : ");
        String name = sc.nextLine();

        System.out.print("input your age : ");
        String age = sc.nextLine();

        System.out.print("สวัสดี "+ name);
        System.out.print(" คุณอายุ "+ age + " ปี");
        sc.close();
    }
}
