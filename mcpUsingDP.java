public class mcpUsingDP {
    static int tabulation(int[][] costMatrix)
    {
        int matrix[][] = new int[costMatrix.length][costMatrix.length];
        matrix[0][0] = 0;
        for (int i = 1; i < matrix.length; i++) {
            matrix[0][i] = matrix[0][i-1] + costMatrix[0][i];
        }
        for (int i = 1; i < matrix.length; i++) {
            matrix[i][0] = matrix[i-1][0] + costMatrix[i][0];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                int diagonal = matrix[i-1][j-1];
                int left = matrix[i][j-1];
                int up = matrix[i-1][j];
                matrix[i][j] = costMatrix[i][j] + Math.min(Math.min(diagonal, up), left);
            }
        }
        return matrix[matrix.length-1][matrix.length-1];
    }
    public static void main(String[] args) {
        int costMatrix[][] = {{2, 0, 6}, {3, 1, 7}, {4, 5, 9}};
        System.out.println(tabulation(costMatrix));
    }
}
