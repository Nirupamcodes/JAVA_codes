public class non_static_Methods {

    public static void main(String[] args) {

        NonStatic var = new NonStatic();
        System.out.println("single line Non static variable is -"+var.a);
        System.out.println("value 0f Single line non Static initializer x is"+var.x);
        var.nonStaticMenmber();
    }
    
}

class NonStatic
{
int a;
String x = "this is single line non  static String";
public void nonStaticMenmber()//non Static method
{
    System.out.println("Hello from non Static Method!");
}

{
    //Multi line non Static intializer
    System.out.println("hello from multiline non static initializer");
}
}
