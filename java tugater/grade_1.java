import java.util.Scanner;
public class grade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Score : ");
        double score = sc.nextDouble();

        if (score <= 100 && score >= 80) {
            System.out.println("grade : A");
        }
        else if (score <= 79 && score >= 70) {
            System.out.println("grade : B");
        }
        else if (score <= 69 && score >= 60) {
            System.out.println("grade : C");
        }
        else if (score <= 59 && score >= 50) {
            System.out.println("grade : D");
        }
        else {
            System.out.println("grade : F");
        }
        sc.close();
    }
}
