import java.util.Scanner;

public class ACM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 100010; // 假设数组大小最多为100010
        int[] w = new int[N];

        int n = scanner.nextInt(); // 读取数组大小
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt(); // 读取n个整数
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += w[i];
        }

        System.out.println(sum); // 输出元素和k
    /*
     * import java.util.Scanner;
     * public class Main{
     * public static void main(String args[]){
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * }
     * }
     */
}
