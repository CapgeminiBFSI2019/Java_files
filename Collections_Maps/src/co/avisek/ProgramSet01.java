package co.avisek;

import java.util.HashSet;
import java.util.Set;

import co.avisek.entity.Product;

public class ProgramSet01 {

	public static void main(String[] args) {
		
		Set<Product>products = new HashSet<Product>();
		
		products.add(new Product(1,"chai",12.3));
		products.add(new Product(1,"chai",12.3));
		products.add(new Product(2,"coffee",15.6));
		products.add(new Product(3,"samosa",22.5));
		products.add(new Product(1,"chai",12.3));
		System.out.println(products);//also stores duplcates because there is no hash code for product class
		//need to create a hashcode function in the product class
		
		for(Product p:products) {
			System.out.println(p.hashCode());
		}
		
		
	}

}
