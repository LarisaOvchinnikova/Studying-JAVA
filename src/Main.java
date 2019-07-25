public class Main {

    public static void main(String[] args) {

      int n = 10;
      int f0 = 0;
      int f1 = 1;
      System.out.println(f0);
      System.out.println(f1);
      int f2;
      for (int i = 2; i <= n; i++) {
        f2 = f0 + f1;
        System.out.println(f2);
        f0 = f1;
        f1 = f2;
      }
    }
}

