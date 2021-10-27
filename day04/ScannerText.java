import java.util.Scanner;
public class ScannerText {
  public static void main(String[] arguments) {
    Scanner scan = new Scanner(System.in);
    System.out.println("请输入你的姓名：");
    String name = scan.next();

    System.out.println("请输入你的年龄：");
    int age = scan.nextInt();

    System.out.println("你的姓名是：" + name + "，你的年龄是：" + age);
  } 
}
