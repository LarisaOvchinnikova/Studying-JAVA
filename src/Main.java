public class Main {

    public static void main(String[] args) {

      Person p1 = new Person();
      p1.name = "Anna";
      p1.age = 32;
      p1.sex = "f";

      Person p2 = new Person();
      p2.name = "Artem";
      p2.age = 47;
      p2.sex = "m";

      System.out.println(p1.name);
      System.out.println(p2.name);

      System.out.println(p1.getName());
      System.out.println(p2.getName());

      p1.setName("Amelia");
      System.out.println(p1.getName());
      p1.setName("Larisa");
      System.out.println(p1.getName());
    }
}

