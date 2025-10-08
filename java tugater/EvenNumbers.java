public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("เลขคี่ตั้งแต่ 1 ถึง 30:");
        for (int i = 1; i <= 30; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
