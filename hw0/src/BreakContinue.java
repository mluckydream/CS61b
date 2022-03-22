public class BreakContinue {
    public static int[] windowPosSum(int[] a, int n) {
        /** your code here */

        for (int i = 0; i < a.length; i++){
            if (a[i] < 0){
                continue;
            }
            if(i == a.length - 1){
                break;
            }
            for (int j = 1; j < n+1 ; j++){
                if (i + j > a.length - 1){
                    break;
                }
                a[i] += a[i+j];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}