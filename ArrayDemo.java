public class ArrayDemo {

  public void printArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println(" ");
  }

  public void createArray() {
    int[] money = new int[5];
    money[0] = 5;
    money[1] = 2;
    money[2] = 4;
    money[3] = 9;
    money[4] = 18;
    printArray(money);
    System.out.println(money.length); // array length
    System.out.println(money[money.length - 1]); //last element

    int[] helloWorld = {5, 8, 45, 12};
    printArray(helloWorld);
  }


  public static void main(String[] args) {
    ArrayDemo moneyBank = new ArrayDemo();
    moneyBank.createArray();
  }

}
