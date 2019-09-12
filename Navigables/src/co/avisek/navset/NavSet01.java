package co.avisek.navset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavSet01 {
	public static void main(String[] args) {
		
		
		NavigableSet<Integer>navs=new TreeSet<Integer>();
		navs.add(100);
		navs.add(90);
		navs.add(86);
		navs.add(290);
		navs.add(350);
		
		System.out.println(navs);
		
		System.out.println(navs.lower(100));//lower than 100
		System.out.println(navs.higher(290));//higher than 290
		
		System.out.println(navs.floor(100));//less than or equal to 100
		System.out.println(navs.ceiling(290));//greater than or equal to 290
		System.out.println(navs.headSet(100,true));//all values less than 100 or equal and less than 100 if true
		
		
		NavigableSet<Integer>navhd=navs.tailSet(100, true);//all values greater than 100 if true then include 100
		System.out.println(navhd);
		System.out.println();
		//if we make changes in navhd then navs will also be affected and vice versa (backed set)
		
		System.out.println(navs.pollLast());//removes the first element
		System.out.println(navhd);//last item also removed from here
		
		
		NavigableSet<Integer>reverseset=navs.descendingSet();
		System.out.println(reverseset);
		
		
		
		
		
		
		
	}

}
