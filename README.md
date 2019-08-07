### Studying Java
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
public class Person {
    String name;
    int age;
    String sex;
/*
   Person(String name, int age, String sex){
      this.name = name;
      this.age = age;
      this.sex = sex;
   }
*/
   String getName(){
        if (this.sex.equals("m")){
            return "Mr." + this.name;
        } else {
            return "Ms." + this.name;
        }
    }
    public void setName(String name){
        this.name = name;
    }
 }
```
* [x] Fibonacci sequence
```java
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
```
* [x] Average in array
```java
public class Main {
  public static void main(String[] args) {
    int []arr = {1,2,3,4,5,6,7,8,9, 1};
    double av = 0;
    for (int i = 0; i < arr.length; i++){
      av += arr[i];
    }
    av = av / arr.length;
    System.out.println(av);
  }
}
```
* [x] Count elements in array
```java
public class Main {
  public static void main(String[] args) {
    int [][] arr = {{1,2,3,4},{5,6,7},{8},{9, 10}};
    int k = 0;
    for (int i = 0; i < arr.length; i++){
      k += arr[i].length;
    }
     System.out.println(k);
  }
}
```
* [x] Count words in array that doesn't contains letter 'e'
```java
public class Main {
  public static void main(String[] args) {
    String[][] arr = {{"Привет", "всем", "кто"}, {"изучает", "язык", "пограммирования", "java"}};
    int n = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (!arr[i][j].contains("е")) {  // (arr[i][j].indexOf('е') == -1)
          n++;
        }
      }
    }
    System.out.print(n);
  }
}
```

* [x] getter GetSide() and a setter SetSide(int num)
> Create a public class called Cube without a constructor which gets one single private Integer variable Side, a getter GetSide() and a setter SetSide(int num) method for this property. Actually, getter and setter methods are not the common way to write this code in C#. In the next kata of this series, we gonna refactor the code and make it a bit more professional... Note: There's no need to check for negative values!
```java
public class Cube {
   int Side;
    int getSide(){
       return Side;
    }
    public void setSide(int Side){
        this.Side = Side;
    }
}
public class Main {
  public static void main(String... args) {
    Cube c = new Cube();
    c.setSide(5);
    System.out.println(c.getSide());
  }
}
```


