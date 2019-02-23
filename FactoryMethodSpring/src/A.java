public class A {
  private static final A ob = new A();

  private A() {
    System.out.println("private constructor!");
  }

  /*工厂方法:产生了对象的方法*/
  public static A getOb() {
    System.out.println("factory method!");
    return ob;
  }

  public void msg() {
    System.out.println("hello user");
  }
}
