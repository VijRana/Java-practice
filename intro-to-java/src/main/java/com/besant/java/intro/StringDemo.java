package com.besant.java.intro;

public class StringDemo {

	public static void main(String[] args) {
		String myName = "Rana";
		myName = myName + " Arvin";
		System.out.println("Name = " + myName);
		
		//................
		
		String urName = "Petronius";
		String occupation = "Reorganization Specialist";
		urName += " Arbiter";
		urName += " ";
		urName += "(" + occupation + ")";
		System.out.println("Name = " + urName);
		}
}
