public class Person {
    String name;
    int age;
    int sex;
    Pet pet;
/*
   Person(String name, int age, String sex){
      this.name = name;
      this.age = age;
      this.sex = sex;
   }
*/
   String getName(){
        if (sex == 1){
            return "Mr." + name;
        } else {
            return "Ms." + name;
        }
    }

    boolean IsAdult(){
       return age >=21;
    }

    String getPetName(){
       return pet.name;
    }

    public void setName(String name){
        this.name = name;
    }
 }
