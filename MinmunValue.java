public class MinmunValue {


  public int findMinimum() {
    int[] array = {15, 54, 87, 45, 36, 45,2};
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }
  public static void main(String[] args) {
    MinmunValue value = new MinmunValue();
    int MinValue = value.findMinimum();
    System.out.println("minimum Value : " + MinValue);
  }

}


