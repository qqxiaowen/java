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
    short num1 = 8;
    int result1 = num1 >> 2;
    int result2 = num1 >>> 2;
    System.out.println(result1);
    System.out.println(result2);
  }
}

class BitText4 {
  public static void main(String[] args) {
    short num1 = -8;
    int result1 = num1 >> 2;
    int result2 = num1 >>> 2;
    System.out.println(result1);
    System.out.println(result2);
    /*
      -8的原码为: 1000 0000 0000 0000 0000 0000 0000 1000
      -8的反码为: 1111 1111 1111 1111 1111 1111 1111 0111
      -8的补码为: 1111 1111 1111 1111 1111 1111 1111 1000
      无符号右移的补码： 001111 1111 1111 1111 1111 1111 1111 10
      正数三码合一：
      无符号右移的反码： 0011 1111 1111 1111 1111 1111 1111 1110
      无符号右移的原码： 0011 1111 1111 1111 1111 1111 1111 1110
    */
  }
}