package com.mnkartik.feature1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class NewCopy {

	public static void main(String[] args) {

		// note: change the path of the files as per your system 
		newcopy("C:/java7features/resources/first.txt", "C:/java7features/resources/second.txt");
	}



	private static void newcopy(String src, String dst){

		try (FileInputStream fis = new FileInputStream(src);
				FileOutputStream fos = new FileOutputStream(dst);) {

			int _byte;
			while ((_byte = fis.read()) != -1){
				fos.write(_byte);
			}

		}
		// must be caught because of other exceptions 
		catch(Exception e ){
			e.printStackTrace();
		}
	}
}
