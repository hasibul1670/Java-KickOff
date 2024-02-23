public class ReturnOdd {


  public void retunOdd() {
    int[] array = {50, 10, 15, 20, 25,99,78,95,15};
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 !=0) {
        System.out.print(array[i] + " ");
      }
    }
  }

  public static void main(String[] args) {
    ReturnOdd printOdd = new ReturnOdd();
    printOdd.retunOdd();
  }
}
