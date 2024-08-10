package javaprogram;

public class Alphabeticalorder {
	public static void main(String[] args)
    {
       int n=4;
       String temp;
       String names[]= {"konda","siva","rama","jeshwanth"};
       for(int i=0;i<n;i++) {
    	   for(int j=0;j<n;j++) {
    		   if(names[i].compareTo(names[j])>0) {
    			   temp=names[i];
    			   names[i]=names[j];
    			   names[j]=temp;
    		   }
    	   }
       }
       for(int i=0;i<n;i++) {
    	   System.out.println(names[i]);
       }
    }
}