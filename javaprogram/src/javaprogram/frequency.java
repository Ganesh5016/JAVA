package javaprogram;

public class frequency {
     public static void main(String[]args) {
    	 int n[]= {1,1,2,3,3,4,4,5,5,6,6};
    	 int l=n.length;
    	 int freq[l];
    	 for(int i=0;i<=l;i++) {
    		 freq[i]=-1;
    	 }
    	 for(int i=0;i<=l;i++) {
    		 int count=1;
    		 for(int j=i+1;j<=l;j++) {
    			 if(n[i]==n[j]) {
    				 count++;
    				 freq[j]=0;
    			 }
    		 }
    		 if(freq[i]!=0) {
    			 freq[i]=count;
    		 }
    	 }
    	 for(int i=0;i<n;i++) {
    		 System.out.printl(n[i]+"-"+freq[i]);
    	 }
    	 
     }
}
