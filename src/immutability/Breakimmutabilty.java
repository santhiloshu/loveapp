package immutability;

import java.util.HashMap;
import java.util.Map;

public class Breakimmutabilty {

	public static void main(String[] args) {
		Map<Studant,String> map=new HashMap<>();
		FakeStudant mutableobj=new FakeStudant("loshu");
	  Studant ImmutableObj=mutableobj;
	  map.put(ImmutableObj,"india");
	  System.out.println(map.get(ImmutableObj));
	 mutableobj.setFakestudant("santhi");
	 System.out.println(map.get(ImmutableObj));
	 
	  
	   
	   

	}

}
