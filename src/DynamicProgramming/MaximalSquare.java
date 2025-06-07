package DynamicProgramming;

public class MaximalSquare {
    public static void main(String[] args) {
        int matrix [][] = {{1,0,1,0,0},
                           {1,0,1,1,1},
                           {1,1,1,1,1},
                           {1,0,0,1,0},};
      int res = maximalSquare(matrix);
        System.out.println("Maximal Square is :" + res);
    }
    static int maximalSquare(int [][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int maxside = 0;
        int [][] dp = new int[row][col];
        for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                if(mat[i][j] == 1) {
                    if(i == 0 || j == 0) dp[i][j] = 1;

                    else
                        dp[i][j] = 1 + Math.min (Math.min(dp[i - 1][j] , dp[i][j - 1]) , dp[i - 1][j - 1]);

                    maxside = Math.max(maxside , dp[i][j]);
                }
            }
        }
        return maxside * maxside;
    }
}
