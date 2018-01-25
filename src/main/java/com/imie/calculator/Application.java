/**
 * 
 */
package com.imie.calculator;

/**
 * @author Cyril
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Addition add = new Addition(1);
		
		/* 
		//Exemple findbug
		
		String tt = "toto";
		String ii = new Object();
		
		if(tt.equals(ii)) {
			System.out.println("Same!!");
		}
		*/	
		
		add.make(2);
		System.out.println(add.getValue());
		
		add.make(3);
		System.out.println(add.getValue());
		
		System.out.println("Hello World !!");
	}
	
	

}
