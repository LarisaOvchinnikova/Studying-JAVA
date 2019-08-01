public class Main {
  public static void main(String... args) {
    Block b = new Block(new int[]{2,4,6});
    System.out.println(b.getWidth());
    System.out.println(b.getLength());
    System.out.println(b.getHeight());
    System.out.println(b.getVolume());
    System.out.println(b.getSurfaceArea());
  }
}

