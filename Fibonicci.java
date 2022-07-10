public class Fibonicci {
    static int fibo(int n)
    {
        int matrix[] = new int[n+1];
        matrix[0] = 0;
        matrix[1] = 1;
        for(int i=2; i<=n; i++)
        {
            matrix[i] = matrix[i-1] + matrix[i-2];
        }
        return matrix[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }
}
