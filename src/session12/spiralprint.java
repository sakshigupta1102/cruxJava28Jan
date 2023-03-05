package session12;

import java.util.Arrays;

public class spiralprint {

	public static void main(String[] args) {
//		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		spiralprint(arr);
		int[] arr1  = {2,8,9,3,4,6,8,3,2,1};
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		

	}
	public static void spiralprint(int[][] arr){
		int n= arr.length;
		int m = arr[0].length;
		int total = n*m;
		int cnt=1;
		int minrow=0;
		int mincol=0;
		int maxrow= n-1;
		int maxcol= m-1;
		while(cnt<=total){
			for(int col= mincol; col<= maxcol &&cnt<= total;col++){
				System.out.print(arr[minrow][col]+"  ");
				cnt++;
			}
			minrow++;
			for(int row = minrow;row<= maxrow &&cnt<= total;row++){
				System.out.print(arr[row][maxcol]+"  ");
				cnt++;
			}
			maxcol--;
			for(int col= maxcol; col>= mincol&&cnt<= total;col--){
				System.out.print(arr[maxrow][col]+"  ");
				cnt++;
			}
			maxrow--;
			for(int row = maxrow;row>=minrow&&cnt<= total;row--){
				System.out.print(arr[row][mincol]+"  ");
				cnt++;
			}
			mincol++;
		}
	}
	
	
	
	
	

}
