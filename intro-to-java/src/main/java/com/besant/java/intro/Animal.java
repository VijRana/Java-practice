package com.besant.java.intro;

public class Animal {
   
	int eyes=2;
    int ears=2;
    static int  x=10;
    
    void bark(){
	   System.out.println("Barking!!!!");
	   x++;
   }
     //methos signature
    public int sum(int num1, int num2){
    	return num1+num2;
    }
    
     public static void main(String[] args) {
		 Animal animal= new Animal();
		 System.out.println(animal.toString());
//		 System.out.println(animal.ears);
//		 animal.bark();
//		 System.out.println(animal.sum(10, 90));
//		 
//		 Animal animal2= new Animal();
//		 Animal animal3= new Animal();
//		 Animal animal4= new Animal();
//		 
//		 System.out.println(Animal.x);
//		 System.out.println(Animal.x);
//		 System.out.println(Animal.x);
		 
		 int[] data= new int[12];
		 data[0]=9;
		 data[1]=90;
		 
		 System.out.println(data[0]);
		 
		 String name="Hello world";
		 name="solve problem";
		 
		 System.out.println(name);
		 // 
		 long  a=90;
		 int b;
		 b=(int) a;
		 a=b;
		 
		 
		 
		 
		 
	}
}
