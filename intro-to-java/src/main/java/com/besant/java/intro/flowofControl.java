package com.besant.java.intro;

public class flowofControl {
   public static void main(String[] args) {
	
	   int a=10;
	   if(a==9){
		 System.out.println("The vlaue is :" +a );  
	   }
	   else{
		   System.out.println("Not 10");
	   }
	   
	    for(int i=1; i<=10; i++){
	    	System.out.println(i);
	    	 if(i==5){
	    		break; 
	    	 }
	    }
	    
	    
}
}
