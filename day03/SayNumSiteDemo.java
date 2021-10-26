public class SayNumSiteDemo {
  public static void main (String[] arguments) {
    int num = 213;
    System.out.println("百位数是"+num/100);
    System.out.println("十位数是"+num/10%10);
    System.out.println("个位数是"+num%10);

    int n = 10;
    int m = 10;
    int result1 = n+ (++n) + (++n); // 10 + 11 + 12
    System.out.println("result: " + result1 + " n: " + n);
    int result2 = m+ (++m) + (m++); // 10 + 10 + 12
    System.out.println("result: " + result2 + " m: " + m);
  }
}
