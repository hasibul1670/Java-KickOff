import java.util.EmptyStackException;

public class Stack {
  private stackNode top;
  private int length;

  public class stackNode {
    private int data;
    private stackNode next;

    public stackNode(int data) {
      this.data = data;

    }
  }

  public Stack() {
    top = null;
    length = 0;
  }

  public int length() {
    return length;
  }

  public boolean isEmpty() {
    return length == 0;

  }

  public void push(int data) {
    stackNode temp = new stackNode(data);
    temp.next = top;
    top = temp;
    length++;
  }

  public int pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    int res = top.data;
    top = top.next;
    length--;
    return res;
  }

  public int peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return top.data;
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(10);
    stack.push(15);
    stack.push(20);

    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());
    stack.pop();
    System.out.println(stack.peek());

  }



}
