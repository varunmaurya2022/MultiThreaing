class Thread1 extends Thread {
   Thread1(String s) {
      super(s);
   }

   public void run() {
      for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
         }
      }
      System.out.println("Thread 1 class run Completed!");
   }
}

class Thread2 extends Thread {
   Thread2(String s) {
      super(s);
   }

   public void run() {
      for (int i = 1; i <= 10; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
         }
      }
      System.out.println("Thread 2 class run Completed!");
   }
}

class Thread3 extends Thread {
   Thread3(String s) {
      super(s);
   }

   public void run() {
      for (int i = 1; i <= 15; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
         }
      }
      System.out.println("Thread 3 class run Completed!");
   }
}

public class CallRun {
   public static void main(String... args) {
      Thread1 t1 = new Thread1("thread1");
      Thread2 t2 = new Thread2("thread2");
      Thread3 t3 = new Thread3("thread3");
      t2.run();
      t1.run();
      t3.run();
      for (int i = 1; i <= 20; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
         }
      }
      System.out.println("main dead");
   }
}
