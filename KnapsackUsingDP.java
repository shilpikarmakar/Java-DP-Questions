public class KnapsackUsingDP {
    static int tabulation(int[] prices, int[] weights, int maxWeight, int totalItems)
    {
        int matrix[][] = new int[totalItems+1][maxWeight+1];
        for (int i = 0; i <= maxWeight; i++) {
            matrix[0][i] = 0;
        }
        for (int i = 0; i <= totalItems; i++) {
            matrix[i][0] = 0;
        }
        for (int i = 1; i <= totalItems; i++) {
            for (int j = 1; j <= maxWeight; j++) {
                if(weights[i-1] > j)
                {
                    matrix[i][j] = matrix[i-1][j];
                }
                else
                {
                    int option1 = prices[i-1] + matrix[i-1][j-weights[i-1]];
                    int option2 = matrix[i-1][j];
                    matrix[i][j] = Math.max(option1, option2);
                }
            }
        }
        return matrix[totalItems][maxWeight];
    }
    public static void main(String[] args) {
        int maxWeight = 3;
        int[] prices = {60, 100, 120};
        int weights[] = {1, 2, 2};
        System.out.println(tabulation(prices, weights, maxWeight, prices.length));
    }
}
