
public class SecondMax {

  public int[] findSecondMax() {
    int[] array = {1332, 34, 21, 34, 33, 1};
    int max = Integer.MIN_VALUE; // -2147483648
    int secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        secondMax = max;
        max = array[i];
      } else if (array[i] > secondMax && array[i] != max) {
        secondMax = array[i];
      }
    }
    return new int[] {max, secondMax};
  }

  public static void main(String[] args) {
    SecondMax secondMaxValue = new SecondMax();
    int[] result = secondMaxValue.findSecondMax();
    System.out.println("Max: " + result[0]);
    System.out.println("Second Max: " + result[1]);



  }
}
