package com.besant.java.intro;

import java.util.Stack;

public class Honda implements Car,Racing {

	public static void main(String[] args){
		  Honda honda= new Honda();
		  honda.startcar();
	 }
	public void startcar() {
		System.out.println("Yes i know how to start car");	 
	}

	Stack<Animal> stack= new Stack<Animal>();
	
}
