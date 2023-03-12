package session14;
class Solution {
    public void setZeroes(int[][] arr) {
        int a= -123456;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                int ele = arr[i][j];
                if(ele ==0){
                    for(int row = 0;row<arr.length;row++){
                        if(arr[row][j] !=0 )
                        arr[row][j]= a;
                    }
                    for(int col=0;col<arr[0].length;col++){
                        if(arr[i][col] != 0)
                        arr[i][col] =a;
                    }
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == a) arr[i][j] = 0;
            }
        }




    }
}