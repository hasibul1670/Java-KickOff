public class ResizeArray {

  public int[] resize(int[] array, int capacity) {
    int[] temp = new int[capacity];
    for (int i = 0; i < array.length; i++) {
      temp[i] = array[i];

    }
    array = temp;
    return array;
  }

  public static void main(String[] args) {
    ResizeArray value = new ResizeArray();
    int[] oArray = new int[] {5, 4, 8};
    System.out.println("Size : " + oArray.length);
    oArray = value.resize(oArray, 10);
    System.out.println("ReSize  : " + oArray.length);
  }
}
