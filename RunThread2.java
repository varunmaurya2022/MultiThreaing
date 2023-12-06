class Thread1 implements Runnable {
   int x;

   public void run() {
      for (int i = 1; i <= 10; i++) {
         System.out.println(Thread.currentThread().getName() + ' ' + x);
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
         }
      }
      System.out.println(Thread.currentThread().getName() + " dead");
   }
}

public class RunThread2 {
   public static void main(String... args) {
      Thread1 t1 = new Thread1();
      t1.x = 50;
      Thread tt1 = new Thread(t1, "thread1");
      tt1.start();

      Thread1 t2 = new Thread1();
      t2.x = 100;
      // Thread tt2 = new Thread(t2, "thread2");
      Thread tt2 = new Thread(t1, "thread2");
      tt2.start();

      Thread1 t3 = new Thread1();
      t3.x = 150;
      // Thread tt3 = new Thread(t3, "thread3");
      Thread tt3 = new Thread(t1, "thread2");
      tt3.start();
      for (int i = 1; i <= 5; i++) {
         System.out.println(Thread.currentThread().getName());
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
         }
      }
   }
}