public class Main {
  public static void main(String[] args) {
    String[][] arr = {{"Привет", "всем", "кто"}, {"изучает", "язык", "пограммирования", "java"}};
    int n = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (!arr[i][j].contains("е")) {
          n++;
        }
      }
    }
    System.out.print(n);
  }
}

