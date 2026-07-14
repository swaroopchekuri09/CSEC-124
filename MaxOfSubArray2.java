import java.util.*;
public class MaxOfSubArray2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){   
            arr[i]=sc.nextInt();
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                ans=Math.max(ans,sum);
            }
        }
        System.out.println(ans);
    }
}
