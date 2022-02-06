package methodReference;
interface Addfunction
{
	MethodReference add();
}
public class MethodReference {
	MethodReference()
	{
		System.out.println("constructor method ref");
	}

	
	public static void main(String[] args) {
		Addfunction add=MethodReference::new;
		add.add();
		
	}

}
