// 4,7,3,4,8,1
// 7,8,4,8,-1,-1
// travers array from arr.length-1 ; i-- <--
// make a stack name" hasib "to store temp value
// execute for loop end --> start in array
// while loop verify 2 conditions
// stack is not empty
// stack.peek <=current element
// if true => stack.pop()
// if stack empty ==> result[i] = -1;
// else ==> result[i] = stack.peek();



import java.util.Stack;

public class NextGreaterElement {
  public static void printArray(String m,int[] arr) {
    System.out.print(m);
    for (int num : arr) {
      System.out.print( num + " ");
    }
    System.out.println();
  }

  public static int[] nextGreaterElement(int[] arr) {
    int n = arr.length;
    int[] result = new int[n];

    Stack<Integer> hasib = new Stack<>();

    for (int i = n - 1; i >= 0; i--) {
      while (!hasib.isEmpty() && arr[hasib.peek()] <= arr[i]) {
        hasib.pop();
      }
      if (hasib.isEmpty()) {
        result[i] = -1;
      } else {
        result[i] = arr[hasib.peek()];
      }
      hasib.push(i);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println("Next Greater Element -->");
    System.out.println("Inserted: ");
    int[] arr = {4, 7, 3, 4, 8, 1};
    int[] result = nextGreaterElement(arr);
    printArray("insert : " , arr);
    printArray("output : " , result);
  }
}
