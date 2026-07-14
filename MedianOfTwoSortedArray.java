import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] merge = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            merge[k++] = arr1[i++];
        }
        while (j < n2) {
            merge[k++] = arr2[j++];
        }
        int n = merge.length;
        if (n % 2 == 0) {
            double median = (merge[n / 2 - 1] + merge[n / 2]) / 2.0;
            System.out.println(median);
        } else {
            System.out.println(merge[n / 2]);
        }
    }
}