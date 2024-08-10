package javaprogram;
import java.util.Scanner;
public class Lcm_Gcd {
       public static int gcd(int a,int b) {
    	   if(b==0) {
    		   return a;
    	   }
    	   return gcd(b,a%b);
       }
       public static int lcm(int a,int b) {
    	   return (a*b)/gcd(a,b);
       }
       public static void main(String[]args) {
    	   int a=2;
    	   int b=4;
    	   System.out.print(gcd(a,b)+"\n");
    	   System.out.print(lcm(a,b));
       }
}