public class ClimbingStairs {
    static int count(int n)
    {
        int matrix[] = new int[n+1];
        matrix[0] = 0;
        matrix[1] = 1;
        matrix[2] = 2;
        for (int i = 3; i <= n; i++) {
            matrix[i] = matrix[i-1] + matrix[i-2];
        }
        return matrix[n];
    }
    public static void main(String[] args) {
        System.out.println(count(4));
    }
}
