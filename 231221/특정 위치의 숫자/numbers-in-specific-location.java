import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (i == 2 || i == 4 || i == 9) {
                arr[i] = n;
            }
        }
        for(int i = 0; i< arr.length; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}