package multiThreading;

public class Threadex1 {

	public static void main(String[] args) {
Runnable r=()->{
	for(int i=0;i<=10;i++)
	{
		System.out.println("run");
	}
	
	
};
Thread t=new Thread(r);
t.start();
for(int i=0;i<=10;i++)
{
	System.out.println("main");
}



	}

}
