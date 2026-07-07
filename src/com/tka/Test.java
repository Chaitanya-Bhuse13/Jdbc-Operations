package com.tka;

import java.util.Scanner;

import com.tka.entity.Product;
import com.tka.operation.ProductOperation;
import com.tka.utility.ProductUtility;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ProductOperation operation = new ProductOperation();
		int choice = 0;

		do {
			System.out.println("1. Add product");
			System.out.println("2. Delete product");
			System.out.println("3. Get particular product by id");
			System.out.println("4. Update Particular product");
			System.out.println("5. Retrieve all products");
			System.out.println("6. Retrieve all products in ascending order");
			System.out.println("7. Retrieve product by product name ");
			System.out.println("8. Retrieve products whose price is more than given price");
			System.out.println("9. Retrieve products as per given pattern");
			System.out.println("10. Retrieve products within price range");
			System.out.println("11. Retrieve maximum product price");
			
			System.out.println("Press 0 for Terminate application");

			System.out.println("SELECT OPERATION");

			choice = scanner.nextInt();
			
			switch (choice) {
			case 0: {
				
				break;
			}
			case 1: {
				Product product = ProductUtility.prepareProduct();
				String message = operation.addProduct(product);
				System.out.println(message);
				break;
			}
			case 2: {
				System.out.println("Enter Product Id");
				int productId = scanner.nextInt();
				String message = operation.deleteProduct(productId);
				System.out.println();
				
				break;
			}
			case 3: {
	
				break;
			}
			case 4: {
	
				break;
			}
			case 5: {
	
				break;
			}
			case 6: {
	
				break;
			}
			case 7: {
	
				break;
			}
			case 8: {
	
				break;
			}
			case 9: {
				
				break;
			}
			case 10: {
				
				break;
			}
			case 11: {
				
				break;
			}
			default:
				System.out.println("Invalid Choice");
				
			}

		} while (true);

	}

}
