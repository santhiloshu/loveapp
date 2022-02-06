package immutability;

public class ImmutabilityTest {

	public static void main(String[] args) {
		Address address=new Address("bng","karnataka");
		Student student =new Student(1,"santhi",address);
		System.out.println(student);
		Address address2=student.getAddress();
		System.out.println(address2);
		address2.setCity("hyd");
		System.out.println(student);
		System.out.println(address.hashCode());
		System.out.println(address2.hashCode());
		System.out.println(address2);

	}

}
