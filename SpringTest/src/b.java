public class b {
  public static void main(String[] args) {
int n=8;
    int m=6;
    System.out.println(n);
    System.out.println(m);
  try{
    int x=0;
    int y=5;
    System.out.println(y/x);
  }catch(Exception e){
  System.out.println(e);
  }
finally {
    System.out.println("y/x分母为0无意义！！");
  }

  }
}
