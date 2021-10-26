class demo1 {
  public static void main(String[] args) {
    boolean x = true;
    boolean y = false;
    short z = 42;
    if ((z++ == 42) && (y = true))
      z++;
    if ((x = false) || (++z == 45))
      z++;
    System.out.println(z);
  }
}

class demo2 {
  public static void main(String[] args) {
    boolean x = true;
    boolean y = false;
    short z = 42;
    if (y == true)
      if ((z++ == 42) && (y = true))
        z++;
    if ((x = false) || (++z == 45))
      z++;
    System.out.println(z);
  }
}

// 当byte、short、char之间做运算时，会自动转为int型
class demo3 {
  public static void main(String[] args) {
    short x = 10;
    byte b = 1;
    long l = 123123L;
    short result1 = (short) (x + x);
    short result2 = (short) (x+b);
    long result3 = b+l;
  }
}

// float 之间做运算，不会转为double
class demo4 {
  public static void main(String[] args) {
    float f1 = 3.14F;
    double d1 = 3.1415;
    float result1 = f1 + f1;
    double result2 = f1 + d1;
  }
}