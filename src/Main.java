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

