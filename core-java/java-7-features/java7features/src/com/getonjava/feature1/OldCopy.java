package com.getonjava.feature1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OldCopy {

	public static void main(String[] args) throws Exception {

		// note: change the path of the files as per your system  
		oldcopy("C:/drive/kartik/repo/github/getonjava/corejava/Java 7 Programming Features - Automatic Resource Management/java7feature1/resources/first.txt", 
				"C:/drive/kartik/repo/github/getonjava/corejava/Java 7 Programming Features - Automatic Resource Management/java7feature1/resources/first.txt");

		System.out.println("contents copied");
	}



	private static void oldcopy(String src, String dst){		
		FileInputStream fis = null;

		try{
			// [1]
			fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dst);

			// [2]
			try	{
				int _byte;
				while ((_byte = fis.read()) != -1){
					fos.write(_byte);
				}

			}catch(Exception e ){
				e.printStackTrace();

			}finally{
				// [3]
				try{
					fos.close();
				}catch (IOException ioe){
					System.err.printf("unable to close %s%n", dst);
				}
			}

		}catch(Exception e ){
			e.printStackTrace();

		}finally{
			//[4]
			try{
				fis.close();

			}catch (IOException ioe){
				System.err.printf("unable to close %s%n", src);
			}
		}
	}




}
