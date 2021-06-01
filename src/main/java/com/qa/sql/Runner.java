package com.qa.sql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Runner {
	public static void main(String[] args) {
		JDBC.connect();
		
		customer piers = new customer("Piers", "hgefh", "hgsflkjh");
//		piers.insertSelf();
		ResultSet customerSelect;
		
		customerSelect = piers.select(2);
		String name = null;
		String email = null;
		String address = null;
		try {
			if(customerSelect.next()) {
				name = customerSelect.getString("cust_name");
				email = customerSelect.getString("email");
				address = customerSelect.getString("address");
				System.out.println(name + " " +email + " " + address);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
