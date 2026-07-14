import java.util.Scanner;
public class DivisionUsingBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (b == 0) {
            System.out.println("Division by zero is not possible");
            return;
        }
        double x = a, y = b;
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        double low = 0;
        double high = a;
        double mid = 0;
        double ans = 0;
        while (low <= high) {
            mid = (low + high) / 2.0;
            if (b * mid > a) {
                high = mid ;
            } 
            else if (b * mid < a) {
                low = mid;
            }
            else {
                ans = mid;
            }
        }
        if ((x < 0 && y > 0) || (x > 0 && y < 0)) {
            ans = -ans;
        }
        System.out.printf("%.5f", ans);
        sc.close();
    }
}