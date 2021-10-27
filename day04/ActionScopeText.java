public class ActionScopeText {
  public static void mian(String[] arguments) {
    if (true) {
      int num = 10;
    }
    int num = 10;
    System.out.println(num); // 块作用域，{}区分
  }
}
