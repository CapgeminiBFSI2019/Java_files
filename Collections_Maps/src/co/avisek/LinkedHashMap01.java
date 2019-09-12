package co.avisek;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap01 {
	public static void main(String[] args) {
		
		 
		Map<Integer, String>lmap=new LinkedHashMap<Integer, String>();
		
		lmap.put(98,"John");
		lmap.put(10,"Scott");
		lmap.put(98,"John");
		lmap.put(67,"Miley");
		lmap.put(25,"Ray");
		System.out.println(lmap.size());
		System.out.println(lmap);
		
		lmap.putIfAbsent(34, "Ilsa");//this doesnt work
		System.out.println(lmap);
		
		System.out.println(lmap.containsKey(10));//returns boolean
		System.out.println(lmap.get(67));
		System.out.println(lmap.containsValue("Rayn"));
		
		Set set=lmap.entrySet();
		Iterator iter=set.iterator();
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry) iter.next();
			System.out.println("Key: "+me.getKey()+" value: "+me.getValue());
		}
		
		
		
	}
	
	
	

}
