class BitText1 {
  public static void main(String[] args) {
    byte num = 8;
    System.out.println(num << 2); // 左移
    System.out.println(num >> 2); // 右移
  }
}

class BitText2 {
  public static void main(String[] args) {
    /** 位运算符类型默认转化为int */
    byte num = -8;
    byte result1 = (byte)(num << 2);
    byte result2 = (byte)(num >> 2);
    System.out.println(result1);
    System.out.println(result2);
  }
}

class BitText3 {
  public static void main(String[] args) {
    short num1 = 18;
    int result1 = num1 >> 2;
    int result2 = num1 >>> 2;
    System.out.println(result1);
    System.out.println(result2);
  }
}

class BitText4 {
  public static void main(String[] args) {
    short num1 = -18;
    int result1 = num1 >> 2;
    int result2 = num1 >>> 2;
    System.out.println(result1);
    System.out.println(result2);
  }
}