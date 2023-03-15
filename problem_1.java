
import java.util.Scanner;

class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("marks is english ");
        int a = sc.nextInt();

        System.out.println("marks is hindi ");
        int b = sc.nextInt();

        System.out.println("marks is Maths ");
        int c = sc.nextInt();

        System.out.println("marks is science ");
        int d = sc.nextInt();

        System.out.println("marks is social science ");
        int e = sc.nextInt();

        float add = ((a + b + c + d + e));
        float divide = add / 500;

        float percentage = divide * 100;

        System.out.println("total percentage = ");
        System.out.println(percentage);

    }
}