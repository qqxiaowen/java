import java.util.Scanner;
public class DogAgeDemo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("请输入狗的年龄：");
    double num = scan.nextDouble();
    if (num < 0) {
      System.out.println("请输入正数！");
      return;
    }
    if (num <= 2 ) {
      System.out.println("相当于人的：" + (num * 10.5) + "岁！");
    } else {
      double twoLeftYear = 2 * 10.5;
      System.out.println("相当于人的：" + ((num - 2) * 4 + twoLeftYear) + "岁！");
    }
  }
}