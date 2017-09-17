package com.besant.java.intro;


public class TestClass {
     static double time;
     static boolean value;
      static final int a=10;
      
      
      
      public int x;
      protected int  y;
      private double w=90;
      private int z=0;
      public TestClass() {
		  y=90;
	  }
      
      public int addSum(){
    	   return (int) (x+w); 
      }
     
     public static void main(String[] args) {
		System.out.println(time);
		System.out.println(value);
		
		TestClass test= new TestClass();
	}
     
     
}
