package javaprogram;

public class leapyear {
     public static void main(String[]args) {
    	 int n=2025;
    	 if(n%4==0) {
    		 System.out.print("leap year");
    	 }
    	 else if(n%100==0) {
    		 System.out.print("Not a leap year");
    	 }
    	 else if(n%400==0) {
    		 System.out.print("leap year");
    	 }
    	 else {
    		 System.out.print("not a leap year");
    	 }
     }
}
