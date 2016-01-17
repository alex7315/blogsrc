package com.mnkartik.feature3;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args){
		
		// old pre jdk 1.7 approach 
		try{
			copy();
			
		}catch (IOException ex){
			System.out.println(ex.getMessage());			
		}catch (SQLException ex){
			System.out.println(ex.getMessage());
		}
		
		
		// new jdk 1.7 approach
		// make sure compiler settings are set to 1.7
		try{
			copy();
			
		}catch (IOException | SQLException ex){
			System.out.println(ex.getMessage());
		}
	}

	static void copy() throws IOException, SQLException	{
		if (Math.random() < 0.5)
			throw new IOException("cannot copy to file");
		else
			throw new SQLException("cannot copy to database");
	}
}
