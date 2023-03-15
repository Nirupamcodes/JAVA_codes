public class methods_2 {
    public static void potato(){
    System.out.println();
}

public static void tomato(float x){
    System.out.println(x);
    x=99;
    System.out.println(x);
}
public static float carrot(int s){
    return s;

}
public static double brinjal(float c,float d)
{
    return c+d;
}

public static int spanish(int a, int b)
{
    return a-b;
    
}

public static void main(String[] args) {
    System.out.println("start");
    potato();
    tomato(9);
    System.out.println(carrot(21));
    System.out.println(brinjal(2.3f,9.9f));
    System.out.println(spanish(9,10));
}
    
}

