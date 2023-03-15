import java.util.Scanner;
public class cwh_preactise_set {

    public static void main(String[] args) {
        // int n=4;
        for(int i=n;i>0;i--){
        for(int j=0;j<i;j++){
        System.out.print("*");
        }
        System.out.print("\n");

        }

        problem 2
        int i = 1;
        int j = 0;
        while (i <= 10) {
        if (i % 2 == 0) {
        System.out.println(i);
        j = j + i;
        }
        i++;

        }

        System.out.println("result = " + j);

        program 3

        int i=3;
        int j=1;
        int c=0;
        while(j<=10){
        c = i*j;
        System.out.println(c);
        j++;
        }

        program 4

        int i = 5;

        for (int c = 1; c <= 10; c++) {
        System.out.println(c * i);
        }

        program 5;

        int i=10;
        for(int c=10;c>=1;c--){
        System.out.println(i*c);
        }


        problem 5

        
        System.out.println("Enter the number whose factorial you want:");
                Scanner sc = new Scanner(System.in);
                int fac = 1;
                int n = sc.nextInt();
                for (int i = n;i>=1;i--){
                    fac = (fac*i);
                }
                System.out.printf("Factorial of %d = %d",n,fac);
        
        
    }
}
