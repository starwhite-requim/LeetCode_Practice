package pract;

/**
 * 加上障碍物的不同路径问题
 * obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * 1表示 有障碍
 */
public class LeetCode63_不同路径2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n  = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1){
                    //障碍无法到达,设定标志，-1代表无法到达
                    dp[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] != 1)
            {
                //不是障碍，则初始化
                dp[i][0] = 1;
            }
            else{
                //一旦遇到障碍，则右边所有的全都无法走通
                //数组默认值为0
                break;
            }
        }
        for (int i = 0; i < n; i++) {

            if (obstacleGrid[0][i] != 1)
            {
                //不是障碍，则初始化
                dp[0][i] = 1;
            }
            else{
                //一旦遇到障碍，则右边所有的全都无法走通
                //数组默认值为0
                break;
            }
        }
        //除1外，-1也是已经初始化的结果
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (dp[i][j] == -1){
                    dp[i][j] = 0;
                }
                else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
