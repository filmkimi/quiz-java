import java.util.Scanner;
public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("weight :");
        double weight = sc.nextDouble();
        
        System.out.print("height(cm) :");
        double heightcm = sc.nextDouble();
        double heightM = heightcm/100;
        double BMI = weight / (Math.pow(heightM,2));
        System.out.printf("BMI : %.2f\n", BMI);
        
        if (BMI < 18.5 ) {
            System.out.println("อยู่ในเกณฑ์ : ต่ำกว่าเกณฑ์");
        }
        else if (BMI < 23) {
            System.out.println("อยู่ในเกณฑ์ : ปกติ");
        }
        else if (BMI < 25) {
            System.out.println("อยู่ในเกณฑ์ : เกินมาตรฐาน");
        }
        else if (BMI < 30) {
            System.out.println("อยู่ในเกณฑ์ : โรคอ้วนระดับ 1");
        }
        else {
            System.out.println("อยู่ในเกณฑ์ : โรคอ้วนระดับ 2");
        }
        sc.close();
    }
}