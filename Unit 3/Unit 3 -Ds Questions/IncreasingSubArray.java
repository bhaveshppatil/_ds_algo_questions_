import java.util.Scanner;

public class IncreasingSubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test != 0) {
            int n = scan.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int max = 1, len = 1;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i+1]){
                    len++;
                }else if (max < len){
                    max = len;
                    len = 1;
                }

            }
            if (max <len){
                max = len;
                System.out.println(max);
            }
            test--;
        }
    }
}