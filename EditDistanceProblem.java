public class EditDistanceProblem {
    static int editDistanceOperationCount(String first, String second, int m, int n)
    {
        int matrix[][] = new int[m+1][n+1];
        matrix[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            matrix[0][i] = i;
        }
        for (int i = 1; i <= m; i++) {
            matrix[i][0] = i;
        }
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(first.charAt(i-1) == second.charAt(j-1))
                {
                    matrix[i][j] = matrix[i-1][j-1];
                }
                else
                {
                    matrix[i][j] = Math.min(Math.min(matrix[i-1][j], matrix[i][j-1]), matrix[i-1][j-1])+1;
                }
            }
        }
        return matrix[m][n];
    }
    public static void main(String[] args) {
        String first = "Sunday";
        String second = "Saturday";
        System.out.println(editDistanceOperationCount(first, second, first.length(), second.length()));
    }
}
