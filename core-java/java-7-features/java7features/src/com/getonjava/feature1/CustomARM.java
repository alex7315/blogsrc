package com.getonjava.feature1;

public class CustomARM {

	public static void main(String[] args) {

		try(CustomPort port = new CustomPort()){

			port.write();

		}catch(PortException e){
			System.out.println("inside port exception catch");
			e.printStackTrace();

		}catch(Exception e){
			System.out.println("inside exception catch");
			e.printStackTrace();
		}
	}
}


// [1]
class CustomPort implements AutoCloseable {

	// [2]
	@Override
	public void close() throws Exception {
		System.out.println("port close");
		throw new Exception("could not close the port");
	}

	// [3]
	public void write() throws PortException {
		System.out.println("writing content");
		throw new PortException("some exception occured while writing" );
	}

}


class PortException extends Exception {
	public PortException(String msg){
		super(msg);
	}
}