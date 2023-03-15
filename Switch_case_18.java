import java.util.Scanner;

class switch_case {

    public static void main(String[] args) {
        System.out.println("enter a name");
        Scanner sc = new Scanner(System.in);
        String var = sc.next();

        switch (var) {
            case "kakashi":
                System.out.println("copy ninja");
                break;

            case "naruto":
                System.out.println("nine tail jincuriki");
                break;

            case "sasuke":
                System.out.println("mangekyou sharingan");
                break;

            case "tsunate":
                System.out.println("5th hokage");
                break;

        }
    }

}