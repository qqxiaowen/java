import java.util.Scanner;

//class switchText1 {
//   public static void main(String[] args) {
//     switch(232L) { // 报错
//     }
//   }
// }

class switchText2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    char c1 = word.charAt(0);
    char result = ' ';
    switch(c1) {
      case 'a': result = 'A';
        break;
      case 'b': result = 'B';
        break;
      case 'c': result = 'C';
        break;
      case 'd': result = 'D';
        break;
    }
    System.out.println(result);
  }
}
