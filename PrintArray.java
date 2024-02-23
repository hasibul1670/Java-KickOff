public class PrintArray {


  public void printArray(int[] arr) {
    // 5,8,7,9,2
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }


  public void createMyArray() {
    int[] numbers = new int[5];
    numbers[0]=5;
    numbers[2]=7;
    numbers[3]=8;
    numbers[4]=1;
    numbers[0]=17889;
    printArray(numbers);

  }


  public static void main(String[] args) {
    PrintArray instanseName = new PrintArray();
    instanseName.createMyArray();
  }

}
