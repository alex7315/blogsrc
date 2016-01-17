package com.mnkartik.feature2;;

public class Main {

	public static void main(String[] args) {

		/**
		 * make sure its not null else null pointer exception is raised
		 */
		String str = "c";

		switch(str){
		case "a" : 
			System.out.println("option is 'a'");
			break;
		case "b": 
			System.out.println("option is 'b'");
			break;

		default: System.out.println("okay");
		}

	}

}
