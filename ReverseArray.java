public class ReverseArray {

  public void printArray(String name, int[] arr) {
    System.out.print(name + "[" + " ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.print("]");
    System.out.println();
  }

  public void createReverseMethod() {
    int[] array = {4, 8, 9, 10, 15, 20, 25};
    printArray("Inserted Array : ", array);
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    } ;
    printArray("Reversed Array : ", array);

  }

  public static void main(String[] args) {
    ReverseArray reverse = new ReverseArray();
    reverse.createReverseMethod();
  }

}
