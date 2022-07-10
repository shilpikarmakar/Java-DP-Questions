public class LCSUsingDP {
    static int tabulation(String first, String second, int m, int n)
    {
        int matrix[][] = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if(i == 0 || j == 0)
                {
                    matrix[i][j] = 0;
                }
                else
                {
                    if(first.charAt(i-1) == second.charAt(j-1))
                    {
                        matrix[i][j] = matrix[i-1][j-1] + 1;
                    }
                    else
                    {
                        matrix[i][j] = Math.max(matrix[i][j-1], matrix[i-1][j]);
                    }
                }
            }
        }
        return matrix[m][n];
    }
    public static void main(String[] args) {
        System.out.println(tabulation("AGGTAB", "GXTXAYB", "AGGTAB".length(), "GXTXAYB".length()));
    }
}
