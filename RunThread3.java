class Thread1 extends Thread {

   Thread1(String s) {
      super(s);
      // start
   }

   public void run() {
      for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
         }
      }
      System.out.println(getName() + " dead");
   }
}

class Thread2 extends Thread {

   Thread2(String s) {
      super(s);
      // start()
   }

   public void run() {
      for (int i = 1; i <= 10; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
         }
      }
      System.out.println(getName() + " dead");
   }
}

public class RunThread3 {
   public static void main(String... args) {
      Thread1 t1 = new Thread1("Thread1");
      Thread2 t2 = new Thread2("thread2");
      t1.start();
      t2.start();
      for (int i = 1; i <= 20; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(1000);
         } catch (Exception e) {

         }
      }
      System.out.println(Thread.currentThread().getName() + " dead");

   }
}
