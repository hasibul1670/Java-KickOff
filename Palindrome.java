// find that string is palindrome or not
// Madam->madam
// that->that


public class Palindrome {


  public boolean findPalindrome(String word) {
    char wordArray[] = word.toCharArray();
    int start = 0;
    int end = word.length() - 1;
    while (start < end) {
      if (wordArray[start] != wordArray[end]) {
        return false;
      }
      start++;
      end--;
    }
    return true;

  }

  public static void main(String[] args) {
    Palindrome value = new Palindrome();
    String word = "madam";
    System.out.println(value.findPalindrome(word));

  }
}
