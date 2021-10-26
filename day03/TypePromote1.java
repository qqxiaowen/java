class TypePromote1 {
  public static void main(String[] aStrings) {
    byte b1 = 1;
    char c1 = '我';
    short s1 = 10;
    int result1 = b1 + c1;
    int result2 = b1 + s1;
    int result3 = c1 + s1;
    int result4 = b1 + b1;
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
  }
}
