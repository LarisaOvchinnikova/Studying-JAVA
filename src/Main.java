public class Main {
  public static void main(String... args) {
    Rectangle a = new Rectangle(4, 9);
   System.out.println(a.getWidth());
    System.out.println(a.getLength());
    Rectangle b = new Rectangle(3, 6);
    System.out.println(b.getWidth());
    System.out.println(b.getLength());
    System.out.println(a.getArea());
    System.out.println(b.getArea());
    a.setWidth(20);
    a.setLength(30);
    System.out.println(a.getWidth());
    System.out.println(a.getLength());
    System.out.println(a.getArea());
    System.out.println("-----");
    b.setWidth(40);
    b.setLength(50);
    System.out.println(b.getWidth());
    System.out.println(b.getLength());
    System.out.println(b.getArea());
   Triangle t1 = new Triangle(3, 4, 5);
   System.out.println(t1.getPerimetr());
   Rectangle c = new Rectangle(12, 15);


  }
}

