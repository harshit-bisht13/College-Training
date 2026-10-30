public class SetMatrixZeroes74 {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    for(int col=0;col<n;col++){
                        if(matrix[i][col]!=0){
                            matrix[i][col]=-1;
                        }
                    }
                    for(int row=0;row<n;row++){
                        if(matrix[row][j]!=0){
                            matrix[row][j]=-1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
