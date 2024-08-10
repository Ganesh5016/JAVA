package javaprogram;
public class Right_triangle_star_pattern {
   public static void pattern(int n) {
	   for(int i=0;i<n;i++) {
		   for(int b=0;b<=i;b++) {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
   }
   public static void main(String args[]) {
	   int k=5;
	   pattern(k);   
   }
}