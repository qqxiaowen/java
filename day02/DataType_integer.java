class DataType_integer {
  public static void main(String[] arguments) {
    byte b1 = 127;
    short s1 = 1000;
    int i1 = 2000;
    long l1 = 3000L;
    System.out.println(b1);
    System.out.println(s1);
    System.out.println(i1);
    System.out.println(l1);

    float f1 = 12.345F;
    double d1 = 123.45;
    System.out.println(f1);
    System.out.println(d1);

    char c1 = '我';
    char c2 = '\n';
    System.out.print(c1);
    System.out.print(c2);

    boolean bo1 = true;
    System.out.print(bo1 ? "存在" : "不存在");
  }
}