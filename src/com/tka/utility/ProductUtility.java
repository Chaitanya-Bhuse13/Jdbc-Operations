package com.tka.utility;

import java.util.Scanner;

import com.tka.entity.Product;

public class ProductUtility {
	
static Scanner scanner = new Scanner(System.in);
	
	public static Product prepareProduct() {
		
		System.out.println("Enter Product Id:");
		int id = scanner.nextInt();
		
		System.out.println("Enter Product Name:");
		String name = scanner.next();
		
		System.out.println("Enter Product Qty:");
		int qty = scanner.nextInt();
		
		System.out.println("Enter Product Price:");;
		double price = scanner.nextDouble();
		
		Product product = new Product(id,name,qty,price);
		
		return product;
	}

}
