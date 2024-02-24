// Move All Zero End of Array
// Input -> [0,1,0,4,12]
// Output -> [1,4,12,0,0]
// 2 pointer i=nonZero,j=0
public class MoveZero {
  public static void printArray(String name, int[] arr) {
    System.out.print(name + " [" + " ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.print("]");
    System.out.println();
  }

  public int[] moveZero() {
    int[] array = {8, 1, 0, 5, 0, 3};
    printArray("Inserted Array :", array);
    int nonZeroIndex = 0;
    for (int i = 0; i < array.length; i++) {//4
      if (array[i] != 0) {
        int temp = array[i]; //t=8
        array[i]=array[nonZeroIndex];//a[i]=0
        array[nonZeroIndex] = temp;
        nonZeroIndex++;//4
      }

    }
    return array;

  }

  public static void main(String[] args) {
    MoveZero value = new MoveZero();
    int[] res = value.moveZero();
    printArray("Moved Array : ", res);
  }
}
