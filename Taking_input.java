import java.util.Scanner;

class Taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner s = new Scanner(System.in);
        // System.out.println("enter num 1");
        // int a = s.nextInt();
        // System.out.println("enter num 2");
        // int b = s.nextInt();

        // int sum = a + b;

        // System.out.println("the sum of these number is = ");
        // System.out.println(sum);

        String str = s.nextLine();
        System.out.println(str);
    }
}