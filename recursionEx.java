public class recursionEx {

    public static void disp(int a)
    {
        System.out.println(a);
        disp(10);
    }
    public static void main(String[] args) {
        disp(10);
    }
}
