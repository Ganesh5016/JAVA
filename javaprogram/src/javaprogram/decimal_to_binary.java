package javaprogram;
import java.util.Scanner;
public class decimal_to_binary {
            public static void main(String[]args) {
            	Scanner scanner=new Scanner(System.in);
            	int decimal=scanner.nextInt();
            	String binary=Integer.toBinaryString(decimal);
            	System.out.print(binary+"\n");
            String rev=new StringBuilder(binary).reverse().toString();
            System.out.print(rev);
      }
}