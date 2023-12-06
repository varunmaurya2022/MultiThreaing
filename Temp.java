public class Temp {
   public static void main(String... args) {
      Thread t = Thread.currentThread();
      System.out.println(Thread.currentThread().getName());
      System.out.println(t.getName());
   }
}