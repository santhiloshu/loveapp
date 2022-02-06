package object;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StudentObjects {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//# using new Operator
		Student std1=new Student("santhi",1);
		//using Class class newinstance()
	Class Stu=	Class.forName("object.Student");
	Student std2=(Student) Stu.newInstance();
	System.out.println(std2);
	
	
	
		

	}

}
