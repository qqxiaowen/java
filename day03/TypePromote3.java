/*
 * @Author: xiaoWen
 * @Date: 2021-10-26 10:51:23
 * @LastEditors: xiaoWen
 * @LastEditTime: 2021-12-22 14:09:45
 */
public class TypePromote3 {
  public static void main(String[] arguments) {
    /*
     * long l1 = 123123; // 不加L表示为右边是int类型，自动转化为l1，编译通过
     * long l2 = 12323321321312321312312; // 编译不通过，因为右边的数值超过了int存储范围
     * 
     * float f1 = 3.123; // 编译不通过，不加F表示为右边是double类型，自动转化不能double转float
     * byte b1 = 11;
     * byte result1 = b1 + 1; // 编辑不通过
     * float f1 = 3.14; // 编辑不通过
     * float f2 = 3.14F;
     * float result2 = f2 + 1.2; // 编辑不通过
     */
  }
}

class testByte {
  public static void main(String[] args) {
    byte b1 = 127;
    byte b2 = 1;
    byte result = (byte) (b1 + b2);
    System.out.println(result);
  }
}
