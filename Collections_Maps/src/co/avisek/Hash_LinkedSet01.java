package co.avisek;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hash_LinkedSet01 {

	public static void main(String[] args) {
		
		
		Set<Integer>num=new HashSet<Integer>();
		
		num.add(123);
		num.add(64);
		num.add(25);
		num.add(100);
		num.add(64);
		num.add(25);
		num.add(123);
		num.add(64);
		num.add(25);
		num.add(100);
		
		
		System.out.println(num);//doesn't keep the order intact
       Set<Integer>nums=new LinkedHashSet<Integer>();
		
		nums.add(123);
		nums.add(64);
		nums.add(25);
		nums.add(64);
		nums.add(25);
		nums.add(100);
		nums.add(123);
		nums.add(64);
		nums.add(25);
		nums.add(100);
		System.out.println(nums);//keeps the order intact
		
		
	}

}
