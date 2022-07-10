public class SubsetSumProblem {
    static int countSum(int arr[], int n, int sum, int index)
    {
    if (sum == 0)
            return 1;
        if (sum < 0)
            return 0;
        if (index == n)
            return 0;
        int count = 0;
        int option1, option2;
        option1 = countSum(arr, n, sum - arr[index], index + 1);
        option2 = countSum(arr, n, sum, index + 1);
        count = option1 + option2;
        return count;
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 3, 34, 4, 12, 5, 2 };
        // int arr[] = { 1, 3, 8, 9, 2, 10 };
        int sum = 9;
        System.out.println(countSum(arr, n, sum, 0));
    }
}
