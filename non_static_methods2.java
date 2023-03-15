public class non_static_methods2{
    public static void main(String[] args) {
        NonStatics ns = new NonStaics();//initiation

        System.out.println(ns.x);
        System.out.println(ns.a);
        System.out.println(ns.name);
        System.out.println("qspiders global");
        ns.nonStatics();
        System.out.println(ns.x);
        
    }
}
    
    
    class NonStatics {
    {
        int a = 21; //local variable
        System.out.println("The value of a is : "+a);
        a=35;
        System.out.println("the modified value of a is: "+a);
    }
    int a =99;//single line non static initializer
    Double x;
    {
        System.out.println("the addition of two numbers");

        int x1 =20;
        double x =99.66;

        double sum = x+x1;
        System.out.println("the sum is: "+sum);
    }
    public void nonStatics()
    {
        System.out.println("hello this is from non Static method");
        x=99.99;
        System.out.println("the value of non Static variable x is: "+x);
    }
    String name = "Qspiders";
   
}
