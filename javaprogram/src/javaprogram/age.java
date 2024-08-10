package javaprogram;
import java.util.Scanner;
public class age {
        public static void main(String[] args) {
        	Scanner scanner=new Scanner(System.in);
        	int n=scanner.nextInt();
        	if(n>18) {
        		System.out.print("You can vote");
        	}
        	else if(n<18) {
        		int m=18-n;
        		System.out.print("You can vote in:"+m+" years");
        	}
   
        }
}
