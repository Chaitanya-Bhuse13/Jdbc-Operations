package com.tka.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

import com.tka.config.JdbcConfig;
import com.tka.entity.Product;

public class ProductOperation {
	
	public String addProduct(Product product) {
		
		try {
			Connection connection = JdbcConfig.getCon();
			
			//write query
			String sql = "INSERT into product(product_id,product_name,product_qty,product_price)VALUES(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, product.getProductId());
			ps.setString(2,product.getProductName());
			ps.setInt(3, product.getProductQty());
			ps.setDouble(4, product.getProductPrice());
			
			//execute query
			int rows = ps.executeUpdate();   //1 executeQuery >> select
			                                 //2 executeUpdate >> insert,delete,update
			if(rows>0) {
				return "Added Successfully";
			}
			
		}
		
		catch(SQLIntegrityConstraintViolationException e) {
			return "Product Already Exist";
		}
						
		catch (Exception e) {
			e.printStackTrace();
			return "Something went wrong";
		}
		return null;
				
	}
	
	public String deleteProduct(int productId) {
		
		try {
			//load drive:-Already defined in Config class
			
			//Get connection
			Connection connection = JdbcConfig.getCon();
			
			//write query
			
			//execute query
			
			//Check for exist
			String existSql = "SELECT * from product where product_id=?";
			PreparedStatement ps2 = connection.prepareStatement(existSql);
			ps2.setInt(1, productId);
			ResultSet rs = ps2.executeQuery();
			
			if(rs.next()) {
				
				String sql = "DELETE from product where product_id=?";
				PreparedStatement ps = connection.prepareStatement(sql);
				ps.setInt(1, productId); 
				
				int rows = ps.executeUpdate();
			
				if(rows>0) {
					return "deleted successfully";
				}
			} 
			else {
				return "Product not exist to delete";
			}
		}catch (Exception e) {
			e.printStackTrace();
			return "Something went wrong";
		}
		
		return null;
	}
	
	public Object getProductById(int productId) {
		return null;
	}
	
	public String updateProduct(Product product) {
		return null;
	}
	
	public Object getAllProducts() {
		return null;
	}
	
	public Object getAllProducts_Asc(String columnName) {
		return null;
	}
	
	public Object getProductByName(String productName) {
		return productName;
	}
	
	public Object retrieveProductsAbovePrice(double productPrice) {
		return productPrice;
	}
	
	

}
