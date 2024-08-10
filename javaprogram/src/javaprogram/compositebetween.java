package javaprogram;

public class compositebetween {
       public static void main(String[]args) {
    	   int a=1;
    	   int b=20;
    	   for(int i=a;i<=b;i++) {
    		   if(iscomposite(i)) {
    			   System.out.println(i);
    		   }
    	   }
       }
       static boolean iscomposite(int n) {
    	   if(n<=1) {
    		   return false;
    	   }
    	  for(int i=2;i<=Math.sqrt(n);i++) {
    		  if(n%i==0) {
    			  return true;
    		  }
    	  }
    	  return false;
       }
}
