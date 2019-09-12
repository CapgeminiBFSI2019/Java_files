package co.avisek;

import java.util.Map;
import java.util.TreeMap;

import co.avisek.entity.Person;

public class ProgramTreeMap01 {
	
	
	public static void main(String[] args) {
		
		
		Map<Person, String>tree=new TreeMap<Person, String>();
		
		tree.put(new Person("gugul", "f"), "bbsr,odisha");
		tree.put(new Person("avisek", "k"), "ctc,odisha");
		tree.put(new Person("gaba", "g"), "r,odisha");
		
		System.out.println(tree);
		System.out.println(tree.size());
		for(Person p:tree.keySet()) {
			System.out.println(p);
			System.out.println("--> "+tree.get(p));
		}
		
	}
	
	

}
