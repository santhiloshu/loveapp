package multiThreading;
class MyThread1 extends Thread
{
	
	public void run()
	{
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("child");
		}
		try {
			Thread.currentThread().sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Threadex2 {

	public static void main(String[] args) throws InterruptedException {

MyThread1 th=new MyThread1();
th.start();
th.interrupt();


for(int i=0;i<=10;i++)
{
	System.out.println("main");
}

	}

}
