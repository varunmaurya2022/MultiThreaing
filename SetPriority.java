class Thread1 extends Thread {
   Thread1(String s) {
      super(s);
   }

   public void run() {

   }
}

class Thread2 extends Thread {
   Thread2(String s) {
      super(s);
   }

   public void run() {

   }
}

public class SetPriority {
   public static void main(String... args) {
      System.out.println(Thread.currentThread().getPriority());
      Thread.currentThread().setPriority(10);
      System.out.println(Thread.currentThread().getPriority());
      Thread1 t1 = new Thread1("thread1");
      Thread2 t2 = new Thread2("thread2");
      System.out.println(t1.getPriority());
      System.out.println(t2.getPriority());
      t1.setPriority(5);
      t2.setPriority(5);
      System.out.println(t1.getPriority());
      System.out.println(t2.getPriority());
      System.out.println(Thread.currentThread().getPriority());

   }

}
