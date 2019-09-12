package co.avisek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program02 {
	public static void main(String[] args) {
		
		
		List<String>l= new ArrayList<String>();
		l.add("gaba");
		l.add("gugul");
		l.add("Scott");
		l.add("gaba");
		l.add("Smith");
		l.add("gaba");
		
		int count=Collections.frequency(l, "gaba");
		System.out.println("Count: "+count);
		
		
		count=Collections.frequency(l, "avisek");//if not found return 0
		System.out.println("Count: "+count);
		
		String min=Collections.min(l);//string comparison lexigoraphically
		String max=Collections.max(l);
		
		System.out.printf("Min: %s\nMax: %s",min,max);
		
		
		
		
		
		
	}

}
