### Studying Java
7-17-2019 in class
1. Creating class Person
1. Creating methods getName(), setName()
1. In Main() created instances of class Person

```java
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

~~~
---
7-21-2019 Homework



