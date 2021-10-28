import java.util.Scanner;
/**
 * 彩票案例
 * 随机生产2个数 eg:74
 * 1.用户输入数字和实际实随机数数字一样顺序一样；给10k eg:74
 * 2.输入数字一样，顺序不一样；给3k eg:47
 * 3.输入中一个数字一样，顺序也一样；给1k eg:94
 * 4.输入中一个数字一样，顺序不一样；给0.5k eg:49
 */
public class LotteryDemo {
  public static void main(String[] args) {
    String RandomNumString = (int)(Math.random() * 90 + 10) + ""; // [10,100)

    System.out.println("请输入2个数字，范围[10,99] " + RandomNumString);
    Scanner scan = new Scanner(System.in);
    String numStirng = scan.next();
    
    System.out.println(RandomNumString + " " + numStirng);
    if (numStirng.equals(RandomNumString)) {
      System.out.println("一等奖！10k！");
      return;
    }

    char numStringFirst = numStirng.charAt(0);
    char numStringSecond = numStirng.charAt(1);
    if (RandomNumString.equals(numStringSecond + "" + numStringFirst)) {
      System.out.println("二等奖！3k！");
      return;
    }

    char RandomNumStringFirst = RandomNumString.charAt(0);
    char RandomNumStringSecond = RandomNumString.charAt(1);
    // System.out.println(RandomNumStringFirst + " " + RandomNumStringSecond + " " + numStringFirst + " " + numStringSecond);
    if (RandomNumStringFirst == numStringFirst || RandomNumStringSecond == numStringSecond) {
      System.out.println("三等奖！1k！");
      return;
    }

    if (RandomNumStringFirst == numStringSecond || RandomNumStringSecond == numStringFirst) {
      System.out.println("四等奖！0.5k！");
      return;
    }
    
    System.out.println("屁都没有～～～");
  }
} 
