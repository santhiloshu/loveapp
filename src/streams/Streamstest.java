package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Streamstest {

	public static void main(String[] args) {
		List<Employee> listOfEmployees=new ArrayList<>();
		listOfEmployees.add(new Employee(101,"santhi",101,"active",20000));
		listOfEmployees.add(new Employee(102,"loshu",101,"active",5000));
		listOfEmployees.add(new Employee(103,"veeru",102,"inactive",70000));
		listOfEmployees.add(new Employee(104,"sushma",102,"inactive",4000));
		listOfEmployees.add(new Employee(105,"parrthu",103,"active",6000));
		listOfEmployees.add(new Employee(106,"marina",103,"inactive",8000));
		//__________________________________________________________________________
       
		Map<Integer,List<Employee>> map=listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getDeptid));
		map.entrySet().forEach(entry->{System.out.println(entry.getKey()+" "+entry.getValue());});
	
	//******************************************************************************************************************
		
		
		Map<Integer,Long> map1=listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getDeptid,Collectors.counting()));
	     map1.entrySet().forEach(entry->{
	    	 System.out.println(entry.getKey()+" "+entry.getValue());
	    	 
	     });
	     //***************************************************************************************************************
	    Optional<Employee> minsal= listOfEmployees.stream().min(Comparator.comparing(Employee::getSalary));
	if(minsal.isPresent())
	{
		System.out.println(minsal);
	}
//*****************************************************************************************************************

	listOfEmployees.stream().collect(Collectors.groupingBy(Employee::getDeptid,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
	}

}
