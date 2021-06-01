package com.qa.sql;

import java.sql.ResultSet;

public class customer {
	
	int customer_ID;
    String name;
    String address;
    String email;
    
    public customer(String name, String address, String email) {
    	this.name = name;
    	this.address = address;
    	this.email = email;
    }
    
    public void insertSelf() {
    	String query = "INSERT INTO customers VALUES(2, '"+name+"','"+address+"','"+email+"')";
    	JDBC.exUpdate(query);
    }
    
    public ResultSet select(int id) {
    	String query = "SELECT * FROM customers "
    			+ "WHERE customer_id = " + id;
    	return JDBC.exQuery(query);
    }

}