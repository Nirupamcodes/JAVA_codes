
class methods
{
  public static void setting(int a)
  {
    System.out.println(a);
  }

  public static int setting(int x,int y)
  {
    System.out.println(x);
    return y;
  }

  public static double add(int w, int s)
  {
    return w+s;
  }

  public static double adds(double f, double u)
  {
    return f+u;
    
  }

  public static void main(String[] args) {
    setting(10);
    setting(5,4);
    add(5,8);
    adds(20,30);
    
  }
}