package javaprogram;

public class factors {
      public static void main(String[]args) {
    	  int n=100;
    	  int count=0;
    	  for(int i=1;i<=n;i++) {
    		  if(n % i==0) {
    			  count++;
    		  }
    	  }
    	  System.out.print(count);
      }
}
