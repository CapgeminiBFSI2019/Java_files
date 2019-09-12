package co.avisek;

import java.util.Set;
import java.util.TreeSet;

import co.avisek.entity.Product;

public class TreeSet01 {

	public static void main(String[] args) {
		
		
		Set<Product>products=new TreeSet<Product>();//stores in ascending order
		
		
		products.add(new Product(1,"chai",12.3));
		products.add(new Product(1,"chai",12.3));
		products.add(new Product(2,"coffee",15.6));
		products.add(new Product(3,"samosa",22.5));
		products.add(new Product(1,"chai",12.3));
		System.out.println(products);
		
		
		
	}
}
