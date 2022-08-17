import java.util.Scanner;

/*
 * @Author: xiaoWen
 * @Date: 2021-12-07 11:01:21
 * @LastEditors: xiaoWen
 * @LastEditTime: 2021-12-07 11:24:14
 */
class WhiteText {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      i++;
      System.out.println("i: " + i);
    }
  }
}

class DoWhiteText {
  public static void main(String[] args) {
    int i = 0;
    do {
      i++;
      System.out.println("i: " + i);
    } while (i < 10);
  }
}

/** 输入若干个整数，判断正数和负数出现的次数，当输入0时程序终止 */
class case1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int positiveNumber = 0; // 正数个数
    int negativeNumber = 0; // 负数个数

    while (true) {
      int i1 = scan.nextInt();
      if (i1 == 0) {
        break;
      }
      if (i1 > 0) {
        positiveNumber++;
      } else {
        negativeNumber++;
      }
    }

    System.out.println("positiveNumber: " + positiveNumber);
    System.out.println("negativeNumber: " + negativeNumber);
  }
}