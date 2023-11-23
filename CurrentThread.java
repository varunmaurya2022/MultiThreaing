public class CurrentThread{
	public static void main(String args[]){
		Thread t=Thread.currentThread();
		System.out.println("Current Thread "+t);
		
		//change the name of the thread
		
		t.setName("My Thread");
		
		System.out.println("After change the name "+t);
		
		try{
			for (int n=4;n>0;n--){
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
				System.out.println("Main Thread Interrupted!");
			}
	}
}