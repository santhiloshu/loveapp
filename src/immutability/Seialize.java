package immutability;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Ser1 implements Serializable
{
	int i=30;
	int j=40;
	private void writeObject(ObjectOutputStream oos) throws Throwable
	{
		oos.defaultWriteObject();
		int Newi=i*40;
		oos.writeObject(Newi);
		
	}
}
public class Seialize {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Ser1 t=new Ser1();
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.ser"));
		oos.writeObject(t);
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ser"));
		Ser1 t1=(Ser1) ois.readObject();
		System.out.println(t1.i+" "+t1.j);
		
		
		

	}

}
