class Thread1 extends Thread{
	Thread1(String s){
		super(s);
		//start(); Start run method while object create
	}
	public void run(){
		for (int i=1;i<=5;i++){
			System.out.println(getName());
				try{
				Thread.sleep(2000);
			}
			catch(Exception e){
				
			}
		}
	}
}
class Thread2 extends Thread{
	Thread2(String s){
		super(s);
	}
	public void run(){
		for (int i=1; i<=10;i++){
			System.out.println(getName());
				try{
				Thread.sleep(2000);
			}
			catch(Exception e){
				
			}
		}
	}
}
class Thread3 extends Thread{
	Thread3(String s){
		super(s);
	}
	public void run(){
		for (int i=1; i<=15;i++){
			System.out.println(getName());
				try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				
			}
			
			
			
		}
	}
}
public class RunThread{
	public static void main(String... args){
		Thread1 t1=new Thread1("Thread1");
		Thread2 t2=new Thread2("Thread2");
		Thread3 t3=new Thread3("Thread3");
		t1.start();
		t2.start();
		t3.start();
		
		for (int i=1; i<=5; i++){
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				
			}
		}
	}
}