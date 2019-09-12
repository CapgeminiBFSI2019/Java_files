package co.avisek;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap01 {
	
	
	public static void main(String[] args) {
		
		Map<Integer, String>tree=new TreeMap<Integer, String>();
		
		tree.put(98, "avisek");
		tree.put(98, "avisek");
		tree.put(1, "gugul");
		tree.put(2, "gaba");
		tree.put(10, "bbsr");
	    tree.put(67, "ctc");
	    tree.put(98, "mumbai");
	
	System.out.println(tree);
	
	
}
}