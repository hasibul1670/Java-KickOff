
// findMissing Number
// input = [2,4,1,8,6,3,7]
// output = 5
// n*(n+1)/2
// 8*(8+1)/2 = 8*9/2 = 36
//
public class MissingNumber {
  public static void printArray(int[] array) {
    for (int num : array) {
      System.out.print(num + " ");
    }
  }

  public int findMissingNumber(int[] array) {
    int n = array.length + 1;
    int sum = n * (n + 1) / 2;
    for (int num : array) {
      sum = sum - num;
    }
    return sum;
  }

  public static void main(String[] args) {
    MissingNumber value = new MissingNumber();
    int[] array = {2, 4, 1, 8, 5, 3, 7};
    printArray(array);
    System.out.println();
    int res = value.findMissingNumber(array);
    System.out.println("Missing Number : " + res);

  }
}
