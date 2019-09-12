package co.avisek;

import java.util.HashMap;
import java.util.Map;

import co.avisek.entity.Address;
import co.avisek.entity.Person;

public class ProgramMap02 {
	
	public static void main(String[] args) {
		
		
		Map<Person, Address>map=new HashMap<Person, Address>();
		
		map.put(new Person("gugul", "gaba"), new Address("PMG", "BBSR", "Odisha"));
		
		map.put(new Person("gugul", "gaba"), new Address("PMG", "BBSR", "Odisha"));
		map.put(new Person("avisek", "kumar"), new Address("PMG1", "BBSR2", "Odisha"));
		map.put(new Person("vivek", "shah"), new Address("PMG3", "BBSR3", "Odisha3"));
		map.put(new Person("gugul", "gaba"), new Address("PMG", "BBSR", "Odisha"));
		
		System.out.println(map);
		
		for(Person p:map.keySet()) {//prints keys
			System.out.println(p);
			System.out.println("--> "+map.get(p));//get the key values
		}
	
		for(Address a:map.values()) {//prints values only
			System.out.println(a);
		}
		
		
	}

}
