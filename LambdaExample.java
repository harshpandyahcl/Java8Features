package com.java8features;


@FunctionalInterface 
interface Substract{ //Implementation of function interface
	float substract(float a,float b);
}
@FunctionalInterface //Implementation of function interface
 interface Addition{  
    float add(float a,float b);
    
}  


 
interface Operations{  //Implemention of default method and static method
   default float mul(float a,float b) {
	   return (a*b);
	}
   
   static float div(float a, float b) {
	   
	   return(a/b);
   }
	static void illustration(){
		 System.out.println("This is an illustration of static method in java");
	}
}  


public class LambdaExample implements Operations{

	public static void main(String[] args) {
  
        Substract sub=(a,b)->(a-b);  
        System.out.println("Performed substraction "+sub.substract(2,1));  
        
        Addition ad = (a,b) ->(a+b);
        System.out.println("Performed Addition "+ad.add(1,2));
        
        LambdaExample le = new LambdaExample();
        System.out.println("Performed Multiplication "+le.mul(1,2));
        
        
        System.out.println("Performed Division"); 
        Operations.div(10,2);
        
        Operations.illustration();
        

	}

}


