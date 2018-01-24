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
		
		add.make(2);
		System.out.println(add.getValue());
		
		add.make(3);
		System.out.println(add.getValue());
		
		System.out.println("Hello World !!");
	}
	
	public static void test(int i) {
		i = i + 1;
	}
	
	
	

}
