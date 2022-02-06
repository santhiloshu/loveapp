package immutability;

//import org.omg.SendingContext.RunTime;

public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime runtime=Runtime.getRuntime();
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());
		runtime.gc();
		

	}

}
