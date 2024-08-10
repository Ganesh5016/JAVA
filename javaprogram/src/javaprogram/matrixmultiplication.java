package javaprogram;

public class matrixmultiplication {
    public static void main(String[] args) {
        int a1[][]= {{1,2},{2,1}};
        int a2[][]= {{3,4},{4,3}};
        int res[][]=new int[2][2];
        for (int i=0;i<2;i++) {
        	for(int j=0;j<2;j++) {
        		for(int k=0;k<2;k++) {
        			res[i][j]+=a1[i][k]*a2[k][j];
        		}
        	}
        }
        for(int[] row:res) {
        	for(int val:row) {
        		System.out.print(val+" ");
        	}
        	System.out.println();
        }
    }
}     
