package co.avisek9;

import java.util.Arrays;
import java.util.Scanner;

public class TitleCaseConverter {
	

	public String convert(String sentence) {
		
		sentence=sentence.replaceAll("\\s+", " ");
		sentence=sentence.trim();
		
		String[] str = sentence.split(" ");
		for(int i=0; i<str.length;i++) {
		str[i] = str[i].substring(0,1).toUpperCase() + str[i].substring(1).toLowerCase();
		}
		String st=Arrays.toString(str);
		st=st.replaceAll(",","");
		st=st.replaceAll("\\[", "").replaceAll("\\]","");
		return st;
	}
	
	
	
	
	
	

}
