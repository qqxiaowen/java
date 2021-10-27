import java.util.Scanner;
public class sortText {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("请输入第一个数：");
    int num1 = scan.nextInt();
    System.out.print("请输入第二个数：");
    int num2 = scan.nextInt();
    System.out.print("请输入第三个数：");
    int num3 = scan.nextInt();
    int middleVar;
    if (num1 < num2) { // 保证num1 > num2
      middleVar = num1;
      num1 = num2;
      num2 = middleVar;
    }
    if (num3 > num2) {
      System.out.println("输入的数从大到小依次是a：" + num3 + " " + num1 + " " + num2);
    } else if (num3 < num1) {
      System.out.println("输入的数从大到小依次是b：" + num1 + " " + num2 + " " + num3 );
    } else {
      System.out.println("输入的数从大到小依次是c：" + num1 + " " + num3 + " " + num2 );
    }
  }
}
