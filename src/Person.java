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
