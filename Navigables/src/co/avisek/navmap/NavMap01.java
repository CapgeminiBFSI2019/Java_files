package co.avisek.navmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavMap01 {
	
	public static void main(String[] args) {
		
		NavigableMap<Integer, String>navmap=new TreeMap<Integer, String>();
		
		navmap.put(10, "IT");
		navmap.put(209, "Finance");
		navmap.put(71, "HR");
		navmap.put(2, "R&D");
		navmap.put(11, "Marketing");
		
		System.out.println(navmap);
		System.out.println();
		//not inclusive
		System.out.println(navmap.higherEntry(11));
		System.out.println(navmap.lowerEntry(11));
		System.out.println();
		//inclusive key
		System.out.println(navmap.ceilingEntry(11));
		System.out.println(navmap.floorEntry(11));
		//get entries no remove
		System.out.println();
		System.out.println(navmap.firstEntry());
		System.out.println(navmap.lastEntry());
		System.out.println();
		//we use set because we have no iterator for map
		
		Set<Entry<Integer, String>> entries=navmap.entrySet();//create set of keys
		Iterator<Entry<Integer, String>> it=entries.iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry=(Entry<Integer, String>) it.next();
			System.out.println("Keys: "+entry.getKey()+" Values: "+entry.getValue());
			
		}
		
		
		System.out.println();
		
		//poll methods
		System.out.println(navmap.pollFirstEntry());
		System.out.println(navmap.pollLastEntry());
		System.out.println(navmap);
		
		//Backed Maps
		System.out.println();
		NavigableMap<Integer, String>navhd=navmap.headMap(11, true);//boolean for inclusive
		System.out.println(navhd);
		navhd.put(1, "Logistics");
		System.out.println(navhd);
		System.out.println(navmap);
		//same for tail also
		
		System.out.println();
		//reverse
		System.out.println(navmap.descendingMap());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
