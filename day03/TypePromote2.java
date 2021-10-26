public class TypePromote2 {
  public static void main (String[] arguments) {
    short s1 = 128;
    byte result1 = (byte)s1; // -182
    System.out.println(result1);

    double d1 = 12.345;
    int result2 = (int)d1; // 损失精度
    System.out.println(result2);
  }
}
